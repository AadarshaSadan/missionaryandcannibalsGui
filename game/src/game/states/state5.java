package game.states;

import java.awt.Graphics;

import game.img.Assets;

public class state5 extends State{
	int x=660;
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		x-=speed;
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		
		int y=x;
		if(y<160)
     	{
     	y=160;	
     	}
		g.drawImage(Assets.mario,leftXposition,leftYposition,size,size,null);
		g.drawImage(Assets.mario,leftXposition+50,leftYposition,size,size,null);
		g.drawImage(Assets.mario,leftXposition+100,leftYposition,size,size,null);
		g.drawImage(Assets.monstor,rightXposition,leftYposition,size,size,null);
		g.drawImage(Assets.monstor,710,leftYposition,size,size,null);
		g.drawImage(Assets.monstor,y,leftYposition,size,size,null);
		int z=x;
		if(z<50)
     	{
     	
			g.clearRect(0, 0, 800, 500);//clear screen
			g.drawImage(Assets.bgimg, 0, 0,800,500,null);
	     	state6 six=new state6();
	     	State.setState(six);
     	}
		
	}

}
