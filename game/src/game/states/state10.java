package game.states;

import java.awt.Graphics;

import game.img.Assets;

public class state10 extends State {
    int x=60;
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		x+=speed;
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		
		int y=x;
		if(y>550)
     	{
     	y=550;	
     	}
		g.drawImage(Assets.mario,750,leftYposition,size,size,null);
		g.drawImage(Assets.mario,700,leftYposition,size,size,null);
		g.drawImage(Assets.mario,650,leftYposition,size,size,null);
		
		g.drawImage(Assets.monstor,y,leftYposition,size,size,null);
		g.drawImage(Assets.monstor,10,leftYposition,size,size,null);
		g.drawImage(Assets.monstor,50+y,leftYposition,size,size,null);
		int z=x;
		if(z>650)
     	{
     	
			g.clearRect(0, 0, 800, 500);//clear screen
			g.drawImage(Assets.bgimg, 0, 0,800,500,null);
	        state11 eleven=new state11();
	        State.setState(eleven);
     	}
		
	}
	

}
