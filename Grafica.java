

/**
 * Classe Grafica che serve per creare il frame grafico e tutti i componenti usando la classe AWT.
 * Viene usato un JFrame (il main), un JPanel mainFrame che contiene tutti i componenti
 * un JPanel panel che contiene i pulsanti, un JPanel popUp che contiene una JLabel popText e il pulsante restart.
 * Vengono usati 10 pulsanti (9 per il gioco, 1 per il restart) JButton.
 */

import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;

public class Grafica {

    //Creazione degli elementi del frame grafico
    public JFrame main;

    public JPanel mainPanel = new JPanel();
    public JPanel panel;

    public JButton but1;
    public JButton but2;
    public JButton but3;
    public JButton but4;
    public JButton but5;
    public JButton but6;
    public JButton but7;
    public JButton but8;
    public JButton but9;

    public JPanel popUp;
    public JLabel popText;
    public JButton restart = new JButton("Restart");

    public JLabel vincitore;

    public void start() {

        //settaggio del frame 
        main = new JFrame("Tris - Lavoro PCTO");
        main.setVisible(true);

        //settaggio delle dimensioni del frame
        main.setSize(600,600);

        //posizione centrale del frame 
        main.setLocationRelativeTo(null);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //creazione dei panel
        panel = new JPanel();
        popUp = new JPanel();

        //creazione del testo del popUp
        popText = new JLabel();

        //Creazione dei pulsanti
        but1 = new JButton("1");
        but2 = new JButton("2");
        but3 = new JButton("3");
        but4 = new JButton("4");
        but5 = new JButton("5");
        but6 = new JButton("6");
        but7 = new JButton("7");
        but8 = new JButton("8");
        but9 = new JButton("9");

        //stile dei pulsanti
        aggiungiStile(but1);
        aggiungiStile(but2);
        aggiungiStile(but3);
        aggiungiStile(but4);
        aggiungiStile(but5);
        aggiungiStile(but6);
        aggiungiStile(but7);
        aggiungiStile(but8);
        aggiungiStile(but9);

        //aggiunta dei pulsanti al JPanel panel
        panel.add(but1);
        panel.add(but2);
        panel.add(but3);
        panel.add(but4);
        panel.add(but5);
        panel.add(but6);
        panel.add(but7);
        panel.add(but8);
        panel.add(but9);

        //settaggio layout del panel, viene usato GridLayout per formare una griglia 3x3
        panel.setLayout(new GridLayout(3,3));

        //stile e posizionamente del testo del popup
        popText.setFont(popText.getFont().deriveFont(Font.BOLD,24));
        popText.setHorizontalAlignment(JLabel.CENTER);

        //settaggio layout del popup; 
        //viene usato BorderLayout e il testo sarà messo al centro, mentre il pulsante in basso 
        popUp.setLayout(new BorderLayout());
        popUp.add(BorderLayout.CENTER,popText);
        popUp.add(BorderLayout.SOUTH, restart);

        //settaggio layout del mainPanel;
        //viene usato BorderLayout e il panel sarà messo al centro, mentre il panel del popup in basso 
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(BorderLayout.SOUTH, popUp);
        mainPanel.add(BorderLayout.CENTER, panel);

        main.add(mainPanel);
    }


    //metodo per l'aggiunta dello stile ai pulsanti
    public void aggiungiStile(JButton button) {
        button.setForeground(Color.WHITE);
        button.setBackground(Color.WHITE);
        Border line = new LineBorder(Color.BLACK);
        Border margin = new EmptyBorder(5, 15, 5, 15);
        Border compound = new CompoundBorder(line, margin);
        button.setBorder(compound);
        button.setFont(button.getFont().deriveFont(Font.BOLD,48));
    }
    
}
