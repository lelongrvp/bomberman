package com.leduclong.bomberman.entities.tile.powerup;

import com.leduclong.bomberman.Game;
import com.leduclong.bomberman.entities.Entity;
import com.leduclong.bomberman.entities.mob.Player;
import com.leduclong.bomberman.graphics.Sprite;

public class PowerupFlames extends Powerup {

	public PowerupFlames(int x, int y, int level, Sprite sprite) {
		super(x, y, level, sprite);
	}
	
	@Override
	public boolean collide(Entity e) {
		
		if(e instanceof Player) {
			((Player) e).addPowerup(this);
			remove();
			return true;
		}
		
		return false;
	}
	
	@Override
	public void setValues() {
		_active = true;
		Game.addBombRadius(1);
	}
	


}
