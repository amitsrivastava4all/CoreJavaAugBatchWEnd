package com.brain.spaceshooter;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import com.brain.spaceshooter.utils.GameConstants;

public class Rocket extends Sprite implements GameConstants{
Image image;
Rocket(){
	w = h = 100;
	x = GWIDTH/6;
	y= GHEIGHT/2 - h;
	
	image = new ImageIcon(Rocket.class.getResource(ROCKET_IMAGE)).getImage();
}
public void drawRocket(Graphics g) {
	g.drawImage(image, x,y,w,h, null);
}
}
