import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;


public class Background {
	Image backgroundImage = Toolkit.getDefaultToolkit().getImage("background.jpg");
	int x,y;
	public Background(int placement)
	{
		x = placement;
		y = 50;
	}
	public void drawBackground(Graphics g)
	{
		g.drawImage(backgroundImage, x, y, null);
		
	}
	public void scrollBackground()
	{
		if(x > -1250)
		{
			x-= 2;
		}
		else 
			x = 1248;
	}
}
