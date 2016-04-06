package day3;

import javax.swing.JOptionPane;

public class Money {
public static void main(String[] args) {

	String   name=JOptionPane.showInputDialog("What's your name?");
	JOptionPane.showInputDialog("Hello" +name);
   String  address=JOptionPane.showInputDialog(null, "What's your address?");
   JOptionPane.showConfirmDialog(null, "So it's"+address);
	 JOptionPane.showInputDialog("What is your favorite brand of water?");
	JOptionPane.showConfirmDialog(null, "I like Fiji.");
String location=JOptionPane.showInputDialog("Where are you right now?");
	JOptionPane.showConfirmDialog( null, "So right now you are at"+location);
	JOptionPane.showConfirmDialog(null," Why arent you at" +address);
	JOptionPane.showConfirmDialog(null,"I am always watching you.");
	
	
	
	
	
}	
}
