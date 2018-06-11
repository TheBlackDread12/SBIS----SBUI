package com.holmesm.spaceboats.abilities.effects;

import com.holmesm.games.abilities.effects.Effect;
import com.holmesm.games.abilities.effects.EffectContext;
import com.holmesm.games.pieces.GamePiece;

public class Death extends Effect {

	private static final String NAME = "Death";
	
	public Death() {
		super(NAME);
	}

	@Override
	public void affect(EffectContext context) {
		for(GamePiece piece:context.getTargets()) {
			piece.removeFromGame();
		}
		
	}

}
