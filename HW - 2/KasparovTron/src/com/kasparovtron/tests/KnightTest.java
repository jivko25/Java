package com.kasparovtron.tests;

import com.kasparovtron.config.PieceColor;
import com.kasparovtron.pieces.Knight;

public class KnightTest {

	public static void testIfTheMoveMethodPositionThePieceCorrectlyOneSquereForward() {
		
		System.out.print("Knight - test  - ");
		
		// 1. Arrange
		Knight testPawn = new Knight(PieceColor.BLACK, 5, 6);
		
		// 2. Act - Assert
		boolean isValid = testPawn.isMovePosible(4, 4);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);
	}

	public static void testIfMoveOverTwoSquereIsNotPosible() {

		System.out.print("Knight - testIfMoveOverTwoSquereIsNotPosible  - ");		
		
		// 1. Arrange
		Knight testPawn = new Knight(PieceColor.BLACK, 8, 0);
		
		// 2. Act - Assert
		boolean isValid = (testPawn.isMovePosible(6, 0) == false);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);		
	}
	
	public static void run() {
		
		testIfTheMoveMethodPositionThePieceCorrectlyOneSquereForward();
		//testIfMoveOverTwoSquereIsNotPosible();
	}
	
}
