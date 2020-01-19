package com.kasparovtron.tests;

import com.kasparovtron.config.PieceColor;
import com.kasparovtron.pieces.Bishop;

public class BishopTest {

	public static void testDiagonal() {
		
		System.out.print("Bishop - testDiagonal  - ");
		
		// 1. Arrange
		Bishop testPawn = new Bishop(PieceColor.BLACK, 1, 0);
		
		// 2. Act - Assert
		boolean isValid = testPawn.isMovePosible(5, 4);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);
	}

	public static void testIfMoveOverTwoSquereIsNotPosible() {

		System.out.print("Bishop - testIfMoveOverTwoSquereIsNotPosible  - ");		
		
		// 1. Arrange
		Bishop testPawn = new Bishop(PieceColor.BLACK, 8, 0);
		
		// 2. Act - Assert
		boolean isValid = (testPawn.isMovePosible(6, 0) == false);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);		
	}
	
	public static void run() {
		
		testDiagonal();
		//testIfMoveOverTwoSquereIsNotPosible();
	}
	
}
