import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlusMinus {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        JTextField text = new JTextField("0");
        JButton button1 = new JButton("+");
        JButton button2 = new JButton("-");
        JButton button3 = new JButton("Reset");


        button1.setBounds(230, 210, 110, 30);
        button1.setFocusable(false);
        button1.setFont(new Font("Poppins", Font.PLAIN, 20));
        button2.setBounds(340, 210, 120, 30);
        button2.setFont(new Font("Poppins", Font.PLAIN, 20));
        button3.setBounds(280, 260, 150, 30);
        button3.setFocusable(false);
        button3.setFont(new Font("Poppins", Font.PLAIN, 20));
        text.setBounds(70, 210, 150, 30);
        text.setFont(new Font("Poppins", Font.PLAIN, 18));

        frame.add(button3);
        frame.add(button2);
        frame.add(button1);
        frame.add(text);

        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button1) {
                    int n = Integer.parseInt(text.getText());
                    n++;
                    text.setText(n + "");
                }
            }
        });

        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button2) {
                    int n = Integer.parseInt(text.getText());
                    n--;
                    text.setText(n + "");
                }
            }
        });

        button3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button3) {
                    text.setText("0");
                }
            }
        });

        frame.setSize(500, 500);
        frame.setTitle("PlusMinus");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
