
  
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;


public class Window extends JPanel {

	private final int TILE_SIDE = 10;
	Color tileColor;
	
	
	private int selectedRow = -1;
	private int selectedCol = -1;
		
	
	public static int ColorOfSquares() {
		int max = 3;
		int min = 1;
		int range = 3;
		int type = (int) (Math.random()*range) + min;	
		return type;
		} 
	
	public Window() {
		// addMouseListener(new CustomMouseListener());
		addMouseListener(new CustomMouseProxy() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// System.out.println("Ovberwriteble anonimus class");
				// System.out.print(e.getX());
				// System.out.print(e.getY());
				
				int x = e.getX();
				int y = e.getY();
				
				selectedRow = x / TILE_SIDE;
				selectedCol = y / TILE_SIDE;
				
				updateUI();
			}

		});
	}
	
	public void paint(Graphics g) {
		
		System.out.println("Rerender");
		
		for(int row = 0; row < 64; row++) {
			for(int col = 0; col < 64; col++) {
				render(g, row, col);
			}
		}
	}
	
	private void render(Graphics g, int row, int col) {
		
		boolean Green   = (ColorOfSquares() == 1);
		boolean Blue   = (ColorOfSquares() == 2);
		boolean Red   = (ColorOfSquares() == 3);
		
		if(Green) {
			tileColor = Color.GREEN;
		}
		if(Red) {
			tileColor = Color.RED;
		}
		if(Blue) {
			tileColor = Color.BLUE;
		}
		
				
		int tileX = col * TILE_SIDE;
		int tileY = row * TILE_SIDE;
		
		if(selectedRow != -1 && selectedCol != -1) {
			tileX 		= selectedRow * TILE_SIDE;
			tileY 		= selectedCol * TILE_SIDE;
			if(ColorOfSquares() == 1) {
				tileColor 	= Color.GREEN;
			}
			if(ColorOfSquares() == 2) {
				tileColor 	= Color.RED;
			}
			if(ColorOfSquares() == 3) {
				tileColor 	= Color.BLUE;
			}
		}
		
		g.setColor(tileColor);
		g.fillRect(tileX, tileY, TILE_SIDE, TILE_SIDE);
	}
}
