import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.Random;

import javax.imageio.ImageIO;

public class Obstacle {
	BufferedImage obstacleImage;
	int x = Main.WIDTH;
	int y = 0;
	Random rand = new Random();
	
	public void initObstacleImage()
	{
		
		try	{
			URL horse = this.getClass().getResource("logpile.png");
			obstacleImage = ImageIO.read(horse);
		}
		catch(Exception e) {};	
		
		y = Main.HEIGHT-obstacleImage.getHeight()-25;
	}
	
	public void drawObstacle(Graphics g)
	{
		g.drawImage(obstacleImage, x, y, null);
	}
	
	public void scrollObstacle()
	{
		if(x > 0-obstacleImage.getWidth())
		{
			x-= Main.SCROLL_SPEED;
		}
		else 
			x = Main.WIDTH + rand.nextInt(Main.WIDTH);
	}
}
