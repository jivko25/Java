package com.kasparovtron.pieces;
public class Knight {
	
	public String color;
	public int power;
	public int id;
	
	public int row;
	public int col;
	
	public Knight (String color, int row, int col) {
		
		this.color  = color;
		this.power 	= 3;
		this.id 	= 3;
		
		this.row = row;
		this.col = col;
	}
	
    public boolean isMovePosible(int moveRow, int moveCol) {
		
		int moveRowCoeficient = (this.row - moveRow);
		int moveColCoeficient = (this.col - moveCol);
		
		boolean MovementPosible = (moveRowCoeficient == 1 && moveColCoeficient == 2) || (moveRowCoeficient == 2 && moveColCoeficient == 1);
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