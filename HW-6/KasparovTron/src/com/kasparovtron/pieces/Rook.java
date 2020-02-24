package com.kasparovtron.pieces;

public class Rook extends Peice {
	
	public Rook(String color, int row, int col) {
		
		super(color, "R",  row, col);
		this.power 	= 5;
		this.id 	= 2;
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
