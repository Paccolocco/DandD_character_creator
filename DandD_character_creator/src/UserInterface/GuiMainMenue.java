package UserInterface;

import resources.CreateCharacter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GuiMainMenue {

    private JPanel MainMenue;
    private JTextArea WelcomeText;
    private JButton CreateNewCharacter;
    private JTextField CreatedbyText;
    private JButton loadExistingCharacterButton;
    private JButton exitButton;



    public static void main(String[] args) {


        JFrame frame = new JFrame("D&D Character Creator");
        JFrame frame2 = new JFrame("D&D Character Creator");

        frame2.setContentPane(new RaceSelectionAndInfo().TestPanel);
        frame.setContentPane(new GuiMainMenue().MainMenue);

        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame2.pack();
        frame.pack();

        frame2.setSize(500,250);               //Größe und größeneinstellung
        frame2.setResizable(true);
        frame2.setLocationRelativeTo(frame);
        frame2.setVisible(true);


        frame.setSize(500,250);               //Größe und größeneinstellung
        frame.setResizable(true);
        frame.setLocationRelativeTo(frame2);
        frame.setVisible(true);




    }
    public GuiMainMenue () {
        CreateNewCharacter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}
