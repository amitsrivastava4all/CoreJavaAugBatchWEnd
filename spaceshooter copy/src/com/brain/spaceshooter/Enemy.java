package com.brain.spaceshooter;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.brain.spaceshooter.utils.GameConstants;
import com.brain.spaceshooter.utils.ImageLoader;

public class Enemy extends Sprite implements GameConstants  {
	BufferedImage imageIcon;
	boolean direction;
	boolean isAlive;
	int force ;
	public void move() {
		y+= speed;
		changeDirection();
		//System.out.println("Y is "+y+" Speed is "+speed);
	}
	public void changeDirection() {
		if(y<=0) {
			speed = 5;
			//System.out.println("Y is 0 "+speed+" "+y);
		}
		
		if(y+h>=GHEIGHT) {
			speed = -5;
			//System.out.println("Y is GWIDTH "+speed+" "+y);
			
		}
	}
	void fall() {
		if(!isAlive) {
		force += GRAVITY;
		y+=force;
		}
	}
public Enemy(String img, int x, int y, boolean direction) {
	w = h = 100;
	force = 0;
	this.x = x;
	this.y = y;
	this.direction = direction;
	isAlive = true;
	speed = direction?5:-5;
	
	imageIcon = ImageLoader.loadImage(ANGRY);
	loadCord();
	//imageIcon = new ImageIcon(Enemy.class.getResource(img)).getImage();
}
BufferedImage anim[] = new BufferedImage[6];
void loadCord() {
	
	anim[0] = imageIcon.getSubimage(3, 1, 129, 144);
	anim[1] = imageIcon.getSubimage(135, 1, 130, 144);
	anim[2] = imageIcon.getSubimage(269, 1, 129, 144);
	anim[3] = imageIcon.getSubimage(400, 3, 131, 142);
	anim[4] = imageIcon.getSubimage(533, 3, 131, 142);
	anim[5] = imageIcon.getSubimage(666, 3, 131, 142);
}
int index = 0;
void animation(Graphics g){
	g.drawImage(anim[index],x,y,w,h,null);
	index++;
	if(index>=6) {
		index=0;
	}
	
}

public void drawEnemy(Graphics g) {
	animation(g);
	//g.drawImage(imageIcon, x,y,w,h, null);
	move();
}
}
