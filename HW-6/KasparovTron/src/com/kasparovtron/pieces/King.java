package com.kasparovtron.pieces;

public class King extends Peice {
	
	public King(String color, int row, int col) {
		
		super(color, "K", row, col);
		this.power 	= 6;
		this.id 	= 5;
	}

	@Override
	public boolean isMovePosible(int moveRow, int moveCol) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void attack(int attackRow, int attackCol) {
		// TODO Auto-generated method stub
	}
	
}
