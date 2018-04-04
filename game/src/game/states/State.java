package game.states;

import java.awt.Graphics;

public abstract class State {
	
	private static State currentState=null;
	public static int leftXposition=10;
	public static int leftYposition=300;
	
	public static int rightXposition=750;
	public static int speed=50;

	public static int size=50;
	
	
	public static void setState(State state)
	{
		currentState=state;
	}
	
	public static State getState()
	{
		return currentState;
	}
	
	
	public abstract void tick();
	
	public abstract void render(Graphics g);

}
