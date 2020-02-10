package com.tetris.tests;

import com.tetris.pieces.HorizontlePiece;
import com.tetris.pieces.ZPiece;

public class ZPieceTest {
	
	public static void TestIfPieceCanMoveOneSquareDown() {
		System.out.print("Z-Piece move one square down - ");
		
		ZPiece TestDown = new ZPiece(3, 5);
		
		boolean isPossible = TestDown.isMovmentPossible(3, 4);
		
		String TestMessage = (isPossible) ? "Valid" :  "Fail";
		System.out.println(TestMessage);
	}

	public static void TestIfPieceCanMoveOneSquareSide() {
		System.out.print("Z-Piece one square side - ");
		
		ZPiece TestSide = new ZPiece(2, 4);
		
		boolean isPossible = TestSide.isMovmentPossible(3, 4);
		
		String TestMessage = (isPossible) ? "Valid" :  "Fail";
		System.out.println(TestMessage);
	}
}
