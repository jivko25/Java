package com.chessmaster.test;

import com.chessmaster.pieces.*;
import com.chessmaster.config.*;

public class PawnTest {

	public static void testIfPieceCanMoveOnlyOneSquere() {
		
		System.out.print("testIfPieceCanMoveOnlyOneSquere - ");
		
		// AAA
		// 1. Arange
		Pawn testElement = new Pawn(PieceColor.BLACK, 8, 0);
		
		// 2. Act 
		boolean isValid = testElement.isMoveActionValid(7, 0);
		
		// 3. Assert
		String testMessage = (isValid) ? "Valid" : "Fail";
		System.out.println(testMessage);
	}
	
	
	public static void testIfPieceCannotMoveMoreThanOneSquery() {

		System.out.print("testIfPieceCannotMoveMoreThanOneSquery - ");
		
		// AAA
		// 1. Arange
		Pawn testElement = new Pawn(PieceColor.BLACK, 8, 0);
		
		// 2. Act 
		boolean isValid = (testElement.isMoveActionValid(6, 0) == false);
		
		// 3. Assert
		String testMessage = (isValid) ? "Valid" : "Fail";
		System.out.print(testMessage);
	}
	
	
	public static void run() {
		
		testIfPieceCanMoveOnlyOneSquere();
		testIfPieceCannotMoveMoreThanOneSquery();
	}
	
}
