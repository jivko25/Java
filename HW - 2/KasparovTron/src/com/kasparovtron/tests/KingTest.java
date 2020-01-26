package com.kasparovtron.tests;

import com.kasparovtron.config.PieceColor;
import com.kasparovtron.pieces.King;

public class KingTest {

	public static void testOneSquereDiagonal() {
		
		System.out.print("King - testOneSquareDiagonal  - ");
		
		// 1. Arrange
		King testKing = new King(PieceColor.BLACK, 8, 1);
		
		// 2. Act - Assert
		boolean isValid = testKing.isMovePosible(7, 0);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);
	}
	
    public static void testOneSquareForward() {
		
		System.out.print("King - testOneSquareForward  - ");
		
		// 1. Arrange
		King testKing = new King(PieceColor.BLACK, 3, 0);
		
		// 2. Act - Assert
		boolean isValid = testKing.isMovePosible(3, 1);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);
	}

    public static void testOneSquareSite() {
	
	System.out.print("King - testOneSquareSite  - ");
	
	// 1. Arrange
	King testKing = new King(PieceColor.BLACK, 3, 0);
	
	// 2. Act - Assert
	boolean isValid = testKing.isMovePosible(4, 0);
	String testMessage = (isValid) ? "Valid" : "Fail"; 
	System.out.println(testMessage);
}

	public static void testIfMoveOverTwoSquereIsNotPosible() {

		System.out.print("King - testIfMoveOverTwoSquereIsNotPosible  - ");		
		
		// 1. Arrange
		King testKing = new King(PieceColor.BLACK, 8, 0);
		
		// 2. Act - Assert
		boolean isValid = (testKing.isMovePosible(6, 0) == false);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);		
	}
	
	public static void run() {
		
		testOneSquereDiagonal();
		testOneSquareSite();
		testOneSquareForward();
		//testIfMoveOverTwoSquereIsNotPosible();
	}
	
}
