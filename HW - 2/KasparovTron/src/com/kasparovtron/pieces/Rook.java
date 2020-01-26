package com.kasparovtron.pieces;

public class Rook extends Piece{
   public Rook(String color, int row, int col) {
		super(color, row, col);
		this.color  = color;
		this.power 	= 6;
		this.id 	= 6;
		
		this.row = row;
		this.col = col;
	} 
	
public boolean isMovePosible(int moveRow, int moveCol) {
		
		int moveRowCoeficient = (this.row - moveRow);
		int moveColCoeficient = (this.col - moveCol);
		
		boolean MovementPosible = (moveRowCoeficient <=9 && moveColCoeficient == 0) || (moveRowCoeficient == 0 && moveColCoeficient <= 9);
		
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

	@Override
	public void attack(int row, int col) {
		// TODO Auto-generated method stub
		
	}
}
