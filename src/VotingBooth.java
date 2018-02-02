import javax.swing.JOptionPane;

public class VotingBooth {
		public static void main(String[] args) {

		String vote = JOptionPane.showInputDialog(null, "How old are you?");
		int Age = Integer.parseInt(vote);
		if (Age > 17) {JOptionPane.showMessageDialog(null, "You can vote");}
		else if (Age < 18) {JOptionPane.showMessageDialog(null, "You can't vote");}	
		
		
		}		
}		
	