package UserInterface;

import resources.CreateCharacter;

import javax.swing.*;

public class RaceSelectionAndInfo {

    public JPanel TestPanel;
    private JTextArea CreatedByText;
    private JTextArea InfoTextRace;

    public void setTestPanel(JPanel testPanel) {
        TestPanel = testPanel;
    }

    public JPanel getTestPanel() {
        return TestPanel;
    }
}
   /** public void Second(){
            JFrame frame2 = new JFrame("D&D Character Creator");
            frame2.setContentPane(new RaceSelectionAndInfo().TestPanel);
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame2.pack();


            frame2.setSize(500,250);               //Größe und größeneinstellung
            frame2.setResizable(true);
            frame2.setLocationRelativeTo(frame2);
            frame2.setVisible(true);
            return;




        }
}

    */