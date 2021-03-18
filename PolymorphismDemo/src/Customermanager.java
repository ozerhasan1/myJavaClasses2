public class Customermanager extends Baselogger {
    private Baselogger logger;
    public Customermanager (Baselogger logger) {
        this.logger = logger;

    }
    public void add() {
        System.out.println("Müşteri eklendi");
    this.logger.log("log mesajı");
    }
}