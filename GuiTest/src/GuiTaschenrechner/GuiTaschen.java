package GuiTaschenrechner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiTaschen extends JFrame {

    private JLabel Operator1;           //Label/Überschriften
    private JLabel Operator2;
    private JLabel Operator3;

    private JTextField Text1;           //Textfelder
    private JTextField Text2;

    private JButton Button;             //Button

    private String Operator;

    public GuiTaschen(String titel, String Operator){

        this.Operator = Operator;

        setTitle(titel);                            //Titel wird gesetzt
        setDefaultCloseOperation(EXIT_ON_CLOSE);    //Kreuz oben rechts

        setLayout(new FlowLayout());                //Layout definnieren

        setSize(1920,1080);               //Größe und größeneinstellung
        setResizable(true);

        initiateComponents();//Komponenten initalisieren

        add(Operator1);             //Reihenfolge wird bestimmt
        add(Operator2);
        add(Text1);
        add(Operator3);
        add(Text2);
        add(Button);

        setLocationRelativeTo(null);                //null = Fenster wird in der Mitte vom Bildschirm angezeigt
        setVisible(true);                           // Fenster sichtbar
    }
    private void initiateComponents(){
        Operator1 = new JLabel("Zahl1\t");        //Label werden benannt
        Operator2 = new JLabel("Zahl2                              ");

        Operator3 = new JLabel(Operator);            //Operator wird der varibale String Operator übergeben

        Text1 = new JTextField(8);          //länge der Textfelder
        Text2 = new JTextField(8);

        Button = new JButton("Berechnung!");    //beschriftung des Buttons
        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int Zahl1 = Integer.parseInt(Text1.getText());
                int Zahl2 = Integer.parseInt(Text2.getText());

                int ergebnis;

                if(Operator.equals("+")){
                    ergebnis = Zahl1+Zahl2;
                }else if(Operator.equals("-")){
                    ergebnis = Zahl1-Zahl2;
                }else if(Operator.equals("*")){
                    ergebnis = Zahl1*Zahl2;
                }else if(Operator.equals("/")){
                    ergebnis = Zahl1/Zahl2;
                }else {
                    ergebnis = Integer.MAX_VALUE;
                }
                JOptionPane.showMessageDialog(GuiTaschen.this,"Ergebnis "+ergebnis, "Berechnung", JOptionPane.INFORMATION_MESSAGE);

                Text1.setText("");
                Text2.setText("");
            }
        });

    }

}
