package UserInterface;

import resources.CreateCharacter;

import javax.swing.*;

public class RaceSelectionAndInfo extends GuiMainMenue {

    private JPanel TestPanel;
    private JTextArea CreatedByText;
    private JTextArea InfoTextRace;

    public static void Second(){
            JFrame frame = new JFrame("D&D Character Creator");
            frame.setContentPane(new RaceSelectionAndInfo().TestPanel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();


            frame.setSize(500,250);               //Größe und größeneinstellung
            frame.setResizable(true);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);


        }
}


