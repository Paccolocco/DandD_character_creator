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
        frame.setContentPane(new GuiMainMenue().MainMenue);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();


        frame.setSize(500,250);               //Größe und größeneinstellung
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
    public GuiMainMenue () {
        CreateNewCharacter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               RaceSelectionAndInfo.Second();
            }
        });
    }

}
