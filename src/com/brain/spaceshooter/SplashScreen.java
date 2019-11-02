package com.brain.spaceshooter;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JWindow;
import javax.swing.Timer;

import com.brain.spaceshooter.utils.GameConstants;
import com.brain.spaceshooter.utils.ImageLoader;

public class SplashScreen extends JWindow implements GameConstants {
	BufferedImage image;
	int count ;
	Timer timer;
	SplashScreen() throws IOException{
		count = 10;
		setSize(GWIDTH, GHEIGHT);
		setLocationRelativeTo(null);
		//setTitle(TITLE);
		setBackground(Color.BLACK);
		image = ImageLoader.loadImage(INTRO_IMAGE);
		//image = ImageIO.read(SplashScreen.class.getResource("intro.png"));
		setVisible(true);
		 timer = new Timer(10,(e)->{
		 countDown();
		 repaint();
		// repaint(GWIDTH/2, GHEIGHT/2,50,50);
		 });
		 timer.start();
	}
	private void countDown() {
		if(count==1) {
			timer.stop();
			this.setVisible(false);
			this.dispose();
			GameFrame obj= new GameFrame();
			obj.setVisible(true);
			return ;
		}
		count--;
	}
	@Override
	public void paint(Graphics g) {
		//super.paint(g);
		//setBackground(Color.BLACK);
		g.drawImage(image, 0, 0, GWIDTH, GHEIGHT, null);
		g.setFont(new Font("Arial",Font.BOLD,40));
		g.setColor(Color.YELLOW);
		g.drawString(String.valueOf(count), GWIDTH/2, GHEIGHT/2);
	}

	public static void main(String[] args) throws IOException {
		SplashScreen screen = new SplashScreen();

	}

}
