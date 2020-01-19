package com.kasparovtron.tests;

import com.kasparovtron.config.PieceColor;
import com.kasparovtron.pieces.Rook;

public class RookTest {

	public static void testForward() {
		
		System.out.print("Rook - testForward  - ");
		
		// 1. Arrange
		Rook testRook = new Rook(PieceColor.BLACK, 7, 0);
		
		// 2. Act - Assert
		boolean isValid = testRook.isMovePosible(1, 0);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);
	}
	
    public static void testSite() {
		
		System.out.print("Rook - testSite  - ");
		
		// 1. Arrange
		Rook testRook = new Rook(PieceColor.BLACK, 1, 0);
		
		// 2. Act - Assert
		boolean isValid = testRook.isMovePosible(7, 0);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);
	}

	public static void testIfMoveOverTwoSquereIsNotPosible() {

		System.out.print("Rook - testIfMoveOverTwoSquereIsNotPosible  - ");		
		
		// 1. Arrange
		Rook testPawn = new Rook(PieceColor.BLACK, 8, 0);
		
		// 2. Act - Assert
		boolean isValid = (testPawn.isMovePosible(6, 0) == false);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);		
	}
	
	public static void run() {
		
		testForward();
		testSite();
		//testIfMoveOverTwoSquereIsNotPosible();
	}
	
}
