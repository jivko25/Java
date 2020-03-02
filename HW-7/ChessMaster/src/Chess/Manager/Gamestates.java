package Chess.Manager;

public enum Gamestates {
    INGAME ("inGame"),
    WHITE_WINS ("White wins"),
    BLACK_WINS ("Black wins"),
    STALEMATE ("Stalemate");

    private final String value;

    private Gamestates(String value){
        this.value = value;
    }

    public String toString(){
        return this.value;
    }
}
