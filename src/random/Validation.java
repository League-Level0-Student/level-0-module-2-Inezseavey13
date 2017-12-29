//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. OPTIONAL: Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		
		// 2. On paper, write all the numbers that get printed when you run this class 10 times
		for (int i = 0; i < 4; i++) {
			int randomNumber = new Random().nextInt(5);
			System.out.println(randomNumber);
		// 3. Use each value of randomNumber to give the user a random compliment.
		if (randomNumber == 1) {JOptionPane.showMessageDialog(null, "You're a smart cookie");
		} else if (randomNumber == 2)  {
			JOptionPane.showMessageDialog(null, "Your smile is contagious");
		} else if (randomNumber == 3)  {
			JOptionPane.showMessageDialog(null, "You have nice elbows!");
		} else if (randomNumber == 4)  {
			JOptionPane.showMessageDialog(null, "You are awesome");
		} else if (randomNumber == 0)  {
			JOptionPane.showMessageDialog(null, "I bet you sweat glitter");
		} 
		}
		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}
}
//1,0,3,3,2,1,1,4,3,4