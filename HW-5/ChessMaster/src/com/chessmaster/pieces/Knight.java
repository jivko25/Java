package com.chessmaster.pieces;
public class Knight extends Piece {
	
	public Knight(String color, int row, int col) {
		
		super(color, "Kn", row, col);
		this.power  = 5;
		this.id 	= 3;
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
