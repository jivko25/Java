package Chess.GUI;


import javax.swing.*;

public class WindowLayers extends JLayeredPane {

    public static ScorePanel scorePanel = new ScorePanel();
    public static ChessBoardPanel boardGui;

    public WindowLayers() {

        scorePanel.setBounds(120, 0, 600, 60);
        this.add(scorePanel);


        boardGui = new ChessBoardPanel();
        //add the chess board
        boardGui.setBounds(120, 60, 600, 600);
        this.add(boardGui);

        this.setVisible(true);
    }

    public void updateLayers(){
        this.boardGui.updateBoard();
        this.scorePanel.updateScore();
    }

}
