
//Prima classe per permettere di usare i Thread

public class Utente1 extends Thread {
    public Buffer b;

    public Utente1(Buffer b) {
        this.b = b;
    }

    public void run() {
        while(true) {
            try {
                b.utente1();
            } catch (InterruptedException e) {
                //TODO: handle exception
            }
        }
    }

}
