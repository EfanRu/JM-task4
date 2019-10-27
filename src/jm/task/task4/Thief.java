package jm.task.task4;

public class Thief implements MailService {
    private int minimalCount;
    private int sum;

    public Thief(int minimalCount) {
        this.minimalCount = minimalCount;
    }

    public int getStolenValue() {
        return sum;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail.getClass() != MailPackage.class) return mail;
        MailPackage fakeMailPack = new MailPackage(mail.getFrom(),
                mail.getTo(),
                new Package(String.format("stones instead of %s", ((MailPackage) mail).getContent()), 0));
        return fakeMailPack;
    }
}
