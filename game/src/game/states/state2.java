package game.states;

import java.awt.Graphics;

import game.img.Assets;

public class state2 extends State {

	int x=leftXposition;
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		x+=speed;
	}

	@Override
	public void render(Graphics g) {
		int y=x;
		if(y>500)
     	{
     	y=500;
     	
     	}
     	g.drawImage(Assets.mario,leftXposition,leftYposition,size,size,null);
		g.drawImage(Assets.mario,leftXposition+50,leftYposition,size,size,null);
		g.drawImage(Assets.mario,leftXposition+100,leftYposition,size,size,null);
		g.drawImage(Assets.monstor,leftXposition+150,leftYposition,size,size,null);
		g.drawImage(Assets.monstor,y+200,leftYposition,size,size,null);
		g.drawImage(Assets.monstor,y+250,leftYposition,size,size,null);
		// TODO Auto-generated method stub
		
		int z=x;
		if(z>600)
     	{
     	
			g.clearRect(0, 0, 800, 500);//clear screen
			g.drawImage(Assets.bgimg, 0, 0,800,500,null);
	     	state3 three=new state3();
	     	State.setState(three);
     	}
	}

}
