package com.kasparovtron.pieces;

public class Rook {
	
	public String color;
	public int power;
	public int id;	
	
	public int row;
	public int col;
	
   public Rook(String color, int row, int col) {
		
		this.color  = color;
		this.power 	= 6;
		this.id 	= 6;
		
		this.row = row;
		this.col = col;
	} 
	
public boolean isMovePosible(int moveRow, int moveCol) {
		
		int moveRowCoeficient = (this.row - moveRow);
		int moveColCoeficient = (this.col - moveCol);
		
		boolean MovementPosible = (moveRowCoeficient <=7 && moveColCoeficient == 0) || (moveRowCoeficient == 0 && moveColCoeficient <= 7);
		
		return MovementPosible ;
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
