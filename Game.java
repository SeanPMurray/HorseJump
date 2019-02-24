
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
 

import javax.swing.JPanel;

public class Game extends JPanel implements KeyListener {
	private static final long serialVersionUID = 1L;
	
	Player player = new Player();
    Background bg = new Background();
    Obstacle logs = new Obstacle();
    
    public Game()
    {
    	player.initPlayerImage();
    	logs.initObstacleImage();
        this.addKeyListener(this);
        setFocusable(true);
    }
     
    public void paintComponent(Graphics g)
    {
        g.clearRect(0, 0, Main.WIDTH, Main.HEIGHT); 
        
        bg.scrollBackground();
        logs.scrollObstacle();
 
        bg.drawBackground(g);
        logs.drawObstacle(g);
        
        player.jump();
        player.drawPlayer(g);
        player.drawJumpPower(g);
        
        SleepRefresh();
    }
     
    void SleepRefresh()
    {
        try{
            Thread.sleep(1000/50);
        }catch(Exception e){
             
        }
        
        repaint();
    }
    
    static boolean jump = false;
    
    public void keyPressed(KeyEvent arg0) {
    	if(arg0.getKeyCode() == KeyEvent.VK_SPACE)
    		jump = true;
    }
 
    public void keyReleased(KeyEvent arg0) {
    	if(arg0.getKeyCode() == KeyEvent.VK_SPACE)
    		jump = false;          
    }
 
    public void keyTyped(KeyEvent arg0) {	
    }
}

