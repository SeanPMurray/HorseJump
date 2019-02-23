import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Player {

	boolean grounded = true;
	long count = 0;
	final int x = 100;
	int y = 500;
	int jumpPower = 0;
	Image playerImages = Toolkit.getDefaultToolkit().getImage("Images/NinjaFirstEddition.png");
	
	public void drawPlayer(Graphics g)
	{
		if(y == 500 && !Game.jump){
			
		}
		g.fillRect(x, y, 50, 50);
	}
	
	public void jump()
	{
		if(Game.jump && y >= 0)
			jumpPower += 2;
		else if (!Game.jump && jumpPower > 0)
		{
			y -= 2;
			jumpPower --;
		}
		else if(!Game.jump && jumpPower == 0 && y < 500)
		{
			y += 2;
		}
	}
}
