package com.brain.spaceshooter;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import com.brain.spaceshooter.utils.GameConstants;

public class Enemy extends Sprite implements GameConstants  {
	Image imageIcon;
	boolean direction;
	boolean isAlive;
	
	public void move() {
		y+= speed;
		changeDirection();
		System.out.println("Y is "+y+" Speed is "+speed);
	}
	public void changeDirection() {
		if(y<=0) {
			speed = 5;
			System.out.println("Y is 0 "+speed+" "+y);
		}
		
		if(y+h>=GHEIGHT) {
			speed = -5;
			System.out.println("Y is GWIDTH "+speed+" "+y);
			
		}
	}
public Enemy(String img, int x, int y, boolean direction) {
	w = h = 100;
	this.x = x;
	this.y = y;
	this.direction = direction;
	isAlive = true;
	speed = direction?5:-5;
	
	
	imageIcon = new ImageIcon(Enemy.class.getResource(img)).getImage();
}
public void drawEnemy(Graphics g) {
	g.drawImage(imageIcon, x,y,w,h, null);
	move();
}
}
