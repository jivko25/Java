package Chess.Pieces;

import java.util.ArrayList;

import Chess.GUI.ChessBoard;
import Chess.Manager.Capture;
import Chess.Manager.GameState;
import Chess.Manager.Gamestates;
import Chess.Manager.Move;
import Engine.Movement.Moves.Castle;

public abstract class Piece {
	private String color;
	private String name;
	private Location location;
	private String imagePath;
	
	public Piece(){
		
	}
	
	public Piece(String color, String name, int posx, int posy){
	this.color = color;	
	this.name = name;
	this.location = new Location(posx, posy);
	if(color == "White"){
		this.imagePath = "/Images/White"+name+".png";
	}
	else
		this.imagePath = "/Images/Black"+name+".png";
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getImagePath(){
		return this.imagePath;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public void setLocation(int posx, int posy){
		this.location.setX(posx);
		this.location.setY(posy);
	}
	
	public Location getLocation(){
		return this.location;
	}
	
	public boolean move(Location here){

		boolean capture = false;
		boolean castle = false;
		Piece capturedPiece = null;
		Location lastLocation = new Location(this.getLocation().getX(), this.getLocation().getY());

		if(this instanceof King) {
			ArrayList<Location> moves = this.getPossibleMoves();
			for(Location l : moves){
				if(here.getX() == l.getX() && here.getY() == l.getY()){
					
					setLocation(here.getX(), here.getY());
					ChessBoard.theState.switchPlayer();
					return true;
				}
			}
		}

		if(ChessBoard.theState.getGameState() != Gamestates.INGAME) {
			return false;
		}

		if(GameState.getCurrentPlayer() != getColor()){
			return false;
		}

		if(this.canMoveTo(here) == 0){
			return false;
		}

		//If you are trying to move to a valid location, check if there is an opponent there.
		if (ChessBoard.getPieceAtLocation(here.getX(), here.getY()) != null){
			//there is a piece there, lets remove it!
			capturedPiece = ChessBoard.getPieceAtLocation(here.getX(), here.getY());
			ChessBoard.takenPieces.add(ChessBoard.getPieceAtLocation(here.getX(), here.getY()));
			ChessBoard.board.remove(ChessBoard.getPieceAtLocation(here.getX(), here.getY()));
			capture = true;
		}
		//Is a pawn moving twice?
		//Check if the pawn moved twice for enPassant
		if(this instanceof Pawn){
			Pawn p = (Pawn)this;


			//Check if you are capturing enPassant
			for(Location l : this.getPossibleMoves()){
				if(l.getY() == here.getY() && l.getX() == here.getX() && l.isEnPassant()){
					capture = true;
					if (GameState.getCurrentPlayer() == "White") {
						//Remove the pawn below the space for white
						capturedPiece = ChessBoard.getPieceAtLocation(here.getX(), here.getY()-1);
						ChessBoard.takenPieces.add(ChessBoard.getPieceAtLocation(here.getX(), here.getY()-1));
						ChessBoard.board.remove(ChessBoard.getPieceAtLocation(here.getX(), here.getY()-1));
						break;
					} else {
						//If black is moving then remove the piece above the required location.
						capturedPiece = ChessBoard.getPieceAtLocation(here.getX(), here.getY()+1);
						ChessBoard.takenPieces.add(ChessBoard.getPieceAtLocation(here.getX(), here.getY()+1));
						ChessBoard.board.remove(ChessBoard.getPieceAtLocation(here.getX(), here.getY()+1));
						break;
					}
				}
			}
		}
		//move the piece and return
		setLocation(here.getX(), here.getY());
		ChessBoard.theState.switchPlayer();
		return true;
	}
	
	public abstract ArrayList<Location> getPossibleMoves();
	
	
	public int canMoveTo(Location here){
		ArrayList<Location> moves = this.getPossibleMoves();
		for(int i=0; i<moves.size(); i++){
			if (here.getX() == moves.get(i).getX() && here.getY() == moves.get(i).getY()){

				//Check if the player is trying to move a piece pinned to the king
				Location l = new Location(this.getLocation().getX(), this.getLocation().getY());
				Piece capture = null;
				if(ChessBoard.getPieceAtLocation(l.getX(), l.getY()) != null){
					//there is a piece that needs to be captured
					capture = ChessBoard.getPieceAtLocation(l.getX(), l.getY());
					ChessBoard.getBoard().remove(capture);
				}
				this.setLocation(here.getX(), here.getY());
				this.setLocation(l.getX(), l.getY());
				if(capture != null){
					ChessBoard.getBoard().add(capture);
				}
				return 1;
			}
		}
		return 0;
	}
}
