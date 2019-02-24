import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.Random;

import javax.imageio.ImageIO;

public class Apple {
		BufferedImage appleImage;
		int x = Main.WIDTH;
		int y = 0;
		Random rand = new Random();
		
		public void initAppleImage()
		{
			
			try	{
				URL horse = this.getClass().getResource("apple.png");
				appleImage = ImageIO.read(horse);
			}
			catch(Exception e) {};	
			
			y = rand.nextInt(Main.HEIGHT-100)+50;
		}
		
		public void drawApple(Graphics g)
		{
			g.drawImage(appleImage, x, y, null);
		}
		
		public void scrollApple()
		{
			if(x > 0-appleImage.getWidth())
			{
				x-= Main.SCROLL_SPEED;
			}
			else 
				x = Main.WIDTH + rand.nextInt(Main.WIDTH);
		}
}
