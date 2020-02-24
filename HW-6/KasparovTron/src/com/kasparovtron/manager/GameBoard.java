package com.kasparovtron.manager;

import com.kasparovtron.config.PieceColor;
import com.kasparovtron.pieces.Bishop;
import com.kasparovtron.pieces.King;
import com.kasparovtron.pieces.*;

public class GameBoard {
	
	public static Peice board[][] = new Peice[10][10];
	public static Peice activePeice;
	
	public static void init() {

		initPiece(new Rook(PieceColor.BLACK, 0, 0));
		initPiece(new Knight(PieceColor.BLACK, 0, 1));
		initPiece(new Bishop(PieceColor.BLACK, 0, 2));
		initPiece(new King(PieceColor.BLACK, 0, 3));
		initPiece(new Queen(PieceColor.BLACK, 0, 4));
		
		initPiece(new Pawn(PieceColor.BLACK, 1, 0));
		initPiece(new Pawn(PieceColor.BLACK, 1, 1));
		initPiece(new Pawn(PieceColor.BLACK, 1, 2));
		initPiece(new Pawn(PieceColor.BLACK, 1, 3));
		initPiece(new Pawn(PieceColor.BLACK, 1, 4));		

		initPiece(new Rook(PieceColor.WHITE, 9, 0));
		initPiece(new Knight(PieceColor.WHITE, 9, 1));
		initPiece(new Bishop(PieceColor.WHITE, 9, 2));
		initPiece(new King(PieceColor.WHITE, 9, 3));
		initPiece(new Queen(PieceColor.WHITE, 9, 4));
		
		initPiece(new Pawn(PieceColor.WHITE, 8, 0));
		initPiece(new Pawn(PieceColor.WHITE, 8, 1));
		initPiece(new Pawn(PieceColor.WHITE, 8, 2));
		initPiece(new Pawn(PieceColor.WHITE, 8, 3));
		initPiece(new Pawn(PieceColor.WHITE, 8, 4));		
	}
	
	public static void initPiece(Peice piece) {
		
		// int row = piece.row;
		int row = piece.getRow();
		
		// int col = piece.col;
		int col = piece.getCol();
		
		board[row][col] = piece;
	}
	
	public static boolean isPieceSelectable(int row, int col) {
		return(board[row][col] != null); 
	}
	
	
	public static void selectPiece(int row, int col) {
		activePeice = board[row][col];
	}
	
	public static boolean isPieceMovable(int row, int col) {
		return activePeice.isMovePosible(row, col);
	}
	
	// Bad design
	public static void move(int row, int col) {
		
		board[row][col] = activePeice;
		activePeice.move(row, col);
	}
	
	
	public static void movePiece(int row, int col) {
		
		// int currentRow = activePeice.row;
		int currentRow = activePeice.getRow();
		
		// int currentCol = activePeice.col;
		int currentCol = activePeice.getCol();
		
		activePeice.move(row, col);
		board[row][col] = activePeice;
		
		board[currentRow][currentCol] = null; 
	}
	
	public static void render() {
		
		
		Peice currentTile = null;
		for(int i = 0; i < board.length; i ++) {
			
			for(int j = 0; j < board.length; j++) {
				
				currentTile  = board[i][j];
				String tileSignature = (currentTile == null) ? 
										"* " : 
										currentTile.getStignature() + " ";
				
				System.out.print(tileSignature);
			}
			System.out.println();
		}
	}
}