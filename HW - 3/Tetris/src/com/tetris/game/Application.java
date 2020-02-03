package com.tetris.game;

import com.tetris.tests.AnglePieceTest;
import com.tetris.tests.HorizontlePieceTest;
import com.tetris.tests.SquarePieceTest;
import com.tetris.tests.TPieceTest;
import com.tetris.tests.ZPieceTest;

public class Application {
	
	public static void main(String[] args) {
	HorizontlePieceTest.TestIfPieceCanMoveOneSquareDown();
	HorizontlePieceTest.FailTestIfPieceCanMoveOneSquareSide();
	ZPieceTest.TestIfPieceCanMoveOneSquareSide();
	ZPieceTest.TestIfPieceCanMoveOneSquareDown();
	AnglePieceTest.TestIfPieceCanMoveOneSquareDown();
	AnglePieceTest.TestIfPieceCanMoveOneSquareSide();
	SquarePieceTest.TestIfPieceCanMoveOneSquareDown();
	SquarePieceTest.TestIfPieceCanMoveOneSquareSide();
	TPieceTest.FailTestIfPieceCanMoveOneSquareSide();
	TPieceTest.TestIfPieceCanMoveOneSquareDown();
	TPieceTest.TestIfPieceCanMoveOneSquareSide();
	}
}
