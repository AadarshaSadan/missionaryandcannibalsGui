package game.img;

import java.awt.image.BufferedImage;

public class Assets {
	public static BufferedImage monstor,mario,bgimg,star;
	public static void init() {
		monstor=ImageLoader.loadImage("/texture/monn.png");
		mario=ImageLoader.loadImage("/texture/mis.png");
		bgimg=ImageLoader.loadImage("/texture/sad.jpg");
		star=ImageLoader.loadImage("/texture/star.png");
		
	}

}
