package com.tetris.config;

import com.tetris.game.DrawBoard;
import com.tetris.game.GameBoard;

public class Manager {
	{
	if(GameBoard.board[2][26] == "[]" || GameBoard.board[3][25] == "[]" || GameBoard.board[4][25] == "[]" || GameBoard.board[5][25] == "[]" || GameBoard.board[6][25] == "[]" || GameBoard.board[7][25] == "[]" || GameBoard.board[8][25] == "[]" || GameBoard.board[9][25] == "[]" || GameBoard.board[10][25] == "[]" || GameBoard.board[11][25] == "[]" || GameBoard.board[12][25] == "[]" || GameBoard.board[13][25] == "[]" )
	{
		DrawBoard.GameOver();
	}
	
	if(GameBoard.board[2][2] == "[]" && GameBoard.board[3][2] == "[]" && GameBoard.board[4][2] == "[]" && GameBoard.board[5][2] == "[]" && GameBoard.board[6][2] == "[]" && GameBoard.board[7][2] == "[]" && GameBoard.board[8][2] == "[]" && GameBoard.board[9][2] == "[]" && GameBoard.board[10][2] == "[]" && GameBoard.board[11][2] == "[]" && GameBoard.board[12][2] == "[]" && GameBoard.board[13][2] == "[]")
	{
		DrawBoard.ClearRow();
	}
}
}
