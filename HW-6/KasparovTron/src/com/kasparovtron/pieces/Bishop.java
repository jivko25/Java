package com.kasparovtron.pieces;

public class Bishop extends Peice{
	
	public Bishop(String color, int row, int col) {
		super(color, "B", row, col);
		this.power 	= 5;
		this.id 	= 3;
	}
	
	@Override
	public boolean isMovePosible(int moveRow, int moveCol) {
		return false;
	}
	
	public void attack(int attackRow, int attackCol) {
		
	}
}
