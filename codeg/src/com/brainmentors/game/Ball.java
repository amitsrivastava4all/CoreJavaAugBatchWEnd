package com.brainmentors.game;

import java.awt.Color;
import java.awt.Graphics;

import com.brainmentors.game.utils.GameConstants;

public class Ball implements GameConstants {
	int x= 50;
	int y = 150;
	int speed = 10;
	int ySpeed = 10;
	int w = 50;
	int h = 50;
	Ball(){
		x= getRandom(GWIDTH-50);
		 y = getRandom(GHEIGHT-50);
		 speed = 10;
		 ySpeed = 10;
		 w = 50;
		 h = 50;
	}
//	Ball(int x, int y){
//		this.x=x;
//		 this.y = y;
//		 speed = getRandom();
//		 ySpeed = getRandom();
//		 w = 50;
//		 h = 50;
//	}
	int getRandom(int ...range){
		int result = 0;
		System.out.println("RANGE IS "+range);
		if(range.length==0) {
			 result = (int)(Math.random() * 30);
		}
		else {
			result = (int)(Math.random() * range[0]);
		}
		
		System.out.println("Random "+result);
		return  result == 0?5:result;
	}
	void changeDirection() {
		if((x+w)>=GWIDTH) {
			speed  = -getRandom();
		}
		if(x<=0) {
			speed = getRandom();
		}
		if((y+h)>=GHEIGHT) {
			ySpeed = -getRandom();
		}
		if(y<=0) {
			ySpeed =  getRandom();
		}
	}
	void move() {
		x+=speed;
		y+=ySpeed;
	}
	void drawBall(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, w, h);
	}
	
}
