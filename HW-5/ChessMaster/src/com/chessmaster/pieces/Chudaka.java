package com.chessmaster.pieces;

public class Chudaka 
			extends Piece 
			implements Blastable {
	
	public Chudaka(String color, int row, int col) {
		
		super(color, "Cd", row, col);
		this.power 	= 15;
		this.id 	= 7;
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
	public void blast() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isMoveActionValid(int row, int col) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
