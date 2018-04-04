package game.states;

import java.awt.Graphics;

import game.img.Assets;

public class state3 extends State {

	int x=rightXposition;
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		x-=speed;
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		
		int y=x;
		if(y<260)
     	{
     	y=260;	
     	}
		g.drawImage(Assets.mario,leftXposition,leftYposition,size,size,null);
		g.drawImage(Assets.mario,leftXposition+50,leftYposition,size,size,null);
		g.drawImage(Assets.mario,leftXposition+100,leftYposition,size,size,null);
		g.drawImage(Assets.monstor,leftXposition+150,leftYposition,size,size,null);
		g.drawImage(Assets.monstor,rightXposition,leftYposition,size,size,null);
		g.drawImage(Assets.monstor,y-50,leftYposition,size,size,null);
		
		int z=x;
		if(z<160)
     	{
     	
			g.clearRect(0, 0, 800, 500);//clear screen
			g.drawImage(Assets.bgimg, 0, 0,800,500,null);
	     	state4 four=new state4();
	     	State.setState(four);
     	}
	}

}
