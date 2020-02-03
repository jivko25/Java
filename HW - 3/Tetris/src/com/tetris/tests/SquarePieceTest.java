package com.tetris.tests;

import com.tetris.pieces.HorizontlePiece;
import com.tetris.pieces.SquarePiece;

public class SquarePieceTest {
	
	public static void TestIfPieceCanMoveOneSquareDown() {
		System.out.print("Square Piece one square down - ");
		
		SquarePiece TestDown = new SquarePiece(3, 9);
		
		boolean isPossible = TestDown.isMovmentPossible(3, 4);
		
		String TestMessage = (isPossible) ? "Valid" :  "Fail";
		System.out.println(TestMessage);
	}

	public static void TestIfPieceCanMoveOneSquareSide() {
		System.out.print("Square Piece one square side - ");
		
		SquarePiece TestSide = new SquarePiece(10, 9);
		
		boolean isPossible = TestSide.isMovmentPossible(11, 9);
		
		String TestMessage = (isPossible) ? "Valid" :  "Fail";
		System.out.println(TestMessage);
	}
}
