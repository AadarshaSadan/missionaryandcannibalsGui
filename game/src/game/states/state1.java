package game.states;

import java.awt.Graphics;

import game.img.Assets;

public class state1 extends State{
	
	
	
	int x=0;
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		x+=speed;
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
     	
		g.drawImage(Assets.mario,leftXposition,leftYposition,size,size,null);
		g.drawImage(Assets.mario,leftXposition+50,leftYposition,size,size,null);
		g.drawImage(Assets.mario,leftXposition+100,leftYposition,size,size,null);
		g.drawImage(Assets.monstor,leftXposition+150,leftYposition,size,size,null);
		g.drawImage(Assets.monstor,leftXposition+200,leftYposition,size,size,null);
		g.drawImage(Assets.monstor,leftXposition+250,leftYposition,size,size,null);
		
		int y=x;
     	if(y>100)
     	{
     	y=550;
     	g.clearRect(0, 0, 800, 500);//clear screen
     	g.drawImage(Assets.bgimg, 0, 0,800,500,null);
     	state2 two=new state2();
     	State.setState(two);
     	}
		
		
		 }
	

}
