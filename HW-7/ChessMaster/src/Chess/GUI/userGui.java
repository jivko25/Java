package Chess.GUI;
import gui.Menu.MenuGui;
import gui.Modals.ModalController;
import gui.Modals.PromotionPanel;
import gui.MoveHistory.MoveHistoryPanel;
import gui.TakenPieces.TakenPiecePanel;

import java.awt.Dimension;

import javax.swing.*;

public class userGui {
	//Create an object for the window
	private static final Window window = new Window();

	//Constructor to set up the window
	public userGui(){
		window.updateWindow();
	}

	public JFrame getWindow(){
		return window;
	}



}
