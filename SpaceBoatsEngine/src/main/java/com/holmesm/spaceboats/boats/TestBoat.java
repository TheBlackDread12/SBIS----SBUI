package com.holmesm.spaceboats.boats;

import com.holmesm.games.movement.MovementPoints;
import com.holmesm.games.movement.MovementType;
import com.holmesm.games.pieces.GamePiece;
import com.holmesm.spaceboats.abilities.Laser;
import com.holmesm.spaceboats.pieces.attributes.Health;
import com.holmesm.spaceboats.pieces.attributes.Movement;

public class TestBoat extends GamePiece{
	
	public TestBoat() {
		super();
		 MovementPoints movement = new MovementPoints();
		 movement.addMovementTypeCost(MovementType.GENERIC, 13.0);
		this.addAttribute(new Health(15));
		this.addAttribute(new Movement(movement));
		this.addAbility(new Laser(movement,10));
	}

}
