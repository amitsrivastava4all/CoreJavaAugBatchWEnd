package com.brain.spaceshooter;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import com.brain.spaceshooter.utils.GameConstants;

public class Enemy extends Sprite implements GameConstants  {
	Image imageIcon;
public Enemy(String img, int x, int y) {
	w = h = 100;
	this.x = x;
	this.y = y;
	
	imageIcon = new ImageIcon(Enemy.class.getResource(img)).getImage();
}
public void drawEnemy(Graphics g) {
	g.drawImage(imageIcon, x,y,w,h, null);
}
}
