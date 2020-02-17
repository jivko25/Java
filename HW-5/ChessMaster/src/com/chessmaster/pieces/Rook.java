package com.chessmaster.pieces;

public class Rook extends Piece {
	
	public Rook(String color, int row, int col) {
		
		super(color, "R", row, col);
		this.power  = 5;
		this.id 	= 4;
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