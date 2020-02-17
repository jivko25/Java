package com.chessmaster.pieces;
public class King extends Piece {
	
	public King(String color, int row, int col) {
		
		super(color, "K", row, col);
		this.power  = 6;
		this.id 	= 5;
	}

	@Override
	public void move(int row, int col) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(int row, int col) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isMoveActionValid(int row, int col) {
		// TODO Auto-generated method stub
		return false;
	}
}