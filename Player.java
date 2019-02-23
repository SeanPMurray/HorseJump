
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
public  class Player {

	final int x = 100;
	int y = 415;
	int jumpPower = 0;
	int frameX = 0;
	int frameY = 0;
	int count = 0;
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
		g.drawImage(playerImage.getSubimage(300*frameX, 300*frameY, 300, 300), x, y, null);
		if (count < 6) count ++;
		else 
		{
			if (frameX == 3 && frameY == 0) frameY ++;
			else if (frameX == 3 && frameY == 1) frameY --;
			if (frameX < 3) frameX ++;
			else frameX = 0;	
			count = 0;
		}
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
