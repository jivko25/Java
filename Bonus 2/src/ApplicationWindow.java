import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;


public class ApplicationWindow extends JPanel {

	private final int TILE_SIDE = 10;
	private final int Piece_Side = 10;
	
	private int selectedRow = -1;
	private int selectedCol = -1;
	Color Tile_Color;
	private int clicked = 0;
		
	
	
	public static int ColorOfSquares() {
		int max = 3;
		int min = 1;
		int range = 3;
		int type = (int) (Math.random()*range) + min;	
		return type;
		}
	
	public ApplicationWindow() {
		// addMouseListener(new CustomMouseListener());
		addMouseListener(new CustomMouseProxy() {
			
			@Override
		public void mouseClicked(MouseEvent e) {
			int y = e.getX();
		    int x = e.getY();
				  clicked++;
				
			selectedRow = x / TILE_SIDE;
			selectedCol = y / TILE_SIDE;
			
				updateUI();
				System.out.println(selectedRow + ";" + selectedCol);
			}
		});
	}
	
	private void RedSquare(Graphics m, int row, int col) {
		int tileX = col * TILE_SIDE;
		int tileY = row * TILE_SIDE;
		
		m.setColor(Color.RED);
		m.fillRect(tileX, tileY, TILE_SIDE, TILE_SIDE);
	}
	
	private void GreenSquare(Graphics m, int row, int col) {
		int tileX = col * TILE_SIDE;
		int tileY = row * TILE_SIDE;
		
		m.setColor(Color.GREEN);
		m.fillRect(tileX, tileY, TILE_SIDE, TILE_SIDE);
	}
	
	private void BlueSquare(Graphics m, int row, int col) {
		int tileX = col * TILE_SIDE;
		int tileY = row * TILE_SIDE;
		
		m.setColor(Color.BLUE);
		m.fillRect(tileX, tileY, TILE_SIDE, TILE_SIDE);
	}
	
	public void paint(Graphics g) {
		
		for(int row = 0; row < 64; row++) {
			for(int col = 0; col < 64; col++) {
				render(g, row, col);
				
			}
		}
	}
	
    private void render(Graphics g, int row, int col) {
    	int i = ColorOfSquares();
		
		boolean isSelected = (row == selectedRow) && 
							 (col == selectedCol);
		
		boolean Green   = (i == 1);
		boolean Red     = (i == 2);
		boolean Blue    = (i == 3);
		
		if(Green) {
			Tile_Color = Color.GREEN;
		}
		
		if(Red) {
			Tile_Color = Color.RED;
		}
		if(Blue) {
			Tile_Color = Color.BLUE;
		}
		
		int tileX = col * TILE_SIDE;
		int tileY = row * TILE_SIDE;
		
		if(isSelected) {
			tileX 		= selectedRow * TILE_SIDE;
			tileY 		= selectedCol * TILE_SIDE;
			Tile_Color = Color.BLACK;
			return;
		}
		
		g.setColor(Tile_Color);
		g.fillRect(tileX, tileY, TILE_SIDE, TILE_SIDE);
	
    }
}