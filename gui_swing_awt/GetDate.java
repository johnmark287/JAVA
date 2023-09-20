package gui_swing_awt;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Container;

public class GetDate {
    public static void main(String[] args) {
        final JFrame frame = new JFrame("Get Date Program");
        final JTextField text = new JTextField("Hello", 35);
		final JButton button = new JButton("Get Date");
		final Container containerPane = frame.getContentPane();
		
		frame.setSize(100, 100);
		containerPane.add(text, BorderLayout.NORTH);
		containerPane.add(button, BorderLayout.NORTH);
		frame.pack();
		frame.setVisible(true);
    }
}
