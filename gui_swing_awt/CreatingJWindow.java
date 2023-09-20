package gui_swing_awt;

import javax.swing.JWindow;

public class CreatingJWindow {
	public static void main(String[] args) {
		final JWindow window = new JWindow();
		window.setLocation(100, 50);
		window.setSize(500, 500);
		window.setVisible(true);
	}
}
