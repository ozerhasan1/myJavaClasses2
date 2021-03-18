public class Consolelogger extends Baselogger {
    public void log(String message) {
        System.out.println("logged to console :"+message);
    }
}