package game.states;

import java.awt.Graphics;

import game.img.Assets;

public class state6 extends State{
     int x=leftXposition+100;
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		x+=speed;
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		
		
		int y=x;
		if(y>610)
     	{
     	y=610;	
     	}
		g.drawImage(Assets.mario,leftXposition,leftYposition,size,size,null);
		g.drawImage(Assets.mario,leftXposition+50+y,leftYposition,size,size,null);
		g.drawImage(Assets.mario,y,leftYposition,size,size,null);
		g.drawImage(Assets.monstor,rightXposition,leftYposition,size,size,null);
		g.drawImage(Assets.monstor,710,leftYposition,size,size,null);
		g.drawImage(Assets.monstor,60,leftYposition,size,size,null);
		int z=x;
		if(z>710)
     	{
     	
			g.clearRect(0, 0, 800, 500);//clear screen
			g.drawImage(Assets.bgimg, 0, 0,800,500,null);
	        state7 seven=new state7();
	        State.setState(seven);
     	}
		
	}

}
