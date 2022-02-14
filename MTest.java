//classe main;

public class MTest {
    public static void main(String[] args) {
        Buffer b = new Buffer();

        Thread th1 = new Thread(new Utente1(b));
        Thread th2 = new Thread(new Utente2(b));

        th1.start();
        th2.start();
    }
}
