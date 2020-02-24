package com.kasparovtron.pieces;

import com.kasparovtron.config.PieceColor;

public abstract class Peice {

	protected String color;
	protected int power;
	protected int id;
	
	protected int row;
	protected int col;
	protected String signature;
	
	public void setRow(int row) {
		
		if(row >= 0 || row <= 9) {
			this.row = row;
		}
	}
	
	public void setCol(int col) {
		
		if(col >= 0 || col <= 9) {
			this.col = col;
		}
	}
	
	public int getRow() {
		return this.row;
	}
	
	public int getCol() {
		return this.col;
	}
	
	
	
	public Peice(String color, String signature, int row, int col) {
		
		this.color 		= color;
		this.row 		= row;
		this.col 		= col;
		this.signature 	= signature;
	}
	
	public String getStignature() {
		
		if(this.color.equals(PieceColor.WHITE)) {
			return "w" + this.signature;	
		}
		
		return "b" + this.signature;		
	}
	
	public abstract boolean isMovePosible(int row, int col);
	
	public void move(int moveRow, int moveCol) {
		
		if(this.isMovePosible(moveRow, moveCol)) {
			
			this.row = moveRow;
			this.col = moveCol;
		}		
	}
	
	public abstract void attack(int attackRow, int attackCol);
}
