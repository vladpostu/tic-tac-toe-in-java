
//Prima classe per permettere di usare i Thread

public class Utente2 extends Thread {
    public Buffer b;

    public Utente2(Buffer b) {
        this.b = b;
    }

    public void run() {
        while(true) {
            try {
                b.utente2();
            } catch (InterruptedException e) {
                //TODO: handle exception
            }
        }
    }

}
