package com.brainmentors.game;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.Timer;

import com.brainmentors.game.utils.GameConstants;

public class Board extends JPanel implements GameConstants {
//	int x= 50;
//	int y = 150;
//	int speed = 10;
//	int ySpeed = 10;
//	int w = 50;
//	int h = 50;
	Timer timer;
	Ball ball = new Ball();
	Ball balls[] = new Ball[50];
	void loadBalls() {
		for(int i = 0 ; i<balls.length; i++) {
			balls[i] = new Ball();
		}
	}
	void paintBalls(Graphics g) {
		for(int i = 0 ; i<balls.length; i++) {
			balls[i].drawBall(g);
			balls[i].move();
			balls[i].changeDirection();
		}
	}
	//int x[] = new int[10];
//	int getRandom(){
//		int result = (int)(Math.random() * 30);
//		System.out.println("Random "+result);
//		return  result == 0?5:result;
//	}
	Board(){
		loadBalls();
		setBackground(Color.BLACK);
		timer = new Timer(100,(e)->repaint());
		timer.start();
	}
//	void changeDirection() {
//		if((x+w)>=GWIDTH) {
//			speed  = -getRandom();
//		}
//		if(x<=0) {
//			speed = getRandom();
//		}
//		if((y+h)>=GHEIGHT) {
//			ySpeed = -getRandom();
//		}
//		if(y<=0) {
//			ySpeed =  getRandom();
//		}
//	}
//	void move() {
//		x+=speed;
//		y+=ySpeed;
//	}
//	void drawBall(Graphics g) {
//		g.setColor(Color.YELLOW);
//		g.fillOval(x, y, w, h);
//	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//System.out.println("Paint Call");
		paintBalls(g);
		//ball.drawBall(g);
		//ball.move();
		//ball.changeDirection();
		//x++;
		
		
		
	}

}
