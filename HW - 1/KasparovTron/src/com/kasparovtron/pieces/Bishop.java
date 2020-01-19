package com.kasparovtron.pieces;
public class Bishop {
	
	public String color;
	public int power;
	public int id;
	
	public int row;
	public int col;
	
	public Bishop (String color, int row, int col) {
		
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
}