import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryTicket {
	public static void main(String[] args) {
		Random number = new Random(); 
		String Lottery = "";
	

	                                                                                                                                                                               
		for (int i = 0; i < 5; i++) {
			int num = number.nextInt(60);

			Lottery += num;
			Lottery += " ";
		
		}
		JOptionPane.showMessageDialog(null, Lottery,"Lottery Ticket",JOptionPane.INFORMATION_MESSAGE );
	}

}