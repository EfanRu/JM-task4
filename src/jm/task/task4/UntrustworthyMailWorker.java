package jm.task.task4;

public class UntrustworthyMailWorker implements MailService {
    private RealMailService realMailService = new RealMailService();
    private MailService[] arrOfMailService;

    public UntrustworthyMailWorker(MailService[] arr) {
        arrOfMailService = arr;
    }

    public RealMailService getRealMailService() {
        return realMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        for (MailService ms : arrOfMailService) {
            mail = ms.processMail(mail);
        }
        return getRealMailService().processMail(mail);
    }
}
