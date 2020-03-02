package Chess.Manager;

import Chess.Pieces.Location;
import Chess.Pieces.Piece;

public abstract class Movement {

    protected Piece movedPiece;
    protected Location movedTo;
    protected Location movedFrom;
    protected boolean enemyInCheck;
    protected String moveString;

    public Piece getMovedPiece(){
        return this.movedPiece;
    }

    public Location getMovedTo(){
        return this.movedTo;
    }

    public Location getMovedFrom(){
        return this.movedFrom;
    }

    public String getMoveString(){
        return this.moveString;
    }

    protected abstract String determineMoveString();

    protected String getFileName(int x){
        switch(x){
            case 0:
                return "a";
            case 1:
                return "b";
            case 2:
                return "c";
            case 3:
                return "d";
            case 4:
                return "e";
            case 5:
                return "f";
            case 6:
                return "g";
            case 7:
                return "h";
            default:
                return "";
        }
    }


}
