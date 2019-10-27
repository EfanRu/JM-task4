package jm.task.task4;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Spy implements MailService {
    private Logger log ;

    public Spy(Logger logger) {
        log = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail.getClass() != MailMessage.class) {
            return mail;
        }
        if (mail.getFrom() == "Austin Powers" ||
            mail.getTo() == "Austin Powers") {
            log.log(Level.WARNING,
                    String.format("Detected target mail correspondence: from %s to %s \"%s\"",
                            mail.getFrom(),
                            mail.getTo(),
                            ((MailMessage) mail).getMessage()));
        } else {
            log.log(Level.INFO,
                    String.format("Usual correspondence: from %s to %s",
                            mail.getFrom(),
                            mail.getTo()));
        }
        return mail;
    }
}
