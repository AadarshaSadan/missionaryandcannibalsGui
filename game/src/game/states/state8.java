package game.states;

import java.awt.Graphics;

import game.img.Assets;

public class state8 extends State{
   int x=170;
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		x+=speed;
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		
		int y=x;
		if(y>600)
     	{
     	y=600;	
     	}
		g.drawImage(Assets.mario,y,leftYposition,size,size,null);
		g.drawImage(Assets.mario,700,leftYposition,size,size,null);
		
		g.drawImage(Assets.mario,y+50,leftYposition,size,size,null);
		
		g.drawImage(Assets.monstor,rightXposition,leftYposition,size,size,null);
		g.drawImage(Assets.monstor,150,leftYposition,size,size,null);
		g.drawImage(Assets.monstor,60,leftYposition,size,size,null);
		int z=x;
		if(z>700)
     	{
     	
			g.clearRect(0, 0, 800, 500);//clear screen
			g.drawImage(Assets.bgimg, 0, 0,800,500,null);
	        state9 nine=new state9();
	        State.setState(nine);
     	}
		
	}

}
