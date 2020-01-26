  
package com.kasparovtron.pieces;

public abstract class Piece {

	public String color;
	public int power;
	public int id;
	
	public int row;
	public int col;

	public Piece(String color, int row, int col) {
		
		this.color 	= color;
		this.row 	= row;
		this.col 	= col;
	}
	
	public Piece(String color) {
		
		this.color 	= color;
		this.row 	= 0;
		this.col 	= 0;
	}	
	
	public abstract void move(int row, int col);
	
	public abstract void attack(int row, int col);
}