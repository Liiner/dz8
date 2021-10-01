import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    private int counter;
    public static void main(String[] args) {
        new MyWindow();
    }
    public MyWindow(){
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds( 200,  200, 300, 100);

        JButton button1 = new JButton(" < ");
        JButton button2 = new JButton(" > ");
        JLabel label1 = new JLabel();
        label1.setHorizontalAlignment(SwingConstants.CENTER);

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                label1.setText(String.valueOf(counter));
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter--;
                label1.setText(String.valueOf(counter));
            }
        });

        add(label1, BorderLayout.CENTER);
        add(button1, BorderLayout.WEST);
        add(button2, BorderLayout.EAST);

        setVisible(true);
    }
}
