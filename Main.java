import javax.swing.JFrame;


public class Main {
	final static int HEIGHT = 640,
			  	WIDTH = 640;
	
	public static void main(String args[]){
		JFrame frame = new JFrame("Horse Jump V.0001");
		frame.add(new Game());
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);	
	}
}