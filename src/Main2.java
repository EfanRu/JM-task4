import org.w3c.dom.ls.LSOutput;

import java.math.BigInteger;
import java.util.*;
import java.util.logging.Logger;

public class Main2 {
    public static void main(String[] args) {
    }

    public static class Test {

    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) throws Exception {
        // your implementation here
        int attempt = 0; String
        boolean reachTarget = false;

        while (reachTarget || attempt == 2) {
            attempt++;
            try (RobotConnection rc = robotConnectionManager.getConnection()) {
                rc.moveRobotTo(toX, toY);
                reachTarget = true;
            } catch (RobotConnectionException e) {}
        }
        if (attempt == 2 && reachTarget == false) {
            throw new RobotConnectionException();
        }
    }
}