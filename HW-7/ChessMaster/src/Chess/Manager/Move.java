package Chess.Manager;

import Chess.Pieces.Location;
import Chess.Pieces.Piece;

public class Move extends Movement {

    public Move(Piece p, Location oldLocation, Location newLocation, boolean inCheck){
        this.movedPiece = p;
        this.movedTo = newLocation;
        this.movedFrom = oldLocation;
        this.enemyInCheck = inCheck;
        this.moveString = determineMoveString();
    }

    protected String determineMoveString(){
        String prefix = "";

        if(this.getMovedPiece().getName().equals("Pawn")){
            prefix += getFileName(this.movedFrom.getX());
        } else {
            prefix += this.getMovedPiece().getName().charAt(0);
            prefix += getFileName(this.getMovedTo().getX());
        }

        prefix += this.getMovedTo().getY() + 1;

        if(GameState.getGameState() == Gamestates.BLACK_WINS || GameState.getGameState() == Gamestates.WHITE_WINS){
            prefix += "#";
        }
        return prefix;
    }

}
