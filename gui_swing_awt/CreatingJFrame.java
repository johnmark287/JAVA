package gui_swing_awt;

import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CreatingJFrame {
    public static void main(String[] args) {
        final JFrame frame = new JFrame("My first Java Frame.");
        final Date date = new Date();
        final JButton button = new JButton("Get Date");
        final JTextField text = new JTextField("Hello");

		frame.setLocation(50, 100);
		frame.setSize(300, 200);
		frame.setVisible(true);

		System.out.println(date);
    }
}
