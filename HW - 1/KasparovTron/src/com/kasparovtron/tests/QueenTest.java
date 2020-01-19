package com.kasparovtron.tests;

import com.kasparovtron.config.PieceColor;
import com.kasparovtron.pieces.Queen;

public class QueenTest {

	public static void testFourSquareDiagonal() {
		
		System.out.print("Queen - testFourSquereDiagonal  - ");
		
		// 1. Arrange
		Queen testPawn = new Queen(PieceColor.BLACK, 1, 0);
		
		// 2. Act - Assert
		boolean isValid = testPawn.isMovePosible(4, 3);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);
	}
	
public static void testFourSquareForward() {
		
		System.out.print("Queen - testFourSquereForward  - ");
		
		// 1. Arrange
		Queen testPawn = new Queen(PieceColor.BLACK, 2, 0);
		
		// 2. Act - Assert
		boolean isValid = testPawn.isMovePosible(2, 4);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);
	}

public static void testFourSquareSide() {
	
	System.out.print("Queen - testFourSquereSite  - ");
	
	// 1. Arrange
	Queen testPawn = new Queen(PieceColor.BLACK, 1, 3);
	
	// 2. Act - Assert
	boolean isValid = testPawn.isMovePosible(5, 3);
	String testMessage = (isValid) ? "Valid" : "Fail"; 
	System.out.println(testMessage);
}

	public static void testIfMoveOverTwoSquereIsNotPosible() {

		System.out.print("Queen - testIfMoveOverTwoSquereIsNotPosible  - ");		
		
		// 1. Arrange
		Queen testPawn = new Queen(PieceColor.BLACK, 8, 0);
		
		// 2. Act - Assert
		boolean isValid = (testPawn.isMovePosible(6, 0) == false);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);		
	}
	
	public static void run() {
		
		testFourSquareDiagonal();
		testFourSquareForward();
		testFourSquareSide();
		//testIfMoveOverTwoSquereIsNotPosible();
	}
	
}
