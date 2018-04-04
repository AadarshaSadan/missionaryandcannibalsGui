package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import game.display.Display;
import game.img.Assets;
import game.img.ImageLoader;
import game.states.State;
import game.states.state1;
import game.states.state2;

public class Game implements Runnable//implement threadS
{
	private Display display;
	public int width,height;
	public String title;
	private boolean running=false;
	private Thread thread;
	 
    private BufferStrategy bs; //they are object 
    private Graphics g;
    
    private State gameState;
    
	public Game(String title,int width,int height)
	{ 
		this.width=width;
		this.height=height;
		this.title=title; 
		
	
	}
	
	private void init()//ready stuff for game
	{
		display=new Display(title,width,height);
		 Assets.init();
		 gameState=new state1();
		 State.setState(gameState);
		 
	}
	
	private void tick()//this will update our game
	{	
		if(State.getState()!=null)
			State.getState().tick();
			
		
	   // System.out.println(x);
		
	}
	
	private void render()//drawing  we have to access canvas methods hai ta
	{
		bs=display.getCanvas().getBufferStrategy();
		//how to draw drawing in screen(buffer is like hidden screen 3 step to see)
		//why buffer? to prevent flikering
		if(bs==null) {//if not buffer create buffer
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g =bs.getDrawGraphics();//allow us to paint in canbrush
		
		g.clearRect(0, 0, width, height);//clear screen
		g.drawImage(Assets.bgimg, 0, 0,800,500,null);
     	//draw start
     	
     	
		if(State.getState()!=null)
			State.getState().render(g);
     	
     	
  
		
		
		
		
		//end draw
		bs.show();//display to the screem
		g.dispose();//get done with graphics object
		
	}
	
	
 public void run() //majority of code should be go here
      {
	 init();
	 int fps=60;//
	 double timePerTick=1000000000/fps;//time in nano second 
	 double delta=0;
	 long now;
	 long lastTime=System.nanoTime();//return in nano computertime
	 
	 
	 
	 while(running)//yo chai game loop garou na lai if all component are loaded
	 {
		 now=System.nanoTime();
		 delta+=(now-lastTime)/timePerTick;
		 lastTime=now;
		 if(delta >=1){
		  tick();
		 render();
		 delta--;
		 }
	 }
	 
	 stop();//stop threading 
	 
	  }
 
 public synchronized void start() {
	 if(running)//if alreadey start we don't want to start it will be meshed
		 return;
	 running=true;
	 thread=new Thread (this);
	 thread.start();
	 
 }
 
 public synchronized void stop(){
	 if(!running)//don't  start code below
		 return;
	 try {
		thread.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
 }

}
