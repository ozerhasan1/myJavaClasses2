public class Main {

    public static void main(String[] args) {
//        Baselogger[] loggers = new Baselogger[]{new Emaillogger(), new Filelogger(), new Databaselogger(), new Consolelogger()};
//        for (Baselogger logger : loggers) {
//            logger.log("log mesajı");
//
//        }
        Customermanager customermanager = new Customermanager(new Filelogger());
        customermanager.add();
    }
}
