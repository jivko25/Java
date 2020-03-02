package Chess.Manager;

import Engine.Movement.MovementControls.MoveHistory;

import java.util.ArrayList;

import Chess.GUI.ChessBoard;
import Chess.Pieces.Location;
import Chess.Pieces.Pawn;
import Chess.Pieces.Piece;

public class GameState {
	public static String currentMove;
	private static Gamestates gameState;
	private static boolean currentPlayerIsInCheck = false;
	public static MoveHistory history = new MoveHistory();
	private int whiteWins = 0;
	private int blackWins = 0;
    private static int WhiteVictims = 0;
	private static int BlackVictims = 0;
	
	public GameState(){
		this.currentMove = "White";
		this.gameState = Gamestates.INGAME;
	}
	
	public static String getCurrentPlayer(){
		return currentMove;
	}
	
	public static void setCurrentPlayer(String player){
		currentMove = player;
	}
	
	public void switchPlayer(){
		
		//switch players
		this.currentMove = (this.currentMove == "White") ? "Black" : "White";

		//Reset pawns tagged for EnPassant for current Player
		for(Piece p : ChessBoard.board){
			if(p.getColor() == currentMove && p instanceof Pawn && (((Pawn) p).getMovedTwice() == true)){
				((Pawn) p).setMovedTwice(false);
			}
		}
		

		
		Chess.GUI.Window.updateWindow();
	}
	public void updateTakenPieces(){

        for (int i = 0; i< ChessBoard.takenPieces.size(); i++){
            if (ChessBoard.takenPieces.get(i).getColor() == "White"){
            	getWhiteCapturedPieces();
            } else {
            	getBlackCapturedPieces();
            }
        }
    }

	
	public static Gamestates getGameState(){
		return gameState;
	}
	
	public void setGameState(Gamestates state){
		gameState = state;
	}
	
	public static int getWhiteCapturedPieces(){
		WhiteVictims++;
		return WhiteVictims;
	}
	
	public static int getBlackCapturedPieces(){
		BlackVictims++;
		return BlackVictims;
	}
	
	public int getWhiteWins(){
		return whiteWins;
	}
	
	public int getBlackWins(){
		return blackWins;
	}

	public static MoveHistory getHistory(){
		return history;
	}

}
