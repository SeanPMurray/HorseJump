
import java.awt.Graphics;
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
		if (count < Main.SCROLL_SPEED) count ++;
		else 
		{
			if (frameX == 3 && frameY == 0) frameY ++;
			else if (frameX == 3 && frameY == 1) frameY --;
			if (frameX < 3) frameX ++;
			else frameX = 0;	
			count = 0;
		}
	}

	public void drawJumpPower(Graphics g)
	{
		g.drawString("Jump Power: " + jumpPower, 25, 25);
	}
	
	public void jump()
	{
		if(Game.jump) jumpPower ++;
		else if(!Game.jump && jumpPower > 0) jumpPower --;
		
		if(!Game.jump && jumpPower > 0 && y > 0) // Up
			y -= Main.SCROLL_SPEED;
		else if ((jumpPower == 0 || Game.jump) && y < 415) // Down
			y += Main.SCROLL_SPEED;
	}
}
