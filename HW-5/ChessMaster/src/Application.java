import java.util.Scanner;

import com.chessmaster.config.PieceColor;
import com.chessmaster.manager.GameBoard;
import com.chessmaster.pieces.Blastable;
import com.chessmaster.pieces.Chudaka;
import com.chessmaster.pieces.Pawn;
import com.chessmaster.pieces.Piece;
import com.chessmaster.test.PawnTest;

public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 
		
		System.out.println("Wellkome chesmmasters");
		GameBoard.init();
		
		int selectRow;
		int selectCol;
		
		int moveRow;
		int moveCol;
		
		while(true) {
			
			GameBoard.render();
			
			System.out.print("Select row : ");
			selectRow = input.nextInt();
			
			System.out.print("Select col : ");
			selectCol = input.nextInt();
			
			if(GameBoard.isPieceSelectable(selectRow, selectCol)) {
				GameBoard.selectPiece(selectRow, selectCol);
				
				System.out.println("Piece : " + GameBoard.activePiece.getSignature() + " is selected");
				
				System.out.print("Move row : ");
				moveRow = input.nextInt();
				
				System.out.print("Move col : ");
				moveCol = input.nextInt();
				
				if(GameBoard.isPieceMoveValid(moveRow, moveCol)) {
					GameBoard.move(moveRow, moveCol);
				}
				
			}
			
		}
	}
}