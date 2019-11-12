package jm.task.task6;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sentable<T>> {
    private Map<String, List<T>> mailBox = new HashMap<>();

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    @Override
    public void accept(Sentable<T> mail) {
        if (mailBox.containsKey(mail.getTo())) {
            mailBox.get(mail.getTo()).add(mail.getContext());
        } else {
            mailBox.put(mail.getTo(), new LinkedList<T>());
            mailBox.get(mail.getTo()).add(mail.getContext());
        }
    }
}
