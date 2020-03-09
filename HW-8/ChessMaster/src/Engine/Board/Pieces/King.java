package Engine.Board.Pieces;

import java.util.ArrayList;

import Engine.Board.ChessBoard;
import Engine.GameState;

public class King extends Piece {
	private boolean hasMoved = false;
	
	public King(String owner, int posx, int posy){
		super(owner, "King", posx, posy);
	}
	
	@Override
	public ArrayList<Location> getPossibleMoves(){
		
		ArrayList<Location> possibleMoves = new ArrayList<Location>();
		
		int checksquares = 0;
		int currx = this.getLocation().getX();
		int curry = this.getLocation().getY();
		int x = this.getLocation().getX();
		int y = this.getLocation().getY();
		
		
		while(checksquares < 10){
				switch(checksquares){
				case 0:
					x = this.getLocation().getX() - 1;
					y = this.getLocation().getY() + 1;
					break;
				case 1:
					x = this.getLocation().getX();
					y = this.getLocation().getY() + 1;
					break;
				case 2:
					x = this.getLocation().getX() + 1;
					y = this.getLocation().getY() + 1;
					break;
				case 3:
					x = this.getLocation().getX() + 1;
					y = this.getLocation().getY();
					break;
				case 4:
					x = this.getLocation().getX() + 1;
					y = this.getLocation().getY() - 1;
					break;
				case 5:
					x = this.getLocation().getX();
					y = this.getLocation().getY() - 1;
					break;
				case 6:
					x = this.getLocation().getX() - 1;
					y = this.getLocation().getY() - 1;
					break;
				case 7:
					x = this.getLocation().getX() - 1;
					y = this.getLocation().getY();
					break;
					
				}
				//Check the bound of the board
				if ((x < 10) && (y < 10)&& (x >= 0) && (y >= 0)){
					if (ChessBoard.getPieceAtLocation(x, y) == null){
						//move piece
						this.getLocation().setX(x);
						this.getLocation().setY(y);
						//is king in check at new location?
						if(!isInCheck()){
							//if the king is not in check at the new location, add it
							possibleMoves.add(new Location(x, y));
						}
						//move back
						this.getLocation().setX(currx);
						this.getLocation().setY(curry);
					}
					//if there is a piece at the location and it is an enemy, check if it can be captured
					else if (ChessBoard.getPieceAtLocation(x, y).getColor() != this.getColor()){
						//Save the opponent's piece
						Piece removedPiece = ChessBoard.getPieceAtLocation(x, y);
						
						ChessBoard.board.remove(removedPiece);
						this.getLocation().setX(x);
						this.getLocation().setY(y);
						//is king in check at new location?
						if(!isInCheck()){
							//if the king can safely capture the other piece, add this square to possible locations
							possibleMoves.add(new Location(x, y));
						}
						//move back and add removed piece back
						this.getLocation().setX(currx);
						this.getLocation().setY(curry);
						ChessBoard.board.add(removedPiece);
					}
				}
			checksquares++;
		}
		if (canCastle() != null){
			possibleMoves.addAll(canCastle());
		}
		return possibleMoves;
	}
	
	public boolean isInCheck(){
		//get the opponent's possible moves
		//If the opponent's possible moves can capture the king, then the king is in check.
		for (Location l : ChessBoard.getPlayersPossibleMoves(this.getColor() == "White" ? "Black" : "White", true)) {
			if (l.getX() == this.getLocation().getX() && l.getY() == this.getLocation().getY()) {
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Location> canCastle(){
		ArrayList<Location> possibleCastle = new ArrayList<Location>();
		if (hasMoved == false){
			if (getColor() == "White"){
				if(ChessBoard.getPieceAtLocation(1, 0) == null &&
					ChessBoard.getPieceAtLocation(2, 0) == null &&
					ChessBoard.getPieceAtLocation(3, 0) == null &&
					ChessBoard.getPieceAtLocation(0, 0) != null &&
					ChessBoard.getPieceAtLocation(0, 0).getName() == "Rook"){
						Location temp = new Location(2, 0);
						temp.setIsCastling();
						possibleCastle.add(temp);
				}
				if(ChessBoard.getPieceAtLocation(5, 0) == null &&
				   ChessBoard.getPieceAtLocation(6, 0) == null &&
				   ChessBoard.getPieceAtLocation(7, 0) != null &&
				   ChessBoard.getPieceAtLocation(7, 0).getName() == "Rook"){
						Location temp = new Location(6, 0);
						temp.setIsCastling();
						possibleCastle.add(temp);
				}
				return possibleCastle;
			} else {
				if(ChessBoard.getPieceAtLocation(1, 7) == null &&
					ChessBoard.getPieceAtLocation(2, 7) == null &&
					ChessBoard.getPieceAtLocation(3, 7) == null &&
					ChessBoard.getPieceAtLocation(0, 7) != null &&
					ChessBoard.getPieceAtLocation(0, 7).getName() == "Rook"){
						Location temp = new Location(2, 7);
						temp.setIsCastling();
						possibleCastle.add(temp);
				}
				if(ChessBoard.getPieceAtLocation(5, 7) == null &&
				   ChessBoard.getPieceAtLocation(6, 7) == null &&
				   ChessBoard.getPieceAtLocation(7, 7) != null &&
				   ChessBoard.getPieceAtLocation(7, 7).getName() == "Rook"){
						Location temp = new Location(6, 7);
						temp.setIsCastling();
						possibleCastle.add(temp);
					}
				return possibleCastle;
			}
		} else return null;
	}
	
	public void setHasMoved(){
		hasMoved = true;
	}
	
}
