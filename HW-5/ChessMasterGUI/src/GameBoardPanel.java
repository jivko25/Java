import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameBoardPanel extends JPanel {
	
	private final int TILE_SIDE = 50;
	private final int Piece_Side = 50;
	
	public void paint(Graphics g) {
		
		for(int row = 0; row < 10; row++) {
			for(int col = 0; col < 10; col++) {
				render(g, row, col);
				if(row == 8 || row == 9)  {
				WhitePiece(g, row, col);
				}
				if(row == 1 || row == 0)  {
				BlackPiece(g, row, col);
			    }
			}
			
		}
		
		//g.setColor(Color.GREEN);
		//g.fillRect(10, 10, 100, 100);
	}
	
	private void render(Graphics g, int row, int col) {
		
		boolean isRowEven 	= (row % 2 == 0);
		boolean isColEvent 	= (col % 2 == 0);
		
		boolean isWhite 	= (isRowEven && isColEvent) ||
							  (!isRowEven && !isColEvent);
		
		Color tileColor = isWhite ? Color.WHITE 
								  : Color.BLACK;
		
		int tileX = col * TILE_SIDE;
		int tileY = row * TILE_SIDE;
		
		g.setColor(tileColor);
		g.fillRect(tileX, tileY, TILE_SIDE, TILE_SIDE);
	}
	
	
	
	private void WhitePiece(Graphics m, int row, int col) {
		int tileX = col * TILE_SIDE;
		int tileY = row * TILE_SIDE;
		
		m.setColor(Color.LIGHT_GRAY);
		m.fillOval(tileX, tileY, Piece_Side, Piece_Side);
	}
	
	private void BlackPiece(Graphics m, int row, int col) {
		int tileX = col * TILE_SIDE;
		int tileY = row * TILE_SIDE;
		
		m.setColor(Color.DARK_GRAY);
		m.fillOval(tileX, tileY, Piece_Side, Piece_Side);
	}
	

	
}