package com.holmesm.spaceboats.pieces.attributes;

import com.holmesm.games.movement.MovementPoints;
import com.holmesm.games.pieces.attributes.Attribute;

public class Movement extends Attribute<MovementPoints> {

	
	MovementPoints movementPoints;
	
	public Movement(MovementPoints points) {
		movementPoints = points;
	}
	
	@Override
	public MovementPoints getValue() {
		return movementPoints.deepCopy();
	}

}
