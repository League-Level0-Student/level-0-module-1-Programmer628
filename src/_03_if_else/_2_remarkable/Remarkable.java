package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
	String Blake = " you can design 3d schematics";
	String John = "John you can play the Piano!";
	String Gabby = "Gabby you can play the Violin!";
		// 2. Ask the user to enter a name. Store their answer in a variable.
	String user = JOptionPane.showInputDialog("What is your name?");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
	if (user .equals("Blake")){
		JOptionPane.showMessageDialog(null, "Blake" + Blake + "!");
	} else if(user .equals("John")) {
		JOptionPane.showMessageDialog(null, John);
	} else if(user .equals("Gabby")) {
		JOptionPane.showMessageDialog(null, Gabby);
	} else {
		JOptionPane.showMessageDialog(null, "Name not registered sorry :(" );
	}
	}
}

