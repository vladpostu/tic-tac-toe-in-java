
/**
 * @author Vlad Postu
 * Classe Buffer che serve per la condivisione dello stato tra i due thread sincronizzati
 */


import java.awt.event.*;
import java.awt.*;

//la classe Buffer estende Grafica per il frame grafico e implemente ActionListener per l'uso dei pulsanti

public class Buffer extends Grafica implements ActionListener {
    private int state;

    /**
     * Viene istanziata una matrice di stringhe che servirà per decidere il vincitore.
     * Gli elementi della matrice sono String e non char per comodità e per evitare incogruenze 
     * tra gli elementi della matrice e il testo del pulsante premuto
     */
    private String[][] griglia = new String[3][3];

    public Buffer() {
        this.state = 0;

        //viene chiamato il metodo start della classe Grafica che lancia il frame grafico
        start();

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                griglia[i][j] = "";
            }
        }

        //aggiunta dei actionListener su ogni pulsante
        but1.addActionListener(this);
        but2.addActionListener(this);
        but3.addActionListener(this);
        but4.addActionListener(this);
        but5.addActionListener(this);
        but6.addActionListener(this);
        but7.addActionListener(this);
        but8.addActionListener(this);
        but9.addActionListener(this);
        restart.addActionListener(this);
    }

    //metodo syncronized del primo utente
    public synchronized void utente1() throws InterruptedException {
        while(state != 0) {
            wait();
            //aspetta...
        }

        notifyAll();

    }

    //metodo syncronized del secondo utente
    public synchronized void utente2() throws InterruptedException {
        while(state != 1) {
            wait();
            //aspetta
        }
        notifyAll();
    }
    

    //Gestione degli eventi con un ciclo switch
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();

        /**
         * 
         * In base alla variabile state (0 == X | 1 == O) verrà modificato il testo del 
         * pulsante premuto.
         * 
         * Ogni volta che viene premuto un pulsante verrà effettuato un controllo 
         * (con i metodi checkVittoriaX e checkVittoriaY) per decretare un eventuale vincitore.
         * 
         * In contemporanea in base al numero del pulsante (ottenuto con il metodo getActionCommand) e allo 
         * state viene modificata una matrice di String[3][3], dove verrà aggiunto "x" o "o";
         */

        switch(str) {
            case "1":
                if(state == 0) {
                    but1.setText("X");
                    state = 1;
                    griglia[0][0] = "x";
                    but1.setForeground(Color.RED);
                    checkVittoriaX("x");
                    checkVittoriaY("x");
                    checkPareggio();
                } else if(state == 1){
                    but1.setText("O");
                    state = 0;
                    griglia[0][0] = "o";
                    but1.setForeground(Color.BLUE);
                    checkVittoriaX("o");
                    checkVittoriaY("o");
                    checkPareggio();
                }
                break;

            case "2":
                if(state == 0) {
                    but2.setText("X");
                    state = 1;
                    griglia[0][1] = "x";
                    but2.setForeground(Color.RED);
                    checkVittoriaX("x");
                    checkVittoriaY("x");
                    checkPareggio();
                } else if(state == 1){
                    but2.setText("O");
                    state = 0;
                    griglia[0][1] = "o";
                    but2.setForeground(Color.BLUE);
                    checkVittoriaX("o");
                    checkVittoriaY("o");
                    checkPareggio();
                }
                break;

            case "3":
                if(state == 0) {
                    but3.setText("X");
                    state = 1;
                    griglia[0][2] = "x";
                    but3.setForeground(Color.RED);
                    checkVittoriaX("x");
                    checkVittoriaY("x");
                    checkPareggio();
                } else if(state == 1){
                    but3.setText("O");
                    state = 0;
                    griglia[0][2] = "o";
                    but3.setForeground(Color.BLUE);
                    checkVittoriaX("o");
                    checkVittoriaY("o");
                    checkPareggio();
                }
                break;

            case "4":
                if(state == 0) {
                    but4.setText("X");
                    state = 1;
                    griglia[1][0] = "x";
                    but4.setForeground(Color.RED);
                    checkVittoriaX("x");
                    checkVittoriaY("x");
                    checkPareggio();
                } else if(state == 1){
                    but4.setText("O");
                    state = 0;
                    griglia[1][0] = "o";
                    but4.setForeground(Color.BLUE);
                    checkVittoriaX("o");
                    checkVittoriaY("o");
                    checkPareggio();
                }
                break;

            case "5":
                if(state == 0) {
                    but5.setText("X");
                    state = 1;
                    griglia[1][1] = "x";
                    but5.setForeground(Color.RED);
                    checkVittoriaX("x");
                    checkVittoriaY("x");
                    checkPareggio();
                } else if(state == 1){
                    but5.setText("O");
                    state = 0;
                    griglia[1][1] = "o";
                    but5.setForeground(Color.BLUE);
                    checkVittoriaX("o");
                    checkVittoriaY("o");
                    checkPareggio();
                }
                break;

            case "6":
                if(state == 0) {
                    but6.setText("X");
                    state = 1;
                    griglia[1][2] = "x";
                    but6.setForeground(Color.RED);
                    checkVittoriaX("x");
                    checkVittoriaY("x");
                    checkPareggio();
                } else if(state == 1){
                    but6.setText("O");
                    state = 0;
                    griglia[1][2] = "o";
                    but6.setForeground(Color.BLUE);
                    checkVittoriaX("o");
                    checkVittoriaY("o");
                    checkPareggio();
                }
                break;
        
            case "7":
                if(state == 0) {
                    but7.setText("X");
                    state = 1;
                    griglia[2][0] = "x";
                    but7.setForeground(Color.RED);
                    checkVittoriaX("x");
                    checkVittoriaY("x");
                    checkPareggio();
                } else if(state == 1){
                    but7.setText("O");
                    state = 0;
                    griglia[2][0] = "o";
                    but7.setForeground(Color.BLUE);
                    checkVittoriaX("o");
                    checkVittoriaY("o");
                    checkPareggio();
                }
                break;

            case "8":
                if(state == 0) {
                    but8.setText("X");
                    state = 1;
                    griglia[2][1] = "x";
                    but8.setForeground(Color.RED);
                    checkVittoriaX("x");
                    checkVittoriaY("x");
                    checkPareggio();
                } else if(state == 1){
                    but8.setText("O");
                    state = 0;
                    griglia[2][1] = "o";
                    but8.setForeground(Color.BLUE);
                    checkVittoriaX("o");
                    checkVittoriaY("o");
                    checkPareggio();
                }
                break;

            case "9":
                if(state == 0) {
                    but9.setText("X");
                    state = 1;
                    griglia[2][2] = "x";
                    but9.setForeground(Color.RED);
                    checkVittoriaX("x");
                    checkVittoriaY("x");
                    checkPareggio();

                } else if(state == 1){
                    but9.setText("O");
                    state = 0;
                    griglia[2][2] = "o";
                    but9.setForeground(Color.BLUE);
                    checkVittoriaX("o");
                    checkVittoriaY("o");
                    checkPareggio();
                }

                break;

            case "Restart":
                restart();  

                break;
                
        }   
    }


    //algoritmo per trovare un combinazione vincente sull'asse orizzontale e obliquo
        public void checkVittoriaX(String c) {
            for(int i=0; i<=2; i++) {
                if(griglia[i][0] == c) {
                    if(griglia[i][1] == c) {
                        if(griglia[i][2] == c) {
                            if(state == 1) {
                                popText.setText("L'UTENTE 1 - CROCE HA VINTO");
                                stop();
                               } else if(state == 0) {
                                popText.setText("L'UTENTE 2 - CERCHIO HA VINTO");
                                stop();
                        }
                    }
                }
            }

            if(griglia[0][0] == c) {
                if(griglia[1][1] == c) {
                    if(griglia[2][2] == c) {
                        if(state == 1) {
                            popText.setText("L'UTENTE 1 - CROCE HA VINTO");
                            stop();
                        } else if(state == 0) {
                            popText.setText("L'UTENTE 2 - CERCHIO HA VINTO");
                            stop();
                        }
                        }
                    }
                }
            }
        }

    //algoritmo per trovare un combinazione vincente sull'asse verticale e l'altro obliquo
    public void checkVittoriaY(String c) {
        for(int i=0; i<=2; i++) {
            if(griglia[0][i] == c) {
                if(griglia[1][i] == c) {
                    if(griglia[2][i] == c) {
                        if(state == 1) {
                            popText.setText("L'UTENTE 1 - CROCE HA VINTO");
                            stop();
                        } else if(state == 0) {
                            popText.setText("L'UTENTE 2 - CERCHIO HA VINTO");
                            stop();
                        }
                    }
                }
            }
        }

        if(griglia[0][2] == c) {
            if(griglia[1][1] == c) {
                if(griglia[2][0] == c) {
                    if(state == 1) {
                        popText.setText("L'UTENTE 1 - CROCE HA VINTO");
                        stop();
                    } else if(state == 0) {
                        popText.setText("L'UTENTE 2 - CERCHIO HA VINTO");
                        stop();
                    }
                }
            }
        }
    }

    public void stop() {
        but1.setEnabled(false);
        but2.setEnabled(false);
        but3.setEnabled(false);
        but4.setEnabled(false);
        but5.setEnabled(false);
        but6.setEnabled(false);
        but7.setEnabled(false);
        but8.setEnabled(false);
        but9.setEnabled(false);
    }

    //algoritmo per permettere di decretare un eventuale pareggio
    public void checkPareggio() {
        int varPareggio = 0;
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if(griglia[i][j] != "") {
                    varPareggio++;
                }
            }
        }

        if(varPareggio == 9) {
            popText.setText("Nessun giocatore ha vinto - Pareggio");
            stop();
        }
    }

    //metodo restart per permettere all'utente di ritornare alla situazione di partenza
    public void restart() {
        but1.setForeground(Color.WHITE);
        but2.setForeground(Color.WHITE);
        but3.setForeground(Color.WHITE);
        but4.setForeground(Color.WHITE);
        but5.setForeground(Color.WHITE);
        but6.setForeground(Color.WHITE);
        but7.setForeground(Color.WHITE);
        but8.setForeground(Color.WHITE);
        but9.setForeground(Color.WHITE);

        but1.setText("1");
        but2.setText("2");
        but3.setText("3");
        but4.setText("4");
        but5.setText("5");
        but6.setText("6");
        but7.setText("7");
        but8.setText("8");
        but9.setText("9");

        popText.setText("");
        
        this.state = 0;

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                griglia[i][j] = "";
            }
        }
        but1.setEnabled(true);
        but2.setEnabled(true);
        but3.setEnabled(true);
        but4.setEnabled(true);
        but5.setEnabled(true);
        but6.setEnabled(true);
        but7.setEnabled(true);
        but8.setEnabled(true);
        but9.setEnabled(true);
    }
}


