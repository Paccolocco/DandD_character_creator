package resources;

import javax.swing.*;



public class GuiMainMenue {

    private JPanel MainMenue;
    private JTextArea WelcomeText;
    private JTextArea DisplayInfoMainMenue;
    private JButton exitButtonMainMenue;
    private JButton LoadExistingCharacter;
    private JButton CreateNewCharacter;
    private JTextArea CreateByText;

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
}
