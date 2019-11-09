package com.brain.spaceshooter;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.brain.spaceshooter.utils.GameConstants;

public class Rocket extends Sprite implements GameConstants{
Image image;
ArrayList<Bullet> bullets = new ArrayList<>();
Rocket(){
	w = h = 100;
	x = GWIDTH/6;
	y= GHEIGHT/2 - h;
	
	image = new ImageIcon(Rocket.class.getResource(ROCKET_IMAGE)).getImage();
}
int delay = 1;
public void fire() {
	//if(delay ==2) {
	bullets.add(new Bullet(x+w, y+h/2));
	//delay = 1;
	//}
	//delay++;
}


public void drawRocket(Graphics g) {
	g.drawImage(image, x,y,w,h, null);
}
}
