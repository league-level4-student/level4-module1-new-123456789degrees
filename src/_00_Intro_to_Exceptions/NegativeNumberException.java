package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeNumberException extends Exception{
	public void scaryPopup() {
		JOptionPane.showMessageDialog(null, "You just triggered a critical error in your computer.");
	}
}
