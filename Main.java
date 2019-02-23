import javax.swing.JFrame;


public class Main {
	final static int HEIGHT = 600,
			  WIDTH = 800;
	
	public static void main(String args[]){
		JFrame frame = new JFrame("Game With Tristan :)       V .00000006");
		frame.add(new Game());
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);	
	}
}