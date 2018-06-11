package com.holmesm.spaceboats.abilities.effects;

import com.holmesm.games.abilities.effects.Effect;
import com.holmesm.games.abilities.effects.EffectContext;
import com.holmesm.games.pieces.GamePiece;
import com.holmesm.games.pieces.attributes.Attribute;
import com.holmesm.spaceboats.pieces.attributes.Health;

public class Damage extends Effect{

	private static final String NAME = "Damage";
	
	private int damageToDeal;
	
	public Damage(int damage) {
		super(NAME);
		damageToDeal = damage*-1;
	}
	
	@Override
	public void affect(EffectContext context) {
		
		for(GamePiece target:context.getTargets()) {
			Attribute a = target.getAttribute(Health.class);
			if(a==null || !(a instanceof Health)) {
				continue;
			}
			Health health = (Health)a;
			health.adjustHealth(damageToDeal);
			if(health.isDead()) {
				new Death().affect(context);
			}
		}
		
	}

}
