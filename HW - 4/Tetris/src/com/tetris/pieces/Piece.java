package com.tetris.pieces;

public abstract class Piece {
	public int Ax;
	public int Ay;
	public int Bx;
	public int By;
	public int Cx;
	public int Cy;
	public int Dx;
	public int Dy;
	
	public int row = Ax;
	public int col = Ay;
	
    public Piece(int Ax, int Ay) {
		this.Ax = Ax;
		this.Ay = Ay;
	}
    
    public abstract void move(int MoveRow, int MoveCol);
    
    public abstract void rotate(int degree);

}
