package GuiTaschenrechner;

import javax.swing.*;

public class GUIUIUI {
    private JPanel ay;
    private JTextArea itWorkedTextArea;

    public static void main() {
        JFrame frame = new JFrame("GUIUIUI");
        frame.setContentPane(new GUIUIUI().ay);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public void setAy(JPanel ay) {
        this.ay = ay;

    }

    public JPanel getAy() {
        return ay;
    }
}

