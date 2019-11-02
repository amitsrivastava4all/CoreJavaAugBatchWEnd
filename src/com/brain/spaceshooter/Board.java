package com.brain.spaceshooter;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import javax.swing.Timer;

import com.brain.spaceshooter.utils.GameConstants;
import com.brain.spaceshooter.utils.ImageLoader;

public class Board extends JPanel implements GameConstants{
	BufferedImage bg;
	Camera camera;
	Rocket rocket;
	Timer timer ;
	Enemy enemies[] = new Enemy[MAX_ENEMY];
	//String images [] = {E1, E2};
	private void loadEnemies() {
		int y = 100;
		int gap = 100;
		for(int i = 0; i<MAX_ENEMY; i++) {
			enemies[i]  = new Enemy(i%2==0?E1:E2, 500, y);
			y = y + enemies[i].h + gap;
			
		}
	}
	private void printEnemies(Graphics g) {
		for(Enemy enemy : enemies) {
			enemy.drawEnemy(g);
		}
	}
	public Board() {
		
		rocket = new Rocket();
		loadEnemies();
		camera = new Camera(rocket.w, rocket.x);
	setSize(GWIDTH, GHEIGHT);
	setFocusable(true);
	bindEvents();
	timer = new Timer(DELAY, (e)->repaint());
	timer.start();
	
}
private void bindEvents() {	
	this.addKeyListener(new KeyAdapter() {
		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
				camera.speed = 10;
			}
			if(e.getKeyCode()==KeyEvent.VK_LEFT) {
				camera.speed=-10;
			}
			camera.move();
		}
		@Override
		public void keyReleased(KeyEvent e) {
			camera.speed=0;
		}
	});
}
	
//private void drawBackGround(Graphics g) {
//	bg = ImageLoader.loadImage(BACKGROUND_IMAGE);
//	g.drawImage(bg, 0, 0, GWIDTH, GHEIGHT, null);
//}
@Override
public void paintComponent(Graphics g) {
	super.paintComponent(g);
		camera.drawBackGround(g);
		rocket.drawRocket(g);
		printEnemies(g);
}
}
