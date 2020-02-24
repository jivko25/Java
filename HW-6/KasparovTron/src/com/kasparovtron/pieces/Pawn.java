package com.kasparovtron.pieces;
public class Pawn extends Peice {
	
	public Pawn(String inputColor, int row, int col) {
		
		super(inputColor, "P", row, col);
		this.power 	= 1;
		this.id 	= 1;
	}
	
	
	public boolean isMovePosible(int moveRow, int moveCol) {
		
		int moveRowCoeficient = (this.row - moveRow);
		int moveColCoeficient = (this.col - moveCol);
		
		boolean isRowMovementPosible = (moveRowCoeficient == 1);
		boolean isColMovementPosible = (moveColCoeficient == 0);
		
		return isRowMovementPosible && 
			   isColMovementPosible;
	}
		
	public void attack(int attackRow, int attackCol) {
		
	}
}