package com.tetris.pieces;

public class HorizontlePiece extends Piece {
	public HorizontlePiece(int Ax, int Ay)
	{	
		super(Ax, Ay);
		this.Bx = Ax + 1;
		this.By = Ay;
		
		this.Cx = Ax + 2;
		this.Cy = Ay;
		
		this.Dx = Ax + 3;
		this.Dy = Ay;
	}
	
	public boolean isMovmentPossible(int MoveRow, int MoveCol)
	{
		int NewX = MoveRow - Ax;
		int NewY = MoveCol - Ay;
		int MoveAx = Ax + NewX;
		int MoveAy = Ay + NewY;;
		int MoveDx = Dx + NewX;
		
		boolean StartPossitions = (Ax >= 2 && Dx <= 13 && Ay <= 25 && Ay >= 2);
		boolean OnTheBoarderLeft = (MoveAx >= 2);
		boolean OnTheBoarderRight = (MoveDx <= 13);
		boolean OnTheBoarderTop = (MoveAy <= 25);
		boolean OnTheBoarderBottom = (MoveAy >= 2);
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
			RBx = Bx;
			RCx = Cx;
			RDx = Dx;
			RAy = Ay;
			RBy = Ay + 1;
			RCy = Ay + 2;
			RDy = Ay + 3;
		}	
		
		else if(degree == 180)
		{
			RAy = Ay;
			RBy = By;
			RCy = Cy;
			RDy = Dy;
			RAx = Ax;
			RBx = Ax - 1;
			RCx = Ax - 2;
			RDx = Ax - 3;
		}
		
		else if(degree == 270)
		{
			RAx = Ax;
			RBx = Bx;
			RCx = Cx;
			RDx = Dx;
			RAy = Ay;
			RBy = Ay - 1;
			RCy = Ay - 2;
			RDy = Ay - 3;
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
	
	
