import java.awt.Color;
import java.awt.Graphics;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class WallSegment {
	int segmentWidth = 50,
		segmentHeight = 100,
		segmentX,
		segmentY;
	List<Color> colors = Arrays.asList(Color.BLACK, Color.RED, Color.BLUE, Color.CYAN, Color.GREEN);
	Color segmentColor = getSegmentColor();
	
	public WallSegment()
	{	
		segmentX = Main.WIDTH;
		segmentY = 450;
	}
	public WallSegment( int x, int y)
	{
		segmentX = x;
		segmentY = y;
	}
	
	public void drawSegment(Graphics g)
	{
		g.setColor(segmentColor);
		g.fillRect(segmentX, segmentY, segmentWidth, segmentHeight);				
	}
	
	public Color getSegmentColor(){
		Random rand = new Random();		
		return colors.get(rand.nextInt(colors.size()));		
	}
}
