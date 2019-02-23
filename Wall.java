import java.awt.Graphics;


public class Wall {
	WallSegment s1;
	WallSegment s2;
	WallSegment s3;
	WallSegment s4;
	WallSegment s5;
	
	public Wall(){
		s1 = new WallSegment();
		s2 = new WallSegment(s1.segmentX,s1.segmentY - s1.segmentHeight);
		s3 = new WallSegment(s1.segmentX,s1.segmentY - s1.segmentHeight * 2);
		s4 = new WallSegment(s1.segmentX,s1.segmentY - s1.segmentHeight * 3);
		s5 = new WallSegment(s1.segmentX,s1.segmentY - s1.segmentHeight * 4);
	}
	public Wall(int x,int y)
	{
		s1 = new WallSegment(x, y);
		s2 = new WallSegment(s1.segmentX,s1.segmentY - s1.segmentHeight);
		s3 = new WallSegment(s1.segmentX,s1.segmentY - s1.segmentHeight * 2);
		s4 = new WallSegment(s1.segmentX,s1.segmentY - s1.segmentHeight * 3);
		s5 = new WallSegment(s1.segmentX,s1.segmentY - s1.segmentHeight * 4);
	}
	public void drawWall(Graphics g)
	{
		s1.drawSegment(g);
		s2.drawSegment(g);
		s3.drawSegment(g);
		s4.drawSegment(g);
		s5.drawSegment(g);
	}
	
	public void moveWall()
	{
		if(s1.segmentX >= 0 - s1.segmentWidth)
		{
			s1.segmentX -= 2;
			s2.segmentX -= 2;
			s3.segmentX -= 2;
			s4.segmentX -= 2;
			s5.segmentX -= 2;
		}
		else
		{
			resetWall();			
		}
	}
	public void resetWall()
	{
		s1.segmentX = Main.WIDTH;
		s2.segmentX = Main.WIDTH;
		s3.segmentX = Main.WIDTH;
		s4.segmentX = Main.WIDTH;
		s5.segmentX = Main.WIDTH;
		
		s1.segmentColor = s1.getSegmentColor();
		s2.segmentColor = s2.getSegmentColor();
		s3.segmentColor = s3.getSegmentColor();
		s4.segmentColor = s4.getSegmentColor();
		s5.segmentColor = s5.getSegmentColor();
	}
}
