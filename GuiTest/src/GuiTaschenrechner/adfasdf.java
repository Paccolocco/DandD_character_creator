package GuiTaschenrechner;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class adfasdf {
    private JPanel henlo;
    private JList list1;
    private JButton nextButton;
    private JPanel henlo2;
    private JButton Gotonextpage;

    public adfasdf() {
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame2 = new JFrame("ADFASDF");
                frame2.setContentPane(new adfasdf().henlo2);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.pack();
                frame2.setVisible(true);


            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("adfasdf");
        frame.setContentPane(new adfasdf().henlo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }

}

