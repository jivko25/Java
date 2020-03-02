package Chess.GUI;

import javax.swing.*;

import Chess.Manager.GameState;
import Chess.Manager.Gamestates;

import java.awt.*;

public class ScorePanel extends JPanel {

    private JPanel CurentPlayer = new JPanel();
    private JPanel whiteScore = new JPanel();
    private JPanel blackScore = new JPanel();

    //labels for each panel
    private JLabel CurentPlayerLabel = new JLabel();
    private JLabel WhitePanel = new JLabel();
    private JLabel BlackPanel = new JLabel();

    public ScorePanel(){
        initializeThis();
        updateScore();
        this.add(CurentPlayer);
        this.add(whiteScore);
        this.add(blackScore);
        this.validate();
        this.repaint();
    }


    public void updateScore(){
    	CurentPlayerLabel.setText("<html><p>Curent Player</p><p style='text-align: center; width: 100%'>" + GameState.getCurrentPlayer() + "</p></html>");
        WhitePanel.setText("<html><p>White</p><p style='text-align: center; width: 100%'>" + GameState.getWhiteCapturedPieces() + "</p></html>");
        BlackPanel.setText("<html><p>Black</p><p style='text-align: center; width: 100%'>" + GameState.getBlackCapturedPieces() + "</p></html>");
    }

    private void initializeThis(){
        this.setSize(new Dimension(600, 75));
        this.setVisible(true);
        this.setBackground(Color.LIGHT_GRAY);
        this.setLayout(new GridBagLayout());
	CurentPlayer.setBackground(Color.LIGHT_GRAY);
        whiteScore.setBackground(Color.LIGHT_GRAY);
	blackScore.setBackground(Color.LIGHT_GRAY);
        this.whiteScore.add(WhitePanel);
        this.blackScore.add(BlackPanel);
        this.blackScore.add(CurentPlayerLabel);
    }

    public JPanel getWhiteScorePanel(){
        return this.whiteScore;
    }

    public JPanel getBlackScorePanel(){
        return this.blackScore;
    }

}
