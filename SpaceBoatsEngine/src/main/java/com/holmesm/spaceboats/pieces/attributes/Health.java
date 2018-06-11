package com.holmesm.spaceboats.pieces.attributes;

import com.holmesm.games.pieces.attributes.Attribute;

public class Health extends Attribute<Integer>{

	private int currentHp;
	private int maxHp;
	
	
	public Health(int hp) {
		this.currentHp = hp;
		this.maxHp  = hp;
	}
	
	@Override
	public Integer getValue() {
		return currentHp;
	}
	
	public void adjustHealth(int changeBy) {
		currentHp+=changeBy;
		if(currentHp>maxHp) {
			currentHp = maxHp;
		}
	}
	
	public boolean isDead() {
		return currentHp <=0;
	}

}
