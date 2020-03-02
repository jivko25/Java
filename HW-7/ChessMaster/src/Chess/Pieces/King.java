package Chess.Pieces;

import java.util.ArrayList;

import Chess.GUI.ChessBoard;
import Chess.Manager.GameState;

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
						//move back and add removed piece back
						this.getLocation().setX(currx);
						this.getLocation().setY(curry);
						ChessBoard.board.add(removedPiece);
					}
				}
			checksquares++;
		}
		return possibleMoves;
	}
	
	public void setHasMoved(){
		hasMoved = true;
	}
	
}
