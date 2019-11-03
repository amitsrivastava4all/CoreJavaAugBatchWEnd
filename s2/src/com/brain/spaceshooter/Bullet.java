package com.brain.spaceshooter;

import java.awt.Color;
import java.awt.Graphics;

import com.brain.spaceshooter.utils.GameConstants;

public class Bullet extends Sprite implements GameConstants{
	boolean isVisible ;
	Bullet(int x, int y){
		isVisible = true;
		this.x = x;
		this.y = y;
		this.h = this.w = 25;
		speed = 10;
	}
	private void outOfScreen() {
		if(x>=GWIDTH) {
			isVisible = false;
		}
	}
	public void move() {
		x+=speed;
		outOfScreen();
		
	}
	
	public void drawBullet(Graphics g) {
		
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, w, h);
		move();
		//delay = 1;
		
		//delay++;
		
		
		
	}
}
