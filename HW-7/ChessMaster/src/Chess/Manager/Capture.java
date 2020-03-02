package Chess.Manager;

import Chess.GUI.ChessBoard;
import Chess.Pieces.Location;
import Chess.Pieces.Piece;

public class Capture extends Movement {

    private Piece capturedPiece;

    public Capture(Piece p, Location oldLocation, Location newLocation, Piece captured, boolean inCheck) {
        this.movedPiece = p;
        this.movedTo = newLocation;
        this.movedFrom = oldLocation;
        this.moveString = determineMoveString();
        this.capturedPiece = captured;
    }

    public Piece getCapturedPiece(){
        return this.capturedPiece;
    }

    @Override
    protected String determineMoveString(){
        String prefix = "";

        //In case of enPassant
        if(this.getMovedPiece().getName().equals("Pawn")){
            prefix += getFileName(this.movedFrom.getX());
        } else {
            prefix += this.getMovedPiece().getName().charAt(0);
        }

        prefix += "x";
        prefix += getFileName(this.getMovedTo().getX());
        prefix += this.getMovedTo().getY() + 1;

        if(GameState.getGameState() == Gamestates.BLACK_WINS || GameState.getGameState() == Gamestates.WHITE_WINS){
            prefix += "#";
        } 
        return prefix;
    }

}
