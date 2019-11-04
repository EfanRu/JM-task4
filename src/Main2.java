import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.logging.Logger;

public class Main2 {
    public static void main(String[] args) {
        double sum = 0.0;
        try (Scanner reader = new Scanner(new InputStreamReader(System.in))) {
            while (reader.hasNext()) {
                try {
                    sum += Double.parseDouble(reader.next());
                } catch (Exception ex) {}
            }
            System.out.format(Locale.US, "%.6f", sum);
        } catch (Exception e) {}
    }
}