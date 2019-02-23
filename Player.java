
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
public  class Player {

	boolean grounded = true;
	long count = 0;
	final int x = 100;
	int y = 415;
	int jumpPower = 0;
	BufferedImage playerImage;
	
	public void initPlayerImage()
	{
		
		try	{
			URL horse = this.getClass().getResource("Horse_Running.png");
			playerImage = ImageIO.read(horse);
		}
		catch(Exception e) {};	
	}
	public void drawPlayer(Graphics g)
	{
		g.drawImage(playerImage.getSubimage( 0, 0, 300, 300), x, y, null);

	}
	
	public void jump()
	{
		if(Game.jump && y >= 0)
			jumpPower += 2;
		else if (!Game.jump && jumpPower > 0)
		{
			y -= 10;
			jumpPower --;
		}
		else if(!Game.jump && jumpPower == 0 && y < 415)
		{
			y += 10;
		} 
	}
}
