package com.brain.spaceshooter;

import javax.swing.JFrame;

import com.brain.spaceshooter.utils.GameConstants;
import com.brain.spaceshooter.utils.SoundLoader;

public class GameFrame extends JFrame implements GameConstants {
	
	public GameFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SoundLoader.loadBackGroundSound();
		setResizable(false);
		setSize(GWIDTH, GHEIGHT);
		setLocationRelativeTo(null);
		setTitle(TITLE);
		Board board = new Board();
		add(board);
		setVisible(true);
	}

	

}
