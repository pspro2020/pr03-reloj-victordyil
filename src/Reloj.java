import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Reloj implements Runnable {
    private DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){

            System.out.println(LocalDateTime.now().format(format));
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("Me han interrumpido!");
                return;
            }

        }
        System.out.println("El hilo secundario ya ha termindado de ejecutarse");
    }
}
