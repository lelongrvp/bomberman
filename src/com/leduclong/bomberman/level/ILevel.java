package com.leduclong.bomberman.level;


import com.leduclong.bomberman.exceptions.LoadLevelException;

public interface ILevel {

	public void loadLevel(String path) throws LoadLevelException;
}
