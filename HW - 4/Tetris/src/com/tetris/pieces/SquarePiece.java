package com.tetris.pieces;

public class SquarePiece extends Piece {
	public SquarePiece(int Ax, int Ay)
	{	
		super(Ax, Ay);
		this.Bx = Ax + 1;
		this.By = Ay;
		
		this.Cx = Ax;
		this.Cy = Ay - 1;
		
		this.Dx = Ax + 1;
		this.Dy = Ay - 1;
	}

	public boolean isMovmentPossible(int MoveRow, int MoveCol)
	{
		int NewX = MoveRow - Ax;
		int NewY = MoveCol - Ay;
		int MoveAx = Ax + NewX;
		int MoveAy = Ay + NewY;
		int MoveBx = Bx + NewX;
		int MoveBy = By + NewY;
		int MoveCx = Cx + NewX;
		int MoveCy = Cy + NewY;
		int MoveDx = Dx + NewX;
		int MoveDy = Dy + NewY;
		
		boolean StartPossitions = (Ax >= 2 && Cx <= 13 && Ay <= 25 && Dy >= 2);
		boolean OnTheBoarderLeft = (MoveAx >= 2);
		boolean OnTheBoarderRight = (MoveCx <= 13);
		boolean OnTheBoarderTop = (MoveAy <= 25);
		boolean OnTheBoarderBottom = (MoveDy >= 2);
		boolean isMoveActionValid = (OnTheBoarderLeft && OnTheBoarderRight && OnTheBoarderTop && OnTheBoarderBottom && StartPossitions);
		
		
		return isMoveActionValid;
	}

	@Override
	public void move(int row, int col) {
		if(isMovmentPossible(row, col) == true) {
			this.row = row;
			this.col = col;
		}
	}
	
	public void rotate(int degree)
	{
		int RAx = Ax;
		int RAy = Ay;
		int RBx = Bx;
		int RBy = By;
		int RCx = Cx;
		int RCy = Cy;
		int RDx = Dx;
		int RDy = Dy;
		
		}
	}

