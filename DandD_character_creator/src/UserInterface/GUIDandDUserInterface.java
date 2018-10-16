package UserInterface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIDandDUserInterface {


    private JPanel MainMenue;
    private JPanel MainMenu;
    private JPanel ChooseRace;

    private JTextArea WelcomeText;
    private JButton ExitButton;
    private JButton LoadExistingCharacterButton;
    private JButton CreateNewCharacterButton;
    private JTextArea CreatedByText;
    private JTextField ChooseYourRaceInfoText;

    //Creates Main Menu
    public static void main(String[] args) {
        JFrame frame1 = new JFrame("D&D Character Creator");
        frame1.setContentPane(new GUIDandDUserInterface().MainMenue);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.pack();
        frame1.setVisible(true);
    }

    //Goes to the Main Page of race selection
    public GUIDandDUserInterface() {
        CreateNewCharacterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainMenu.setVisible(false);
                ChooseRace.setVisible(true);
            }
        });
    }

}
