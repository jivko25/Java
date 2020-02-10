package com.tetris.tests;

import com.tetris.pieces.HorizontlePiece;

public class TPieceTest {
	
	public static void TestIfPieceCanMoveOneSquareDown() {
		System.out.print("T-Piece one square down - ");
		
		HorizontlePiece TestDown = new HorizontlePiece(3, 9);
		
		boolean isPossible = TestDown.isMovmentPossible(3, 4);
		
		String TestMessage = (isPossible) ? "Valid" :  "Fail";
		System.out.println(TestMessage);
	}

	public static void FailTestIfPieceCanMoveOneSquareSide() {
		System.out.print("T-Piece one square side. This need to be Fail - ");
		
		HorizontlePiece FailTestSide = new HorizontlePiece(2, 25);
		
		boolean isPossible = FailTestSide.isMovmentPossible(1, 25);
		
		String TestMessage = (isPossible) ? "Valid" :  "Fail";
		System.out.println(TestMessage);
	}
	
	public static void TestIfPieceCanMoveOneSquareSide() {
		System.out.print("T-Piece one square side - ");
		
		HorizontlePiece TestSide = new HorizontlePiece(2, 7);
		
		boolean isPossible = TestSide.isMovmentPossible(3, 7);
		
		String TestMessage = (isPossible) ? "Valid" :  "Fail";
		System.out.println(TestMessage);
	}
}
