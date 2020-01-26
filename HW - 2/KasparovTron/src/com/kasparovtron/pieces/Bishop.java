package com.kasparovtron.pieces;
public class Bishop extends Piece{
	public Bishop (String color, int row, int col) {
		super(color, row, col);
		this.color  = color;
		this.power 	= 1;
		this.id 	= 1;
		
		this.row = row;
		this.col = col;
	}
	
    public boolean isMovePosible(int moveRow, int moveCol) {
		
		int moveRowCoeficient = (this.row - moveRow);
		int moveColCoeficient = (this.col - moveCol);
		
		boolean MovementPosible = (moveRowCoeficient == moveColCoeficient);
		
		return MovementPosible;
	}
	
	public void move(int moveRow, int moveCol) {
		
		if(this.isMovePosible(moveRow, moveCol)) {
			
			this.row = moveRow;
			this.col = moveCol;
		}
	}
	
	
	public void attack() {
		
	}

	@Override
	public void attack(int row, int col) {
		// TODO Auto-generated method stub
		
	}
}