package game.states;

import java.awt.Graphics;

import game.img.Assets;

public class state9 extends State {
  int x=700;
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		x-=speed;
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		
		int y=x;
		if(y<110)
     	{
     	y=110;	
     	}
		g.drawImage(Assets.mario,600,leftYposition,size,size,null);
		g.drawImage(Assets.mario,700,leftYposition,size,size,null);
		g.drawImage(Assets.mario,650,leftYposition,size,size,null);
		
		g.drawImage(Assets.monstor,y,leftYposition,size,size,null);
		g.drawImage(Assets.monstor,10,leftYposition,size,size,null);
		g.drawImage(Assets.monstor,60,leftYposition,size,size,null);
		int z=x;
		if(z<10)
     	{
     	
			g.clearRect(0, 0, 800, 500);//clear screen
			g.drawImage(Assets.bgimg, 0, 0,800,500,null);
	        state10 ten=new state10();
	        State.setState(ten);
     	}
	
	}

}
