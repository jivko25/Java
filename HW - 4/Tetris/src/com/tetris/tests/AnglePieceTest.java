package com.tetris.tests;

import com.tetris.pieces.*;

public class AnglePieceTest {
	
	public static void TestIfPieceCanMoveOneSquareDown() {
		System.out.print("Angle Piece one square down - ");
		
		AnglePiece TestDown = new AnglePiece(3, 9);
		
		boolean isPossible = TestDown.isMovmentPossible(3, 4);
		
		String TestMessage = (isPossible) ? "Valid" :  "Fail";
		System.out.println(TestMessage);
	}

	public static void TestIfPieceCanMoveOneSquareSide() {
		System.out.print("Angle one square side - ");
		
		AnglePiece TestSide = new AnglePiece(6, 7);
		
		boolean isPossible = TestSide.isMovmentPossible(8, 7);
		
		String TestMessage = (isPossible) ? "Valid" :  "Fail";
		System.out.println(TestMessage);
	}
}
