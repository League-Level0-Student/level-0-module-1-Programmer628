package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle = JOptionPane.showInputDialog("What 5-letter word typed in all capital letters can be read the same upside down?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(riddle .equals("SWIMS")) {
			score =+ 1;
			JOptionPane.showMessageDialog(null, "You are correct!");
			JOptionPane.showMessageDialog(null, "Your score is " +score+ ".");
		} else {
			JOptionPane.showMessageDialog(null, "Sorry that isn't the correct answer.");
			String yes = JOptionPane.showInputDialog("Do you want to try again. yes/no");
		
		
		// 5. Otherwise, say "wrong" and tell them the answer
		if( yes .equals("yes")) {
			String riddle2 = JOptionPane.showInputDialog("What 5-letter word typed in all capital letters can be read the same upside down?");
			if(riddle2 .equals("SWIMS")) {
				score =+ 1;
				JOptionPane.showMessageDialog(null, "You are correct!");
				JOptionPane.showMessageDialog(null, "Your score is " +score+ ".");
			} else {
				JOptionPane.showMessageDialog(null, "Sorry that isn't the correct answer. You have run out of tries your score is 0 the correct answer was SWIMS.");
		}
		} else if(yes .equals("no")) {
			JOptionPane.showMessageDialog(null, "The correct answer was SWIMS, thanks for playing!");
		}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		}
		
	}
}

