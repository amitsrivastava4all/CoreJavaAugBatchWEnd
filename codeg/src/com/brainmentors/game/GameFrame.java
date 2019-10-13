package com.brainmentors.game;

import javax.swing.JFrame;

import com.brainmentors.game.utils.GameConstants;

public class GameFrame extends JFrame implements GameConstants {
	GameFrame(){
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(TITLE);
		setSize(GWIDTH, GHEIGHT);
		setLocationRelativeTo(null);
		Board board = new Board();
		add(board);
		
		//setLocation(150, 70);
		setVisible(true);
	}

	public static void main(String[] args) {
		GameFrame frame = new GameFrame();
		long startTime = System.currentTimeMillis();
		for(int i = 1; i<=100000; i++) {
			
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		

	}

}
