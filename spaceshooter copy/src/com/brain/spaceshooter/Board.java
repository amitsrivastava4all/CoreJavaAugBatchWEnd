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
	boolean isCollide(Bullet bullet, Enemy enemy) {
		int xDistance = Math.abs(bullet.x - enemy.x);
		int yDistance = Math.abs(bullet.y - enemy.y);
		int maxHeight = Math.max(bullet.h, enemy.h);
		int maxWidth = Math.max(bullet.w, enemy.w);
		//System.out.println("Collision "+xDistance+" "+maxWidth);
		//System.out.println("Collision "+yDistance+" "+maxHeight);
		
		boolean result = xDistance<=maxWidth && yDistance<=maxHeight;
		if(result) {
			System.out.println("COLLIDE");
			System.out.println("BU X,Y "+bullet.x+" "+bullet.y);
			System.out.println("EN X , Y "+enemy.x+" "+enemy.y);
			System.out.println("X DIST "+xDistance+" "+maxWidth);
		System.out.println("Y DIST "+yDistance+" "+maxHeight);
		}
		return result;
				
		
		
	}
	private void collision() {
		for(Bullet bullet : rocket.bullets) {
			if(bullet.isVisible) {
				for(Enemy enemy : enemies) {
					if(enemy.isAlive && isCollide(bullet, enemy)) {
						enemy.isAlive = false;
						
						System.out.println("Enemy Collide "+enemy.x+ " "+enemy.y);
						System.out.println("Bullet "+bullet.x+ " "+bullet.w);
						System.out.println("EN W H "+enemy.w+" "+enemy.h);
						System.out.println("BU W H "+bullet.w+" "+bullet.h);
						break;
					}
				}
			}
		}
	}
	private void loadEnemies() {
		int y = 100;
		int gap = 100;
		boolean direction = true;
		int x = 350;
		for(int i = 0; i<MAX_ENEMY; i++) {
			enemies[i]  = new Enemy(i%2==0?E1:E2, x, y, direction);
			direction = !direction;
			x = x + enemies[i].w + gap;
			y = y + enemies[i].h + gap;
			
		}
	}
	private void printEnemies(Graphics g) {
		for(Enemy enemy : enemies) {
			enemy.drawEnemy(g);
			enemy.fall();
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
	public void drawBullets(Graphics g) {
		if(rocket.bullets.size()>0) {
		for(Bullet bullet : rocket.bullets) {
			if(bullet.isVisible) {
			bullet.drawBullet(g);
			}
		}
		}
	}
private void bindEvents() {	
	this.addKeyListener(new KeyAdapter() {
		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_SPACE) {
				rocket.fire();
			}
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
		drawBullets(g);
		collision();
}
}
