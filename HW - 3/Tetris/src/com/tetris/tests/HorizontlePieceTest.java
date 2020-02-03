package com.tetris.tests;

import com.tetris.pieces.HorizontlePiece;

public class HorizontlePieceTest {
	
	public static void TestIfPieceCanMoveOneSquareDown() {
		System.out.print("Horizontal Piece one square down - ");
		
		HorizontlePiece TestDown = new HorizontlePiece(3, 9);
		
		boolean isPossible = TestDown.isMovmentPossible(3, 4);
		
		String TestMessage = (isPossible) ? "Valid" :  "Fail";
		System.out.println(TestMessage);
	}

	public static void FailTestIfPieceCanMoveOneSquareSide() {
		System.out.print("Horizontal Piece one square side. This need to be Fail - ");
		
		HorizontlePiece TestSide = new HorizontlePiece(1, 25);
		
		boolean isPossible = TestSide.isMovmentPossible(3, 25);
		
		String TestMessage = (isPossible) ? "Valid" :  "Fail";
		System.out.println(TestMessage);
	}
}
