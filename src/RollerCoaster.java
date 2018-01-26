import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
		
		String rollercoaster = JOptionPane.showInputDialog(null, "How tall are you (in inches)?");
		int height = Integer.parseInt(rollercoaster);
		if (height > 48) {JOptionPane.showMessageDialog(null, "You can go on the Rollercoaster");}
		else if (height < 49) {JOptionPane.showMessageDialog(null, "You need to grow more");}
		
		
		
		
	
		
		
	}
}