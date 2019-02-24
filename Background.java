import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;


public class Background {
	Image backgroundImage = Toolkit.getDefaultToolkit().getImage("background.jpg");
	int x1 = 0;
	int x2 = Main.WIDTH;
	int y = 50;

	public void drawBackground(Graphics g)
	{
		g.drawImage(backgroundImage,x1,y,x1+Main.WIDTH, Main.HEIGHT, 0, y,Main.WIDTH,Main.HEIGHT-y, null);
		g.drawImage(backgroundImage,x2,y,x2+Main.WIDTH, Main.HEIGHT, Main.WIDTH, y,0,Main.HEIGHT-y, null);
		
	}
	public void scrollBackground()
	{
		if(x1 > -Main.WIDTH)
		{
			x1-= Main.SCROLL_SPEED;
		}
		else 
			x1 = x2 + Main.WIDTH - 5;
		if(x2 > -Main.WIDTH)
		{
			x2-= Main.SCROLL_SPEED;
		}
		else 
			x2 = x1 + Main.WIDTH;
	}
}
