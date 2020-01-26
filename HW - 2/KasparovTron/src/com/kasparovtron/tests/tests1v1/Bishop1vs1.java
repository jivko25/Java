package com.kasparovtron.tests.tests1v1;

import java.util.Scanner;

import com.kasparovtron.config.PieceColor;
import com.kasparovtron.pieces.Bishop;

public class Bishop1vs1 {
	public static void BishopBattle(){
	Scanner input = new Scanner(System.in);
	int NewWhiteRow, NewWhiteCol, NewBlackRow, NewBlackCol;
	int i = 3;
	int k;
	boolean isValid;
	System.out.print("Enter row of first possition of White army:");
	int WhiteRow = input.nextInt();
	System.out.print("Enter col of first possition of White army:");
	int WhiteCol = input.nextInt();
	System.out.print("Enter row of first possition of White army:");
	int BlackRow = input.nextInt();
	System.out.print("Enter col of first possition of White army:");
	int BlackCol = input.nextInt();
	do {
		i++;
		k = i%2;
		if(k == 0) 
		{
			do {
		    System.out.println("Player 1 - White army");
		    System.out.print("Enter next row of White army:");
			NewWhiteRow = input.nextInt();
			System.out.print("Enter next colon of White army:");
			NewWhiteCol = input.nextInt();
			Bishop testBishop = new Bishop(PieceColor.BLACK, WhiteRow , WhiteCol);
			isValid = testBishop.isMovePosible(NewWhiteRow, NewWhiteCol);
			Visualisation.MoveVisualisation(NewWhiteRow, NewWhiteCol);
			System.out.println("");
			if(isValid == false)
			{
				System.out.println("Wrong turn, enter new coordinates");
			}
			if(isValid == true)
			{
				WhiteRow = NewWhiteRow;
				WhiteCol = NewWhiteCol;
			}
			}
			while(isValid == false);
		}
		if(k == 1 )
		{
			do {				
			System.out.println("Player 2 - Dark army");
			System.out.print("Enter next row of Dark army:");
			NewBlackRow = input.nextInt();
			System.out.print("Enter next colon of Dark army:");
			NewBlackCol = input.nextInt();
			Bishop testBishop = new Bishop(PieceColor.BLACK, WhiteRow , WhiteCol);
			isValid = testBishop.isMovePosible(NewBlackRow, NewBlackCol);
			Visualisation.MoveVisualisation(NewBlackRow, NewBlackCol);
			System.out.println("");
			if(isValid == false)
			{
				System.out.println("Wrong turn, enter new coordinates");
			}
			if(isValid == true)
			{
				BlackRow = NewBlackRow;
				BlackCol = NewBlackCol;
			}
			}
			while(isValid == false);
			}
	}
	while(WhiteRow != BlackRow && WhiteCol != BlackCol);
	k++;
	System.out.println("Attack done, player " + k + " win!");
}


}
