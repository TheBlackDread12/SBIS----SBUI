package com.holmesm.spaceboats.abilities;

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.holmesm.games.abilities.Ability;
import com.holmesm.games.abilities.effects.Effect;
import com.holmesm.games.board.path.Path;
import com.holmesm.games.board.Square;
import com.holmesm.games.board.path.PathBuilder;
import com.holmesm.games.movement.MovementPoints;
import com.holmesm.games.pieces.GamePiece;
import com.holmesm.spaceboats.abilities.effects.Damage;
import com.holmesm.spaceboats.pieces.attributes.Health;

public class Laser extends Ability{
	
	private static final String NAME = "Laser";
	
	private MovementPoints range;
	
	public Laser(MovementPoints range,int damage) {
		super(NAME, Lists.<Effect>newArrayList(new Damage(damage)));
		this.range = range;
		
	}
	
	public List<Path> getPossiblePaths(GamePiece user){
		return PathBuilder.buildPossiblePaths(range, user.getGameSpace());
	}
	
	public List<GamePiece> getPossibleTargets(Square targetSquare){
		List<GamePiece> targets = Lists.newArrayList();
		for(GamePiece piece:targetSquare.getContent()) {
			if(piece.getAttribute(Health.class)!=null) {
				targets.add(piece);
			}
		}
		return targets;
	}

}
