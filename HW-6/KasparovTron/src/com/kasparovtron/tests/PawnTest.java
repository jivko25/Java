package com.kasparovtron.tests;

import com.kasparovtron.config.PieceColor;
import com.kasparovtron.pieces.Pawn;

public class PawnTest {

	public static void testIfTheMoveMethodPositionThePieceCorrectlyOneSquereForward() {
		
		System.out.print("testIfTheMoveMethodPositionThePieceCorrectlyOneSquereForward  - ");
		
		// 1. Arrange
		Pawn testPawn = new Pawn(PieceColor.BLACK, 8, 0);
		
		// 2. Act - Assert
		boolean isValid = testPawn.isMovePosible(7, 0);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);
	}

	public static void testIfMoveOverTwoSquereIsNotPosible() {

		System.out.print("testIfMoveOverTwoSquereIsNotPosible  - ");		
		
		// 1. Arrange
		Pawn testPawn = new Pawn(PieceColor.BLACK, 8, 0);
		
		// 2. Act - Assert
		boolean isValid = (testPawn.isMovePosible(6, 0) == false);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);		
	}
	
	public static void run() {
		
		testIfTheMoveMethodPositionThePieceCorrectlyOneSquereForward();
		testIfMoveOverTwoSquereIsNotPosible();
	}
	
}
