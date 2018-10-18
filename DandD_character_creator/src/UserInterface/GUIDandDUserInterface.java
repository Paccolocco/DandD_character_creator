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
    private JPanel PanelInfoRaceSelectionMain;
    private JButton ConfirmToChooseRace_Elf;
    private JTextArea commonElfTraitsAbilityTextArea;
    private JButton ConfirmToChooseRace_Dwarf;
    private JTextArea commonDwarfTraitsAbilityTextArea;
    private JButton ConfirmToChooseRace_Halfling;
    private JTextArea textArea2;
    private JPanel HideAllOtherPanelsInRaceSelection;
    private JButton ConfirmToChooseRace_Human;
    private JTextArea textArea3;
    private JButton ConfirmToChooseRace_Dragonborne;
    private JTextArea textArea4;
    private JButton ConfirmToChooseRace_Gnome;
    private JTextArea textArea5;
    private JButton ConfirmToChooseRace_Half_Elf;
    private JTextArea textArea6;
    private JButton ConfirmToChooseRace_Half_Orc;
    private JTextArea textArea7;
    private JButton ConfirmToChooseRace_Tiefling;
    private JTextArea textArea8;
    private JPanel HideRaceSelectionInfo;

    //Creates Main Menu
    public static void main(String[] args) {
        JFrame frame1 = new JFrame("D&D Character Creator");
        frame1.setContentPane(new GUIDandDUserInterface().MainMenue);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame1.setLocationRelativeTo(null);
        frame1.setSize(1800,1800);
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
                hideAllRaceSelectionInfoBUT(0); //Hides all Race Info panels

            }
        });
    //Goes from the Main Page of race selection back to the start screen
        ButtonShowRaceInfo_GoBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ChooseRace.setVisible(false);
                hideAllRaceSelectionInfoBUT(0);

                MainMenu.setVisible(true);
            }
        });

        //
        //Calls for all Race Buttons in the Race Menu Screen
        //

        //Shows Dwarf Info
        ButtonShowRaceInfo_Dwarf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hideAllRaceSelectionInfoBUT(1);
            }
        });
        //Shows Elf Info
        ButtonShowRaceInfo_Elf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hideAllRaceSelectionInfoBUT(2);
            }
        });
        //Shows Halfling Info
        ButtonShowRaceInfo_Halfling.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hideAllRaceSelectionInfoBUT(3);
            }
        });
        //Shows Human Info
        ButtonShowRaceInfo_Human.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hideAllRaceSelectionInfoBUT(4);
            }
        });
        //Shows Dragonborn Info
        ButtonShowRaceInfo_Dragonborn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hideAllRaceSelectionInfoBUT(5);
            }
        });
        //Shows Gnome Info
        ButtonShowRaceInfo_Gnome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hideAllRaceSelectionInfoBUT(6);
            }
        });
        //Shows Half_Elf Info
        ButtonShowRaceInfo_Half_Elf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hideAllRaceSelectionInfoBUT(7);
            }
        });
        //Shows Half_Orc Info
        ButtonShowRaceInfo_Half_Orc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hideAllRaceSelectionInfoBUT(8);
            }
        });
        //Shows Tiefling Info
        ButtonShowRaceInfo_Tiefling.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hideAllRaceSelectionInfoBUT(9);
            }
        });
    }



    //Hides All Races but the selected one
    int doNotHideThisRace;
    public void hideAllRaceSelectionInfoBUT(int doNotHideThisRace){
        this.doNotHideThisRace = doNotHideThisRace;
        switch (doNotHideThisRace){
            case 0: //Hide All
               SetAllInfoTextsAtRSToInvisible();
               HideAllOtherPanelsInRaceSelection.setVisible(true);
                break;
            case 1: //Shows only Dwarf Panel (every following case does the same for the other races)
                SetAllInfoTextsAtRSToInvisible();
                PanelInfoTextandRaceSelection_Dwarf.setVisible(true);
                break;
            case 2:
                SetAllInfoTextsAtRSToInvisible();
                PanelInfoTextandRaceSelection_Elf.setVisible(true);
                break;
            case 3:
                SetAllInfoTextsAtRSToInvisible();
                PanelInfoTextandRaceSelection_Halfling.setVisible(true);
                break;
            case 4:
                SetAllInfoTextsAtRSToInvisible();
                PanelInfoTextandRaceSelection_Human.setVisible(true);
                break;
            case 5:
                SetAllInfoTextsAtRSToInvisible();
                PanelInfoTextandRaceSelection_Dragonborne.setVisible(true);
                break;
            case 6:
                SetAllInfoTextsAtRSToInvisible();
                PanelInfoTextandRaceSelection_Gnome.setVisible(true);
                break;
            case 7:
                SetAllInfoTextsAtRSToInvisible();
                PanelInfoTextandRaceSelection_Half_Elf.setVisible(true);
                break;
            case 8:
                SetAllInfoTextsAtRSToInvisible();
                PanelInfoTextandRaceSelection_Half_Orc.setVisible(true);
                break;
            case 9:
                SetAllInfoTextsAtRSToInvisible();
                PanelInfoTextandRaceSelection_Tiefling.setVisible(true);
                break;
        }

    }
    //RS = RaceSelection
    //Does what it's name says
    public void SetAllInfoTextsAtRSToInvisible(){
        PanelInfoTextandRaceSelection_Dwarf.setVisible(false);
        PanelInfoTextandRaceSelection_Elf.setVisible(false);
        PanelInfoTextandRaceSelection_Halfling.setVisible(false);
        PanelInfoTextandRaceSelection_Human.setVisible(false);
        PanelInfoTextandRaceSelection_Dragonborne.setVisible(false);
        PanelInfoTextandRaceSelection_Gnome.setVisible(false);
        PanelInfoTextandRaceSelection_Half_Elf.setVisible(false);
        PanelInfoTextandRaceSelection_Half_Orc.setVisible(false);
        PanelInfoTextandRaceSelection_Tiefling.setVisible(false);
    }

}
