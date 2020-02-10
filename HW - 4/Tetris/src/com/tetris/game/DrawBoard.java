package com.tetris.game;
import com.tetris.game.*;
import com.tetris.pieces.AnglePiece;
import com.tetris.pieces.HorizontlePiece;
import com.tetris.pieces.SquarePiece;
import com.tetris.pieces.TPiece;
import com.tetris.pieces.ZPiece;

public class DrawBoard {
	
	public static int TypeOfPiece() {
		int max = 5;
		int min = 1;
		int range = 5;
		int type = (int) (Math.random()*range) + min;	
		return type;
		}
	
	public static int SpawnPossition() {
		int max = 8;
		int min = 5;
		int range = 3;
		int spawn = (int) (Math.random()*range) + min;	
		return spawn;
	}
	
	public final static void clearConsole() {
		for (int i = 0; i < 200; i++) {
			System.out.println();
		}
	}
	
	public static void GameOver() {
		clearConsole();
		System.out.println("Game Over");
	}
	
	public static void ClearRow() {
		GameBoard.board[2][2] = "  ";
		GameBoard.board[3][2] = "  ";
		GameBoard.board[4][2] = "  ";
		GameBoard.board[5][2] = "  ";
		GameBoard.board[6][2] = "  ";
		GameBoard.board[7][2] = "  ";
		GameBoard.board[8][2] = "  ";
		GameBoard.board[9][2] = "  ";
		GameBoard.board[10][2] = "  ";
		GameBoard.board[11][2] = "  ";
		GameBoard.board[12][2] = "  ";
		GameBoard.board[13][2] = "  ";
	}
	
	public static void Draw() {
		
		
	
	GameBoard.board[1][25] = "||";
	GameBoard.board[1][24] = "||";
	GameBoard.board[1][23] = "||";
	GameBoard.board[1][22] = "||";
	GameBoard.board[1][21] = "||";
	GameBoard.board[1][20] = "||";
	GameBoard.board[1][19] = "||";
	GameBoard.board[1][18] = "||";
	GameBoard.board[1][17] = "||";
	GameBoard.board[1][16] = "||";
	GameBoard.board[1][15] = "||";
	GameBoard.board[1][14] = "||";
	GameBoard.board[1][13] = "||";
	GameBoard.board[1][12] = "||";
	GameBoard.board[1][11] = "||";
	GameBoard.board[1][10] = "||";
	GameBoard.board[1][9] = "||";
	GameBoard.board[1][8] = "||";
	GameBoard.board[1][7] = "||";
	GameBoard.board[1][6] = "||";
	GameBoard.board[1][5] = "||";
	GameBoard.board[1][4] = "||";
	GameBoard.board[1][3] = "||";
	GameBoard.board[1][2] = "||";
	GameBoard.board[1][1] = "==";
	
	GameBoard.board[2][25] = "  ";
	GameBoard.board[2][24] = "  ";
	GameBoard.board[2][23] = "  ";
	GameBoard.board[2][22] = "  ";
	GameBoard.board[2][21] = "  ";
	GameBoard.board[2][20] = "  ";
	GameBoard.board[2][19] = "  ";
	GameBoard.board[2][18] = "  ";
	GameBoard.board[2][17] = "  ";
	GameBoard.board[2][16] = "  ";
	GameBoard.board[2][15] = "  ";
	GameBoard.board[2][14] = "  ";
	GameBoard.board[2][13] = "  ";
	GameBoard.board[2][12] = "  ";
	GameBoard.board[2][11] = "  ";
	GameBoard.board[2][10] = "  ";
	GameBoard.board[2][9] = "  ";
	GameBoard.board[2][8] = "  ";
	GameBoard.board[2][7] = "  ";
	GameBoard.board[2][6] = "  ";
	GameBoard.board[2][5] = "  ";
	GameBoard.board[2][4] = "  ";
	GameBoard.board[2][3] = "  ";
	GameBoard.board[2][2] = "  ";
	GameBoard.board[2][1] = "==";
	
	GameBoard.board[3][25] = "  ";
	GameBoard.board[3][24] = "  ";
	GameBoard.board[3][23] = "  ";
	GameBoard.board[3][22] = "  ";
	GameBoard.board[3][21] = "  ";
	GameBoard.board[3][20] = "  ";
	GameBoard.board[3][19] = "  ";
	GameBoard.board[3][18] = "  ";
	GameBoard.board[3][17] = "  ";
	GameBoard.board[3][16] = "  ";
	GameBoard.board[3][15] = "  ";
	GameBoard.board[3][14] = "  ";
	GameBoard.board[3][13] = "  ";
	GameBoard.board[3][12] = "  ";
	GameBoard.board[3][11] = "  ";
	GameBoard.board[3][10] = "  ";
	GameBoard.board[3][9] = "  ";
	GameBoard.board[3][8] = "  ";
	GameBoard.board[3][7] = "  ";
	GameBoard.board[3][6] = "  ";
	GameBoard.board[3][5] = "  ";
	GameBoard.board[3][4] = "  ";
	GameBoard.board[3][3] = "  ";
	GameBoard.board[3][2] = "  ";
	GameBoard.board[3][1] = "==";
	
	GameBoard.board[4][25] = "  ";
	GameBoard.board[4][24] = "  ";
	GameBoard.board[4][23] = "  ";
	GameBoard.board[4][22] = "  ";
	GameBoard.board[4][21] = "  ";
	GameBoard.board[4][20] = "  ";
	GameBoard.board[4][19] = "  ";
	GameBoard.board[4][18] = "  ";
	GameBoard.board[4][17] = "  ";
	GameBoard.board[4][16] = "  ";
	GameBoard.board[4][15] = "  ";
	GameBoard.board[4][14] = "  ";
	GameBoard.board[4][13] = "  ";
	GameBoard.board[4][12] = "  ";
	GameBoard.board[4][11] = "  ";
	GameBoard.board[4][10] = "  ";
	GameBoard.board[4][9] = "  ";
	GameBoard.board[4][8] = "  ";
	GameBoard.board[4][7] = "  ";
	GameBoard.board[4][6] = "  ";
	GameBoard.board[4][5] = "  ";
	GameBoard.board[4][4] = "  ";
	GameBoard.board[4][3] = "  ";
	GameBoard.board[4][2] = "  ";
	GameBoard.board[4][1] = "==";
	
	GameBoard.board[5][25] = "  ";
	GameBoard.board[5][24] = "  ";
	GameBoard.board[5][23] = "  ";
	GameBoard.board[5][22] = "  ";
	GameBoard.board[5][21] = "  ";
	GameBoard.board[5][20] = "  ";
	GameBoard.board[5][19] = "  ";
	GameBoard.board[5][18] = "  ";
	GameBoard.board[5][17] = "  ";
	GameBoard.board[5][16] = "  ";
	GameBoard.board[5][15] = "  ";
	GameBoard.board[5][14] = "  ";
	GameBoard.board[5][13] = "  ";
	GameBoard.board[5][12] = "  ";
	GameBoard.board[5][11] = "  ";
	GameBoard.board[5][10] = "  ";
	GameBoard.board[5][9] = "  ";
	GameBoard.board[5][8] = "  ";
	GameBoard.board[5][7] = "  ";
	GameBoard.board[5][6] = "  ";
	GameBoard.board[5][5] = "  ";
	GameBoard.board[5][4] = "  ";
	GameBoard.board[5][3] = "  ";
	GameBoard.board[5][2] = "  ";
	GameBoard.board[5][1] = "==";
	
	GameBoard.board[6][25] = "  ";
	GameBoard.board[6][24] = "  ";
	GameBoard.board[6][23] = "  ";
	GameBoard.board[6][22] = "  ";
	GameBoard.board[6][21] = "  ";
	GameBoard.board[6][20] = "  ";
	GameBoard.board[6][19] = "  ";
	GameBoard.board[6][18] = "  ";
	GameBoard.board[6][17] = "  ";
	GameBoard.board[6][16] = "  ";
	GameBoard.board[6][15] = "  ";
	GameBoard.board[6][14] = "  ";
	GameBoard.board[6][13] = "  ";
	GameBoard.board[6][12] = "  ";
	GameBoard.board[6][11] = "  ";
	GameBoard.board[6][10] = "  ";
	GameBoard.board[6][9] = "  ";
	GameBoard.board[6][8] = "  ";
	GameBoard.board[6][7] = "  ";
	GameBoard.board[6][6] = "  ";
	GameBoard.board[6][5] = "  ";
	GameBoard.board[6][4] = "  ";
	GameBoard.board[6][3] = "  ";
	GameBoard.board[6][2] = "  ";
	GameBoard.board[6][1] = "==";
	
	GameBoard.board[7][25] = "  ";
	GameBoard.board[7][24] = "  ";
	GameBoard.board[7][23] = "  ";
	GameBoard.board[7][22] = "  ";
	GameBoard.board[7][21] = "  ";
	GameBoard.board[7][20] = "  ";
	GameBoard.board[7][19] = "  ";
	GameBoard.board[7][18] = "  ";
	GameBoard.board[7][17] = "  ";
	GameBoard.board[7][16] = "  ";
	GameBoard.board[7][15] = "  ";
	GameBoard.board[7][14] = "  ";
	GameBoard.board[7][13] = "  ";
	GameBoard.board[7][12] = "  ";
	GameBoard.board[7][11] = "  ";
	GameBoard.board[7][10] = "  ";
	GameBoard.board[7][9] = "  ";
	GameBoard.board[7][8] = "  ";
	GameBoard.board[7][7] = "  ";
	GameBoard.board[7][6] = "  ";
	GameBoard.board[7][5] = "  ";
	GameBoard.board[7][4] = "  ";
	GameBoard.board[7][3] = "  ";
	GameBoard.board[7][2] = "  ";
	GameBoard.board[7][1] = "==";
	
	GameBoard.board[8][25] = "  ";
	GameBoard.board[8][24] = "  ";
	GameBoard.board[8][23] = "  ";
	GameBoard.board[8][22] = "  ";
	GameBoard.board[8][21] = "  ";
	GameBoard.board[8][20] = "  ";
	GameBoard.board[8][19] = "  ";
	GameBoard.board[8][18] = "  ";
	GameBoard.board[8][17] = "  ";
	GameBoard.board[8][16] = "  ";
	GameBoard.board[8][15] = "  ";
	GameBoard.board[8][14] = "  ";
	GameBoard.board[8][13] = "  ";
	GameBoard.board[8][12] = "  ";
	GameBoard.board[8][11] = "  ";
	GameBoard.board[8][10] = "  ";
	GameBoard.board[8][9] = "  ";
	GameBoard.board[8][8] = "  ";
	GameBoard.board[8][7] = "  ";
	GameBoard.board[8][6] = "  ";
	GameBoard.board[8][5] = "  ";
	GameBoard.board[8][4] = "  ";
	GameBoard.board[8][3] = "  ";
	GameBoard.board[8][2] = "  ";
	GameBoard.board[8][1] = "==";
	
	GameBoard.board[9][25] = "  ";
	GameBoard.board[9][24] = "  ";
	GameBoard.board[9][23] = "  ";
	GameBoard.board[9][22] = "  ";
	GameBoard.board[9][21] = "  ";
	GameBoard.board[9][20] = "  ";
	GameBoard.board[9][19] = "  ";
	GameBoard.board[9][18] = "  ";
	GameBoard.board[9][17] = "  ";
	GameBoard.board[9][16] = "  ";
	GameBoard.board[9][15] = "  ";
	GameBoard.board[9][14] = "  ";
	GameBoard.board[9][13] = "  ";
	GameBoard.board[9][12] = "  ";
	GameBoard.board[9][11] = "  ";
	GameBoard.board[9][10] = "  ";
	GameBoard.board[9][9] = "  ";
	GameBoard.board[9][8] = "  ";
	GameBoard.board[9][7] = "  ";
	GameBoard.board[9][6] = "  ";
	GameBoard.board[9][5] = "  ";
	GameBoard.board[9][4] = "  ";
	GameBoard.board[9][3] = "  ";
	GameBoard.board[9][2] = "  ";
	GameBoard.board[9][1] = "==";
	
	GameBoard.board[10][25] = "  ";
	GameBoard.board[10][24] = "  ";
	GameBoard.board[10][23] = "  ";
	GameBoard.board[10][22] = "  ";
	GameBoard.board[10][21] = "  ";
	GameBoard.board[10][20] = "  ";
	GameBoard.board[10][19] = "  ";
	GameBoard.board[10][18] = "  ";
	GameBoard.board[10][17] = "  ";
	GameBoard.board[10][16] = "  ";
	GameBoard.board[10][15] = "  ";
	GameBoard.board[10][14] = "  ";
	GameBoard.board[10][13] = "  ";
	GameBoard.board[10][12] = "  ";
	GameBoard.board[10][11] = "  ";
	GameBoard.board[10][10] = "  ";
	GameBoard.board[10][9] = "  ";
	GameBoard.board[10][8] = "  ";
	GameBoard.board[10][7] = "  ";
	GameBoard.board[10][6] = "  ";
	GameBoard.board[10][5] = "  ";
	GameBoard.board[10][4] = "  ";
	GameBoard.board[10][3] = "  ";
	GameBoard.board[10][2] = "  ";
	GameBoard.board[10][1] = "==";
	
	GameBoard.board[11][25] = "  ";
	GameBoard.board[11][24] = "  ";
	GameBoard.board[11][23] = "  ";
	GameBoard.board[11][22] = "  ";
	GameBoard.board[11][21] = "  ";
	GameBoard.board[11][20] = "  ";
	GameBoard.board[11][19] = "  ";
	GameBoard.board[11][18] = "  ";
	GameBoard.board[11][17] = "  ";
	GameBoard.board[11][16] = "  ";
	GameBoard.board[11][15] = "  ";
	GameBoard.board[11][14] = "  ";
	GameBoard.board[11][13] = "  ";
	GameBoard.board[11][12] = "  ";
	GameBoard.board[11][11] = "  ";
	GameBoard.board[11][10] = "  ";
	GameBoard.board[11][9] = "  ";
	GameBoard.board[11][8] = "  ";
	GameBoard.board[11][7] = "  ";
	GameBoard.board[11][6] = "  ";
	GameBoard.board[11][5] = "  ";
	GameBoard.board[11][4] = "  ";
	GameBoard.board[11][3] = "  ";
	GameBoard.board[11][2] = "  ";
	GameBoard.board[11][1] = "==";
	
	GameBoard.board[12][25] = "  ";
	GameBoard.board[12][24] = "  ";
	GameBoard.board[12][23] = "  ";
	GameBoard.board[12][22] = "  ";
	GameBoard.board[12][21] = "  ";
	GameBoard.board[12][20] = "  ";
	GameBoard.board[12][19] = "  ";
	GameBoard.board[12][18] = "  ";
	GameBoard.board[12][17] = "  ";
	GameBoard.board[12][16] = "  ";
	GameBoard.board[12][15] = "  ";
	GameBoard.board[12][14] = "  ";
	GameBoard.board[12][13] = "  ";
	GameBoard.board[12][12] = "  ";
	GameBoard.board[12][11] = "  ";
	GameBoard.board[12][10] = "  ";
	GameBoard.board[12][9] = "  ";
	GameBoard.board[12][8] = "  ";
	GameBoard.board[12][7] = "  ";
	GameBoard.board[12][6] = "  ";
	GameBoard.board[12][5] = "  ";
	GameBoard.board[12][4] = "  ";
	GameBoard.board[12][3] = "  ";
	GameBoard.board[12][2] = "  ";
	GameBoard.board[12][1] = "==";
	
	GameBoard.board[13][25] = "  ";
	GameBoard.board[13][24] = "  ";
	GameBoard.board[13][23] = "  ";
	GameBoard.board[13][22] = "  ";
	GameBoard.board[13][21] = "  ";
	GameBoard.board[13][20] = "  ";
	GameBoard.board[13][19] = "  ";
	GameBoard.board[13][18] = "  ";
	GameBoard.board[13][17] = "  ";
	GameBoard.board[13][16] = "  ";
	GameBoard.board[13][15] = "  ";
	GameBoard.board[13][14] = "  ";
	GameBoard.board[13][13] = "  ";
	GameBoard.board[13][12] = "  ";
	GameBoard.board[13][11] = "  ";
	GameBoard.board[13][10] = "  ";
	GameBoard.board[13][9] = "  ";
	GameBoard.board[13][8] = "  ";
	GameBoard.board[13][7] = "  ";
	GameBoard.board[13][6] = "  ";
	GameBoard.board[13][5] = "  ";
	GameBoard.board[13][4] = "  ";
	GameBoard.board[13][3] = "  ";
	GameBoard.board[13][2] = "  ";
	GameBoard.board[13][1] = "==";
	
	GameBoard.board[14][25] = "||";
	GameBoard.board[14][24] = "||";
	GameBoard.board[14][23] = "||";
	GameBoard.board[14][22] = "||";
	GameBoard.board[14][21] = "||";
	GameBoard.board[14][20] = "||";
	GameBoard.board[14][19] = "||";
	GameBoard.board[14][18] = "||";
	GameBoard.board[14][17] = "||";
	GameBoard.board[14][16] = "||";
	GameBoard.board[14][15] = "||";
	GameBoard.board[14][14] = "||";
	GameBoard.board[14][13] = "||";
	GameBoard.board[14][12] = "||";
	GameBoard.board[14][11] = "||";
	GameBoard.board[14][10] = "||";
	GameBoard.board[14][9] = "||";
	GameBoard.board[14][8] = "||";
	GameBoard.board[14][7] = "||";
	GameBoard.board[14][6] = "||";
	GameBoard.board[14][5] = "||";
	GameBoard.board[14][4] = "||";
	GameBoard.board[14][3] = "||";
	GameBoard.board[14][2] = "||";
	GameBoard.board[14][1] = "==";
	
	switch(TypeOfPiece()) {
	case 1:
		switch(SpawnPossition()) {
		//Horizontal
		case 5:
			GameBoard.board[5][24] = "[]";
			GameBoard.board[6][24] = "[]";
			GameBoard.board[7][24] = "[]";
			GameBoard.board[8][24] = "[]";
			break;
		case 6:
			GameBoard.board[6][24] = "[]";
			GameBoard.board[7][24] = "[]";
			GameBoard.board[8][24] = "[]";
			GameBoard.board[9][24] = "[]";
			break;
		case 7:
			GameBoard.board[7][24] = "[]";
			GameBoard.board[8][24] = "[]";
			GameBoard.board[9][24] = "[]";
			GameBoard.board[10][24] = "[]";
			break;
		case 8:
			GameBoard.board[8][24] = "[]";
			GameBoard.board[9][24] = "[]";
			GameBoard.board[10][24] = "[]";
			GameBoard.board[11][24] = "[]";
			break;
		}
		break;
	case 2:
		//TPiece
		switch(SpawnPossition()) {
		case 5:
			GameBoard.board[5][24] = "[]";
			GameBoard.board[6][24] = "[]";
			GameBoard.board[7][24] = "[]";
			GameBoard.board[6][23] = "[]";
			break;
		case 6:
			GameBoard.board[6][24] = "[]";
			GameBoard.board[7][24] = "[]";
			GameBoard.board[8][24] = "[]";
			GameBoard.board[7][23] = "[]";
			break;
		case 7:
			GameBoard.board[7][24] = "[]";
			GameBoard.board[8][24] = "[]";
			GameBoard.board[9][24] = "[]";
			GameBoard.board[8][23] = "[]";
			break;
		case 8:
			GameBoard.board[8][24] = "[]";
			GameBoard.board[9][24] = "[]";
			GameBoard.board[10][24] = "[]";
			GameBoard.board[9][23] = "[]";	
			break;
		}
		break;
	case 3:
		//ZPiece
		switch(SpawnPossition()) {
		case 5:
			GameBoard.board[5][24] = "[]";
			GameBoard.board[6][24] = "[]";
			GameBoard.board[6][23] = "[]";
			GameBoard.board[7][23] = "[]";	
			break;
		case 6:
			GameBoard.board[6][24] = "[]";
			GameBoard.board[7][24] = "[]";
			GameBoard.board[7][23] = "[]";
			GameBoard.board[8][23] = "[]";	
			break;
		case 7:
			GameBoard.board[7][24] = "[]";
			GameBoard.board[8][24] = "[]";
			GameBoard.board[8][23] = "[]";
			GameBoard.board[9][23] = "[]";	
			break;
		case 8:
			GameBoard.board[8][24] = "[]";
			GameBoard.board[9][24] = "[]";
			GameBoard.board[9][23] = "[]";
			GameBoard.board[10][23] = "[]";	
			break;
		}
		break;
	case 4:
	//Angle
	switch(SpawnPossition()) {
	case 5:
		GameBoard.board[5][24] = "[]";
		GameBoard.board[6][24] = "[]";
		GameBoard.board[7][24] = "[]";
		GameBoard.board[7][23] = "[]";	
		break;
	case 6:
		GameBoard.board[6][24] = "[]";
		GameBoard.board[7][24] = "[]";
		GameBoard.board[8][24] = "[]";
		GameBoard.board[8][23] = "[]";	
		break;
	case 7:
		GameBoard.board[7][24] = "[]";
		GameBoard.board[8][24] = "[]";
		GameBoard.board[9][24] = "[]";
		GameBoard.board[9][23] = "[]";	
		break;
	case 8:
		GameBoard.board[8][24] = "[]";
		GameBoard.board[9][24] = "[]";
		GameBoard.board[10][24] = "[]";
		GameBoard.board[10][23] = "[]";	
		break;
	}
	    break;
	case 5:
	//Square
		switch(SpawnPossition()) {
		case 5:
			GameBoard.board[5][24] = "[]";
			GameBoard.board[5][23] = "[]";
			GameBoard.board[6][24] = "[]";
			GameBoard.board[6][23] = "[]";	
			break;
		case 6:
			GameBoard.board[6][24] = "[]";
			GameBoard.board[6][23] = "[]";
			GameBoard.board[7][24] = "[]";
			GameBoard.board[7][23] = "[]";	
			break;
		case 7:
			GameBoard.board[7][24] = "[]";
			GameBoard.board[7][23] = "[]";
			GameBoard.board[8][24] = "[]";
			GameBoard.board[8][23] = "[]";	
			break;
		case 8:
			GameBoard.board[8][24] = "[]";
			GameBoard.board[8][23] = "[]";
			GameBoard.board[9][24] = "[]";
			GameBoard.board[9][23] = "[]";	
			break;
		}
	    break;
		
	}
	
	
	System.out.println(GameBoard.board[1][24] + GameBoard.board[2][24] + GameBoard.board[3][24] + GameBoard.board[4][24] + GameBoard.board[5][24] + GameBoard.board[6][24] + GameBoard.board[7][24] + GameBoard.board[8][24] + GameBoard.board[9][24] + GameBoard.board[10][24] + GameBoard.board[11][24] + GameBoard.board[12][24] + GameBoard.board[13][24] + GameBoard.board[14][24]);
	System.out.println(GameBoard.board[1][23] + GameBoard.board[2][23] + GameBoard.board[3][23] + GameBoard.board[4][23] + GameBoard.board[5][23] + GameBoard.board[6][23] + GameBoard.board[7][23] + GameBoard.board[8][23] + GameBoard.board[9][23] + GameBoard.board[10][23] + GameBoard.board[11][23] + GameBoard.board[12][23] + GameBoard.board[13][23] + GameBoard.board[14][23]);
	System.out.println(GameBoard.board[1][22] + GameBoard.board[2][22] + GameBoard.board[3][22] + GameBoard.board[4][22] + GameBoard.board[5][22] + GameBoard.board[6][22] + GameBoard.board[7][22] + GameBoard.board[8][22] + GameBoard.board[9][22] + GameBoard.board[10][22] + GameBoard.board[11][22] + GameBoard.board[12][22] + GameBoard.board[13][22] + GameBoard.board[14][22]);
	System.out.println(GameBoard.board[1][21] + GameBoard.board[2][21] + GameBoard.board[3][21] + GameBoard.board[4][21] + GameBoard.board[5][21] + GameBoard.board[6][21] + GameBoard.board[7][21] + GameBoard.board[8][21] + GameBoard.board[9][21] + GameBoard.board[10][21] + GameBoard.board[11][21] + GameBoard.board[12][21] + GameBoard.board[13][21] + GameBoard.board[14][21]);
	System.out.println(GameBoard.board[1][20] + GameBoard.board[2][20] + GameBoard.board[3][20] + GameBoard.board[4][20] + GameBoard.board[5][20] + GameBoard.board[6][20] + GameBoard.board[7][20] + GameBoard.board[8][20] + GameBoard.board[9][20] + GameBoard.board[10][20] + GameBoard.board[11][20] + GameBoard.board[12][20] + GameBoard.board[13][20] + GameBoard.board[14][20]);
	System.out.println(GameBoard.board[1][19] + GameBoard.board[2][19] + GameBoard.board[3][19] + GameBoard.board[4][19] + GameBoard.board[5][19] + GameBoard.board[6][19] + GameBoard.board[7][19] + GameBoard.board[8][19] + GameBoard.board[9][19] + GameBoard.board[10][19] + GameBoard.board[11][19] + GameBoard.board[12][19] + GameBoard.board[13][19] + GameBoard.board[14][19]);
	System.out.println(GameBoard.board[1][18] + GameBoard.board[2][18] + GameBoard.board[3][18] + GameBoard.board[4][18] + GameBoard.board[5][18] + GameBoard.board[6][18] + GameBoard.board[7][18] + GameBoard.board[8][18] + GameBoard.board[9][18] + GameBoard.board[10][18] + GameBoard.board[11][18] + GameBoard.board[12][18] + GameBoard.board[13][18] + GameBoard.board[14][18]);
	System.out.println(GameBoard.board[1][17] + GameBoard.board[2][17] + GameBoard.board[3][17] + GameBoard.board[4][17] + GameBoard.board[5][17] + GameBoard.board[6][17] + GameBoard.board[7][17] + GameBoard.board[8][17] + GameBoard.board[9][17] + GameBoard.board[10][17] + GameBoard.board[11][17] + GameBoard.board[12][17] + GameBoard.board[13][17] + GameBoard.board[14][17]);
	System.out.println(GameBoard.board[1][16] + GameBoard.board[2][16] + GameBoard.board[3][16] + GameBoard.board[4][16] + GameBoard.board[5][16] + GameBoard.board[6][16] + GameBoard.board[7][16] + GameBoard.board[8][16] + GameBoard.board[9][16] + GameBoard.board[10][16] + GameBoard.board[11][16] + GameBoard.board[12][16] + GameBoard.board[13][16] + GameBoard.board[14][16]);
	System.out.println(GameBoard.board[1][15] + GameBoard.board[2][15] + GameBoard.board[3][15] + GameBoard.board[4][15] + GameBoard.board[5][15] + GameBoard.board[6][15] + GameBoard.board[7][15] + GameBoard.board[8][15] + GameBoard.board[9][15] + GameBoard.board[10][15] + GameBoard.board[11][15] + GameBoard.board[12][15] + GameBoard.board[13][15] + GameBoard.board[14][15]);
	System.out.println(GameBoard.board[1][14] + GameBoard.board[2][14] + GameBoard.board[3][14] + GameBoard.board[4][14] + GameBoard.board[5][14] + GameBoard.board[6][14] + GameBoard.board[7][14] + GameBoard.board[8][14] + GameBoard.board[9][14] + GameBoard.board[10][14] + GameBoard.board[11][14] + GameBoard.board[12][14] + GameBoard.board[13][14] + GameBoard.board[14][14]);
	System.out.println(GameBoard.board[1][13] + GameBoard.board[2][13] + GameBoard.board[3][13] + GameBoard.board[4][13] + GameBoard.board[5][13] + GameBoard.board[6][13] + GameBoard.board[7][13] + GameBoard.board[8][13] + GameBoard.board[9][13] + GameBoard.board[10][13] + GameBoard.board[11][13] + GameBoard.board[12][13] + GameBoard.board[13][13] + GameBoard.board[14][13]);
	System.out.println(GameBoard.board[1][12] + GameBoard.board[2][12] + GameBoard.board[3][12] + GameBoard.board[4][12] + GameBoard.board[5][12] + GameBoard.board[6][12] + GameBoard.board[7][12] + GameBoard.board[8][12] + GameBoard.board[9][12] + GameBoard.board[10][12] + GameBoard.board[11][12] + GameBoard.board[12][12] + GameBoard.board[13][12] + GameBoard.board[14][12]);
	System.out.println(GameBoard.board[1][11] + GameBoard.board[2][11] + GameBoard.board[3][11] + GameBoard.board[4][11] + GameBoard.board[5][11] + GameBoard.board[6][11] + GameBoard.board[7][11] + GameBoard.board[8][11] + GameBoard.board[9][11] + GameBoard.board[10][11] + GameBoard.board[11][11] + GameBoard.board[12][11] + GameBoard.board[13][11] + GameBoard.board[14][11]);
	System.out.println(GameBoard.board[1][10] + GameBoard.board[2][10] + GameBoard.board[3][10] + GameBoard.board[4][10] + GameBoard.board[5][10] + GameBoard.board[6][10] + GameBoard.board[7][10] + GameBoard.board[8][10] + GameBoard.board[9][10] + GameBoard.board[10][10] + GameBoard.board[11][10] + GameBoard.board[12][10] + GameBoard.board[13][10] + GameBoard.board[14][10]);
	System.out.println(GameBoard.board[1][9]  + GameBoard.board[2][9]  + GameBoard.board[3][9]  + GameBoard.board[4][9]  + GameBoard.board[5][9]  + GameBoard.board[6][9]  + GameBoard.board[7][9]  + GameBoard.board[8][9]  + GameBoard.board[9][9]  + GameBoard.board[10][9]  + GameBoard.board[11][9]  + GameBoard.board[12][9]  + GameBoard.board[13][9]  + GameBoard.board[14][9]);
	System.out.println(GameBoard.board[1][8]  + GameBoard.board[2][8]  + GameBoard.board[3][8]  + GameBoard.board[4][8]  + GameBoard.board[5][8]  + GameBoard.board[6][8]  + GameBoard.board[7][8]  + GameBoard.board[8][8]  + GameBoard.board[9][8]  + GameBoard.board[10][8]  + GameBoard.board[11][8]  + GameBoard.board[12][8]  + GameBoard.board[13][8]  + GameBoard.board[14][8]);
	System.out.println(GameBoard.board[1][7]  + GameBoard.board[2][7]  + GameBoard.board[3][7]  + GameBoard.board[4][7]  + GameBoard.board[5][7]  + GameBoard.board[6][7]  + GameBoard.board[7][7]  + GameBoard.board[8][7]  + GameBoard.board[9][7]  + GameBoard.board[10][7]  + GameBoard.board[11][7]  + GameBoard.board[12][7]  + GameBoard.board[13][7]  + GameBoard.board[14][7]);
	System.out.println(GameBoard.board[1][6]  + GameBoard.board[2][6]  + GameBoard.board[3][6]  + GameBoard.board[4][6]  + GameBoard.board[5][6]  + GameBoard.board[6][6]  + GameBoard.board[7][6]  + GameBoard.board[8][6]  + GameBoard.board[9][6]  + GameBoard.board[10][6]  + GameBoard.board[11][6]  + GameBoard.board[12][6]  + GameBoard.board[13][6]  + GameBoard.board[14][6]);
	System.out.println(GameBoard.board[1][5]  + GameBoard.board[2][5]  + GameBoard.board[3][5]  + GameBoard.board[4][5]  + GameBoard.board[5][5]  + GameBoard.board[6][5]  + GameBoard.board[7][5]  + GameBoard.board[8][5]  + GameBoard.board[9][5]  + GameBoard.board[10][5]  + GameBoard.board[11][5]  + GameBoard.board[12][5]  + GameBoard.board[13][5]  + GameBoard.board[14][5]);
	System.out.println(GameBoard.board[1][4]  + GameBoard.board[2][4]  + GameBoard.board[3][4]  + GameBoard.board[4][4]  + GameBoard.board[5][4]  + GameBoard.board[6][4]  + GameBoard.board[7][4]  + GameBoard.board[8][4]  + GameBoard.board[9][4]  + GameBoard.board[10][4]  + GameBoard.board[11][4]  + GameBoard.board[12][4]  + GameBoard.board[13][4]  + GameBoard.board[14][4]);
	System.out.println(GameBoard.board[1][3]  + GameBoard.board[2][3]  + GameBoard.board[3][3]  + GameBoard.board[4][3]  + GameBoard.board[5][3]  + GameBoard.board[6][3]  + GameBoard.board[7][3]  + GameBoard.board[8][3]  + GameBoard.board[9][3]  + GameBoard.board[10][3]  + GameBoard.board[11][3]  + GameBoard.board[12][3]  + GameBoard.board[13][3]  + GameBoard.board[14][3]);
	System.out.println(GameBoard.board[1][2]  + GameBoard.board[2][2]  + GameBoard.board[3][2]  + GameBoard.board[4][2]  + GameBoard.board[5][2]  + GameBoard.board[6][2]  + GameBoard.board[7][2]  + GameBoard.board[8][2]  + GameBoard.board[9][2]  + GameBoard.board[10][2]  + GameBoard.board[11][2]  + GameBoard.board[12][2]  + GameBoard.board[13][2]  + GameBoard.board[14][2]);
	System.out.println(GameBoard.board[1][1]  + GameBoard.board[2][1]  + GameBoard.board[3][1]  + GameBoard.board[4][1]  + GameBoard.board[5][1]  + GameBoard.board[6][1]  + GameBoard.board[7][1]  + GameBoard.board[8][1]  + GameBoard.board[9][1]  + GameBoard.board[10][1]  + GameBoard.board[11][1]  + GameBoard.board[12][1]  + GameBoard.board[13][1]  + GameBoard.board[14][1]);
	}
}
