package com.brain.spaceshooter;

import java.awt.Graphics;
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
	public Board() {
		camera = new Camera();
		rocket = new Rocket();
	setSize(GWIDTH, GHEIGHT);
	timer = new Timer(DELAY, (e)->repaint());
	timer.start();
	
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
}
}
