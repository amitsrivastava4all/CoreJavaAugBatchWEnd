package com.brain.spaceshooter.utils;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.brain.spaceshooter.Board;

public interface ImageLoader {
	public static BufferedImage loadImage(String imageName) {
		try {
			return ImageIO.read(Board.class.getResource(imageName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
