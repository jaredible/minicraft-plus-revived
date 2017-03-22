package com.mojang.ld22.entity.particle;

import com.mojang.ld22.entity.Entity;
import com.mojang.ld22.gfx.Color;
import com.mojang.ld22.gfx.Screen;
import com.mojang.ld22.sound.Sound;

//This is used only for potions, I believe.
public class FireParticle extends Entity {

	private int time = 0;

	public FireParticle(int x, int y) {
		this.x = x;
		this.y = y;
		Sound.monsterHurt.play();
	}

	public void tick() {
		time++;
		if(time > 30) {
			remove();
		}

	}

	public void render(Screen screen) {
		int col = Color.get(-1, 520, 550, 500);
		screen.render(x - 8, y - 8, 425, col, 0);
	}
}