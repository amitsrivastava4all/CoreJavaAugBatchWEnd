package com.brain.spaceshooter;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.brain.spaceshooter.utils.GameConstants;
import com.brain.spaceshooter.utils.ImageLoader;

public class Camera extends Sprite implements GameConstants {
	Camera(){
		x = 0;
		y = 0;
		w = GWIDTH;
		h  = GHEIGHT;
		speed = 10;
		image = ImageLoader.loadImage(BACKGROUND_IMAGE);
	}
	public void move() {
		x+=speed;
	}
	public BufferedImage getSubImage() {
		return image.getSubimage(x,y, w,h);
	}
	public void drawBackGround(Graphics g) {
		g.drawImage(getSubImage(), 0, 0, w, h, null);
		move();
	}

}
