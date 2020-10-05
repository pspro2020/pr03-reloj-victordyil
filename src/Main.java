import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Reloj());
        thread.start();
        TimeUnit.SECONDS.sleep(12);
        thread.interrupt();
    }
}
