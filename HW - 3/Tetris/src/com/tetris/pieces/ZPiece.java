package com.tetris.pieces;

public class ZPiece extends Piece {
	public ZPiece(int Ax, int Ay)
	{	
		super(Ax, Ay);
		this.Bx = Ax + 1;
		this.By = Ay;
		
		this.Cx = Ax + 1;
		this.Cy = Ay - 1;
		
		this.Dx = Ax + 2;
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
		
		boolean StartPossitions = (Ax >= 2 && Dx <= 13 && Ay <= 25 && Dy >= 2);
		boolean OnTheBoarderLeft = (MoveAx >= 2);
		boolean OnTheBoarderRight = (MoveDx <= 13);
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
		int RAx;
		int RAy;
		int RBx;
		int RBy;
		int RCx;
		int RCy;
		int RDx;
		int RDy;
		
		if(degree == 90)
		{
			RAx = Ax;
			RBx = Ax;
			RCx = Ax + 1;
			RDx = Ax + 1;
			RAy = Ay;
			RBy = Ay + 1;
			RCy = Ay + 1;
			RDy = Ay + 2;
		}	
		
		else if(degree == 180)
		{
			RAy = Ay;
			RBy = Ay;
			RCy = Ay - 1;
			RDy = Ay - 1;
			RAx = Ax;
			RBx = Ax - 1;
			RCx = Ax - 1;
			RDx = Ax - 2;
		}
		
		else if(degree == 270)
		{
			RAx = Ax;
			RBx = Ax;
			RCx = Ax - 1;
			RDx = Ax - 1;
			RAy = Ay;
			RBy = By - 1;
			RCy = Cy - 1;
			RDy = Dy - 2;
		}
		
		else {
			RAx = Ax;
			RBx = Bx;
			RCx = Cx;
			RDx = Dx;
			RAy = Ay;
			RBy = By;
			RCy = Cy;
			RDy = Dy;
		}
	}

}
