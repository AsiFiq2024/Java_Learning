import java.util.Scanner;

public class multthread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Thread thread1 = new Thread(new MyRunnable("Ping"));
        Thread thread2 = new Thread(new MyRunnable("Pong"));

        //thread1.setDaemon(true);
        //thread2.setDaemon(true);

        thread1.start();
        thread2.start();

        scanner.close();
    }
}
