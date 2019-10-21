package com.brain.spaceshooter.utils;

import com.brain.spaceshooter.Board;

import jaco.mp3.player.MP3Player;

public interface SoundLoader {
	MP3Player mp3 = 
			new MP3Player
			(Board.class.getResource
					(GameConstants.BACKGROUND_SOUND));
	public static void loadBackGroundSound() {
		mp3.play();
		
	}

}
