package Engine.Movement.MovementControls;

import Engine.Board.ChessBoard;
import Engine.GameState;
import Engine.Movement.Moves.Move;
import Engine.Movement.Moves.Movement;

import java.util.ArrayList;

public class MoveHistory {

    private ArrayList<Movement> moves = new ArrayList<Movement>();
    private ArrayList<Movement> undoneMoves = new ArrayList<Movement>();

    public MoveHistory(){

    }

    public void addMove(Movement m){
        //If a move is added externally lets clear the undone moves so that the user cannot "redo" the board to an invalid state.
        moves.add(m);
        this.undoneMoves.clear();
    }

    public String printMoves(){
        String moveHistory = "";
        for(int i = (moves.size() > 20) ? moves.size() - 20 : 0; i<=moves.size() - 1; i++){
            if(i == 0){
                moveHistory += "1. ";
            } else if(i % 2 == 0){
                moveHistory += "" + ((i / 2) + 1) + ". ";
            }

            moveHistory += moves.get(i).getMoveString() + " ";
        }
        return moveHistory;
    }

    public void reset(){
        this.moves = new ArrayList<Movement>();
    }

    public void undo(){
        if(this.moves.size() != 0) {
            this.moves.get(moves.size() - 1).undo();
            undoneMoves.add(moves.get(moves.size() - 1));
            this.moves.remove(moves.size() - 1);
            gui.Window.Window.updateWindow();
            GameState.setCurrentPlayer(GameState.currentMove == "White" ? "Black" : "White");
        }
    }

    public void redo(){
        if(this.undoneMoves.size() != 0){
            this.undoneMoves.get(undoneMoves.size() - 1).redo();
            moves.add(undoneMoves.get(undoneMoves.size() - 1));
            this.undoneMoves.remove(undoneMoves.size() - 1);
            gui.Window.Window.updateWindow();
            GameState.setCurrentPlayer(GameState.currentMove == "White" ? "Black" : "White");
        }
    }
}
