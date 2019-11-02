package com.brain.spaceshooter;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.brain.spaceshooter.utils.GameConstants;
import com.brain.spaceshooter.utils.ImageLoader;

public class Camera extends Sprite implements GameConstants {
	int rocketWidth;
	Camera(int rocketWidth, int rocketX){
		this.rocketWidth = rocketWidth;
		x = 0;
		y = 0;
		w = GWIDTH;
		h  = GHEIGHT;
		speed = 10;
		image = ImageLoader.loadImage(BACKGROUND_IMAGE);
	}
	public void move() {
		int imageSize = 5000;
		//if(x>10 && x<(imageSize-GWIDTH)) {
		x+=speed;
		System.out.println("X is "+x);
		//}
	}
	public BufferedImage getSubImage() {
		return image.getSubimage(x,y, w,h);
	}
	public void drawBackGround(Graphics g) {
		g.drawImage(getSubImage(), 0, 0, w, h, null);
		//move();
	}

}
