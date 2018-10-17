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
    private JButton ButtonShowRaceInfo_GoBack;
    private JButton ButtonShowRaceInfo_Tiefling;
    private JButton ButtonShowRaceInfo_Dwarf;
    private JButton ButtonShowRaceInfo_Elf;
    private JButton ButtonShowRaceInfo_Halfling;
    private JButton ButtonShowRaceInfo_Half_Orc;
    private JButton ButtonShowRaceInfo_Half_Elf;
    private JButton ButtonShowRaceInfo_Gnome;
    private JButton ButtonShowRaceInfo_Human;
    private JButton ButtonShowRaceInfo_Dragonborn;
    private JPanel PanelInfoTextandRaceSelection_Dwarf;
    private JPanel PanelInfoTextandRaceSelection_Elf;
    private JPanel PanelInfoTextandRaceSelection_Halfling;
    private JPanel PanelInfoTextandRaceSelection_Human;
    private JPanel PanelInfoTextandRaceSelection_Dragonborne;
    private JPanel PanelInfoTextandRaceSelection_Gnome;
    private JPanel PanelInfoTextandRaceSelection_Half_Elf;
    private JPanel PanelInfoTextandRaceSelection_Half_Orc;
    private JPanel PanelInfoTextandRaceSelection_Tiefling;

    //Creates Main Menu
    public static void main(String[] args) {
        JFrame frame1 = new JFrame("D&D Character Creator");
        frame1.setContentPane(new GUIDandDUserInterface().MainMenue);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame1.setLocationRelativeTo(null);
        frame1.setSize(1800,1500);
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
    //Goes from the Main Page of race selection back to the start screen
        ButtonShowRaceInfo_GoBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ChooseRace.setVisible(false);
                MainMenu.setVisible(true);
            }
        });
    }

}
