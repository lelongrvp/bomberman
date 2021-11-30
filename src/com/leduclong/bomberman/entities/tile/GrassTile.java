package com.leduclong.bomberman.entities.tile;


import com.leduclong.bomberman.entities.Entity;
import com.leduclong.bomberman.graphics.Sprite;

public class GrassTile extends Tile {

	public GrassTile(int x, int y, Sprite sprite) {
		super(x, y, sprite);
	}
	
	@Override
	public boolean collide(Entity e) {
		return true;
	}
}
