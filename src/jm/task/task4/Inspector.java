package jm.task.task4;

public class Inspector implements MailService {
    @Override
    public Sendable processMail(Sendable mail) {
        if (mail.getClass() != MailPackage.class) return mail;

        Package checkPack = ((MailPackage) mail).getContent();

        if (checkPack.getContent().contains("weapons") ||
            checkPack.getContent().contains("banned substance")) {
            throw new IllegalPackageException();
        }
        if (checkPack.getContent().contains("stones")) {
            throw new StolenPackageException();
        }
        return mail;
    }
}
