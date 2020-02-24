import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;


public class ApplicationWindow extends JPanel {

	private final int TILE_SIDE = 50;
	private final int Piece_Side = 50;
	
	//Pawn
	private int WhitePawnDefaltRow1 = 8;
	private int WhitePawnDefaltRow2 = 8;
	private int WhitePawnDefaltRow3 = 8;
	private int WhitePawnDefaltRow4 = 8;
	private int WhitePawnDefaltRow5 = 8;
	private int WhitePawnDefaltRow6 = 8;
	private int WhitePawnDefaltRow7 = 8;
	private int WhitePawnDefaltRow8 = 8;
	private int WhitePawnDefaltCol1 = 0;
	private int WhitePawnDefaltCol2 = 1;
	private int WhitePawnDefaltCol3 = 2;
	private int WhitePawnDefaltCol4 = 3;
	private int WhitePawnDefaltCol5 = 4;
	private int WhitePawnDefaltCol6 = 5;
	private int WhitePawnDefaltCol7 = 6;
	private int WhitePawnDefaltCol8 = 7;
	
	private int DarkPawnDefaltRow1 = 1;
	private int DarkPawnDefaltRow2 = 1;
	private int DarkPawnDefaltRow3 = 1;
	private int DarkPawnDefaltRow4 = 1;
	private int DarkPawnDefaltRow5 = 1;
	private int DarkPawnDefaltRow6 = 1;
	private int DarkPawnDefaltRow7 = 1;
	private int DarkPawnDefaltRow8 = 1;
	private int DarkPawnDefaltCol1 = 0;
	private int DarkPawnDefaltCol2 = 1;
	private int DarkPawnDefaltCol3 = 2;
	private int DarkPawnDefaltCol4 = 3;
	private int DarkPawnDefaltCol5 = 4;
	private int DarkPawnDefaltCol6 = 5;
	private int DarkPawnDefaltCol7 = 6;
	private int DarkPawnDefaltCol8 = 7;
	//Knight
	private int WhiteKnightDefaltRow1 = 9;
	private int WhiteKnightDefaltCol1 = 1;
	private int WhiteKnightDefaltRow2 = 9;
	private int WhiteKnightDefaltCol2 = 6;
	private int DarkKnightDefaltRow1 = 0;
	private int DarkKnightDefaltCol1 = 1;
	private int DarkKnightDefaltRow2 = 0;
	private int DarkKnightDefaltCol2 = 6;
	
	//Rook
	private int WhiteRookDefaltRow1 = 9;
	private int WhiteRookDefaltCol1 = 0;
	private int WhiteRookDefaltRow2 = 9;
	private int WhiteRookDefaltCol2 = 7;
	private int DarkRookDefaltRow1 = 0;
	private int DarkRookDefaltCol1 = 0;
	private int DarkRookDefaltRow2 = 0;
	private int DarkRookDefaltCol2 = 7;
	
	//Bishop
	private int WhiteBishopDefaltRow1 = 9;
	private int WhiteBishopDefaltCol1 = 2;
	private int WhiteBishopDefaltRow2 = 9;
	private int WhiteBishopDefaltCol2 = 5;
	private int DarkBishopDefaltRow1 = 0;
	private int DarkBishopDefaltCol1 = 2;
	private int DarkBishopDefaltRow2 = 0;
	private int DarkBishopDefaltCol2 = 5;
	
	//Queen
	private int WhiteQueenDefaltRow = 9;
	private int WhiteQueenDefaltCol = 3;
	private int DarkQueenDefaltRow = 0;
	private int DarkQueenDefaltCol = 3;
	
	//King
	private int WhiteKingDefaltRow = 9;
	private int WhiteKingDefaltCol = 4;
	private int DarkKingDefaltRow = 0;
	private int DarkKingDefaltCol = 4;
	
	
	private int selectedRow = -1;
	private int selectedCol = -1;
	private int clicked = 0;
	String Player;
	final String player1 = "Player1";
	final String player2 = "Player2";
		
	public ApplicationWindow() {
		// addMouseListener(new CustomMouseListener());
		addMouseListener(new CustomMouseProxy() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// System.out.println("Ovberwriteble anonimus class");
				// System.out.print(e.getX());
				// System.out.print(e.getY());
				
				int y = e.getX();
				int x = e.getY();
				  clicked++;
				
				selectedRow = x / TILE_SIDE;
				selectedCol = y / TILE_SIDE;
				
				updateUI();
				System.out.println(selectedRow + ";" + selectedCol);
				if(clicked%4 == 1 || clicked%4 == 2) {
					System.out.println(player1);
					Player = player1;
				}
				else
				{
					System.out.println(player2);
					Player = player2;
				}
			}
		});
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
	
	public void paint(Graphics g) {
		
		for(int row = 0; row < 10; row++) {
			for(int col = 0; col < 10; col++) {
				render(g, row, col);
				if((row == 8 || row == 9) && col != 8 && col != 9)  {
					WhitePiece(g, row, col);
					}
					if((row == 1 || row == 0) && col != 8 && col != 9)  {
					BlackPiece(g, row, col);
				    }
			}
		}
	}
	
    private void render(Graphics g, int row, int col) {
		
		boolean isRowEven 	= (row % 2 == 0);
		boolean isColEvent 	= (col % 2 == 0);
		
		boolean isWhite 	= (isRowEven && isColEvent) ||
							  (!isRowEven && !isColEvent);
		
		Color tileColor = isWhite ? Color.WHITE 
								  : Color.BLACK;
		
		boolean isSelected = (row == selectedRow) && 
							 (col == selectedCol);
		
		//Pawn
		boolean WhitePawnMove1 = ((row == WhitePawnDefaltRow1) && (col == WhitePawnDefaltCol1));
		boolean WhitePawnMove2 = ((row == WhitePawnDefaltRow2) && (col == WhitePawnDefaltCol2));
		boolean WhitePawnMove3 = ((row == WhitePawnDefaltRow3) && (col == WhitePawnDefaltCol3));
		boolean WhitePawnMove4 = ((row == WhitePawnDefaltRow4) && (col == WhitePawnDefaltCol4));
		boolean WhitePawnMove5 = ((row == WhitePawnDefaltRow5) && (col == WhitePawnDefaltCol5));
		boolean WhitePawnMove6 = ((row == WhitePawnDefaltRow6) && (col == WhitePawnDefaltCol6));
		boolean WhitePawnMove7 = ((row == WhitePawnDefaltRow7) && (col == WhitePawnDefaltCol7));
		boolean WhitePawnMove8 = ((row == WhitePawnDefaltRow8) && (col == WhitePawnDefaltCol8));
		
		boolean DarkPawnMove1 = ((row == DarkPawnDefaltRow1) && (col == DarkPawnDefaltCol1));
		boolean DarkPawnMove2 = ((row == DarkPawnDefaltRow2) && (col == DarkPawnDefaltCol2));
		boolean DarkPawnMove3 = ((row == DarkPawnDefaltRow3) && (col == DarkPawnDefaltCol3));
		boolean DarkPawnMove4 = ((row == DarkPawnDefaltRow4) && (col == DarkPawnDefaltCol4));
		boolean DarkPawnMove5 = ((row == DarkPawnDefaltRow5) && (col == DarkPawnDefaltCol5));
		boolean DarkPawnMove6 = ((row == DarkPawnDefaltRow6) && (col == DarkPawnDefaltCol6));
		boolean DarkPawnMove7 = ((row == DarkPawnDefaltRow7) && (col == DarkPawnDefaltCol7));
		boolean DarkPawnMove8 = ((row == DarkPawnDefaltRow8) && (col == DarkPawnDefaltCol8));
		
		
		//Knight
		boolean WhiteKnightMove1 = ((row == WhiteKnightDefaltRow1) && (col == WhiteKnightDefaltCol1));
		boolean WhiteKnightMove2 = ((row == WhiteKnightDefaltRow2) && (col == WhiteKnightDefaltCol2));
		boolean DarkKnightMove1 = ((row == DarkKnightDefaltRow1) && (col == DarkKnightDefaltCol1));
		boolean DarkKnightMove2 = ((row == DarkKnightDefaltRow2) && (col == DarkKnightDefaltCol2));
		
		//Rook
		boolean WhiteRookMove1 = ((row == WhiteRookDefaltRow1) && (col == WhiteRookDefaltCol1));
		boolean WhiteRookMove2 = ((row == WhiteRookDefaltRow2) && (col == WhiteRookDefaltCol2));
		boolean DarkRookMove1 = ((row == DarkRookDefaltRow1) && (col == DarkRookDefaltCol1));
		boolean DarkRookMove2 = ((row == DarkRookDefaltRow2) && (col == DarkRookDefaltCol2));
		
		//Bishop
		boolean WhiteBishopMove1 = ((row == WhiteBishopDefaltRow1) && (col == WhiteBishopDefaltCol1));
		boolean WhiteBishopMove2 = ((row == WhiteBishopDefaltRow2) && (col == WhiteBishopDefaltCol2));
		boolean DarkBishopMove1 = ((row == DarkBishopDefaltRow1) && (col == DarkBishopDefaltCol1));
		boolean DarkBishopMove2 = ((row == DarkBishopDefaltRow2) && (col == DarkBishopDefaltCol2));
		
		//Queen
		boolean WhiteQueenMove = ((row == WhiteQueenDefaltRow) && (col==WhiteQueenDefaltCol));
		boolean DarkQueenMove = ((row == WhiteKingDefaltRow) && (col == WhiteKingDefaltCol));
		
		//King
		boolean WhiteKingMove = ((row == WhiteKingDefaltRow) && (col == WhiteKingDefaltCol));
		boolean DarkKingMove = ((row == DarkKingDefaltRow)  && (col == DarkKingDefaltCol));
		
		int tileX = col * TILE_SIDE;
		int tileY = row * TILE_SIDE;
		
		if(isSelected) {
			
			tileColor = Color.RED;
			g.setColor(tileColor);
			g.fillRect(tileX, tileY, TILE_SIDE, TILE_SIDE);
			
			if(Player == player1) {
			if(WhiteKnightMove1) {
			g.setColor(Color.GREEN);
			g.fillRect(tileX - 50, tileY - 100, TILE_SIDE, TILE_SIDE);
			g.fillRect(tileX + 50, tileY - 100, TILE_SIDE, TILE_SIDE);
			g.fillRect(tileX + 100, tileY - 50, TILE_SIDE, TILE_SIDE);
			g.fillRect(tileX + 100, tileY + 50, TILE_SIDE, TILE_SIDE);
			g.fillRect(tileX + 50, tileY + 100, TILE_SIDE, TILE_SIDE);
			g.fillRect(tileX - 50, tileY + 100, TILE_SIDE, TILE_SIDE);
			g.fillRect(tileX - 100, tileY + 50, TILE_SIDE, TILE_SIDE);
			g.fillRect(tileX - 100, tileY - 50, TILE_SIDE, TILE_SIDE);
			
			if(selectedRow == tileX - 50 && selectedRow == tileY - 100) {
				this.selectedRow = WhiteKnightDefaltRow1;
				this.selectedCol = WhiteKnightDefaltCol1;
			}
			
			else if(selectedRow == tileX + 50 && selectedRow == tileY - 100) {
				this.selectedRow = WhiteKnightDefaltRow1;
				this.selectedCol = WhiteKnightDefaltCol1;
			}
			
			else if(selectedRow == tileX + 100 && selectedRow == tileY - 50) {
				this.selectedRow = WhiteKnightDefaltRow1;
				this.selectedCol = WhiteKnightDefaltCol1;
			}
			
			else if(selectedRow == tileX + 100 && selectedRow == tileY + 50) {
				this.selectedRow = WhiteKnightDefaltRow1;
				this.selectedCol = WhiteKnightDefaltCol1;
			}
			
			else if(selectedRow == tileX + 50 && selectedRow == tileY + 100) {
				this.selectedRow = WhiteKnightDefaltRow1;
				this.selectedCol = WhiteKnightDefaltCol1;
			}
			
			else if(selectedRow == tileX - 50 && selectedRow == tileY + 100) {
				this.selectedRow = WhiteKnightDefaltRow1;
				this.selectedCol = WhiteKnightDefaltCol1;
			}
			
			else if(selectedRow == tileX - 100 && selectedRow == tileY + 50) {
				this.selectedRow = WhiteKnightDefaltRow1;
				this.selectedCol = WhiteKnightDefaltCol1;
			}
			
			else if(selectedRow == tileX - 100 && selectedRow == tileY - 50) {
				this.selectedRow = WhiteKnightDefaltRow1;
				this.selectedCol = WhiteKnightDefaltCol1;
			}
			}
			if(WhiteKnightMove2) {
				g.setColor(Color.GREEN);
				g.fillRect(tileX - 50, tileY - 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 50, tileY - 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 100,tileY - 50, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 100,tileY + 50, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 50, tileY + 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 50, tileY + 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 100, tileY + 50, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 100, tileY - 50, TILE_SIDE, TILE_SIDE);
				
				if(selectedRow == tileX - 50 && selectedRow == tileY - 100) {
					this.selectedRow = WhiteKnightDefaltRow1;
					this.selectedCol = WhiteKnightDefaltCol1;
				}
				
				else if(selectedRow == tileX + 50 && selectedRow == tileY - 100) {
					this.selectedRow = WhiteKnightDefaltRow1;
					this.selectedCol = WhiteKnightDefaltCol1;
				}
				
				else if(selectedRow == tileX + 100 && selectedRow == tileY - 50) {
					this.selectedRow = WhiteKnightDefaltRow1;
					this.selectedCol = WhiteKnightDefaltCol1;
				}
				
				else if(selectedRow == tileX + 100 && selectedRow == tileY + 50) {
					this.selectedRow = WhiteKnightDefaltRow1;
					this.selectedCol = WhiteKnightDefaltCol1;
				}
				
				else if(selectedRow == tileX + 50 && selectedRow == tileY + 100) {
					this.selectedRow = WhiteKnightDefaltRow1;
					this.selectedCol = WhiteKnightDefaltCol1;
				}
				
				else if(selectedRow == tileX - 50 && selectedRow == tileY + 100) {
					this.selectedRow = WhiteKnightDefaltRow1;
					this.selectedCol = WhiteKnightDefaltCol1;
				}
				
				else if(selectedRow == tileX - 100 && selectedRow == tileY + 50) {
					this.selectedRow = WhiteKnightDefaltRow1;
					this.selectedCol = WhiteKnightDefaltCol1;
				}
				
				else if(selectedRow == tileX - 100 && selectedRow == tileY - 50) {
					this.selectedRow = WhiteKnightDefaltRow1;
					this.selectedCol = WhiteKnightDefaltCol1;
				}
			}
			else {
				}
			if(DarkKnightMove1) {
				g.setColor(Color.GREEN);
				g.fillRect(tileX - 50, tileY - 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 50, tileY - 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 100, tileY - 50, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 100, tileY + 50, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 50, tileY + 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 50, tileY + 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 100, tileY + 50, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 100, tileY - 50, TILE_SIDE, TILE_SIDE);
				if(selectedRow == tileX - 50 && selectedRow == tileY - 100) {
					this.selectedRow = WhiteKnightDefaltRow1;
					this.selectedCol = WhiteKnightDefaltCol1;
				}
				
				else if(selectedRow == tileX + 50 && selectedRow == tileY - 100) {
					this.selectedRow = WhiteKnightDefaltRow1;
					this.selectedCol = WhiteKnightDefaltCol1;
				}
				
				else if(selectedRow == tileX + 100 && selectedRow == tileY - 50) {
					this.selectedRow = WhiteKnightDefaltRow1;
					this.selectedCol = WhiteKnightDefaltCol1;
				}
				
				else if(selectedRow == tileX + 100 && selectedRow == tileY + 50) {
					this.selectedRow = WhiteKnightDefaltRow1;
					this.selectedCol = WhiteKnightDefaltCol1;
				}
				
				else if(selectedRow == tileX + 50 && selectedRow == tileY + 100) {
					this.selectedRow = WhiteKnightDefaltRow1;
					this.selectedCol = WhiteKnightDefaltCol1;
				}
				
				else if(selectedRow == tileX - 50 && selectedRow == tileY + 100) {
					this.selectedRow = WhiteKnightDefaltRow1;
					this.selectedCol = WhiteKnightDefaltCol1;
				}
				
				else if(selectedRow == tileX - 100 && selectedRow == tileY + 50) {
					this.selectedRow = WhiteKnightDefaltRow1;
					this.selectedCol = WhiteKnightDefaltCol1;
				}
				
				else if(selectedRow == tileX - 100 && selectedRow == tileY - 50) {
					this.selectedRow = WhiteKnightDefaltRow1;
					this.selectedCol = WhiteKnightDefaltCol1;
				}
				}
			if(DarkKnightMove2) {
				g.setColor(Color.GREEN);
				g.fillRect(tileX - 50, tileY - 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 50, tileY - 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 100, tileY - 50, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 100, tileY + 50, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 50, tileY + 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 50, tileY + 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 100, tileY + 50, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 100, tileY - 50, TILE_SIDE, TILE_SIDE);
				if(selectedRow == tileX - 50 && selectedRow == tileY - 100) {
					this.selectedRow = WhiteKnightDefaltRow1;
					this.selectedCol = WhiteKnightDefaltCol1;
				}
				
				else if(selectedRow == tileX + 50 && selectedRow == tileY - 100) {
					this.selectedRow = WhiteKnightDefaltRow1;
					this.selectedCol = WhiteKnightDefaltCol1;
				}
				
				else if(selectedRow == tileX + 100 && selectedRow == tileY - 50) {
					this.selectedRow = WhiteKnightDefaltRow1;
					this.selectedCol = WhiteKnightDefaltCol1;
				}
				
				else if(selectedRow == tileX + 100 && selectedRow == tileY + 50) {
					this.selectedRow = WhiteKnightDefaltRow1;
					this.selectedCol = WhiteKnightDefaltCol1;
				}
				
				else if(selectedRow == tileX + 50 && selectedRow == tileY + 100) {
					this.selectedRow = WhiteKnightDefaltRow1;
					this.selectedCol = WhiteKnightDefaltCol1;
				}
				
				else if(selectedRow == tileX - 50 && selectedRow == tileY + 100) {
					this.selectedRow = WhiteKnightDefaltRow1;
					this.selectedCol = WhiteKnightDefaltCol1;
				}
				
				else if(selectedRow == tileX - 100 && selectedRow == tileY + 50) {
					this.selectedRow = WhiteKnightDefaltRow1;
					this.selectedCol = WhiteKnightDefaltCol1;
				}
				
				else if(selectedRow == tileX - 100 && selectedRow == tileY - 50) {
					this.selectedRow = WhiteKnightDefaltRow1;
					this.selectedCol = WhiteKnightDefaltCol1;
				}
				}
			}
			if(Player == player1) {
			if(WhiteBishopMove1) {
				g.setColor(Color.GREEN);
				//upper left
				g.fillRect(tileX - 50, tileY - 50, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 100, tileY - 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 150, tileY - 150, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 200, tileY - 200, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 250, tileY - 250, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 300, tileY - 300, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 350, tileY - 350, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 400, tileY - 400, TILE_SIDE, TILE_SIDE);
				//upper right
				g.fillRect(tileX + 50, tileY - 50, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 100, tileY - 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 150, tileY - 150, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 200, tileY - 200, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 250, tileY - 250, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 300, tileY - 300, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 350, tileY - 350, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 400, tileY - 400, TILE_SIDE, TILE_SIDE);
				//down left
				g.fillRect(tileX - 50, tileY + 50, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 100, tileY + 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 150, tileY + 150, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 200, tileY + 200, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 250, tileY + 250, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 300, tileY + 300, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 350, tileY + 350, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 400, tileY + 400, TILE_SIDE, TILE_SIDE);
				//down right
				g.fillRect(tileX + 50, tileY + 50, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 100, tileY + 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 150, tileY + 150, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 200, tileY + 200, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 250, tileY + 250, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 300, tileY + 300, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 350, tileY + 350, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 400, tileY + 400, TILE_SIDE, TILE_SIDE);
				
				}
			if(WhiteBishopMove2) {
				g.setColor(Color.GREEN);
				//upper left
				g.fillRect(tileX - 50, tileY - 50, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 100, tileY - 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 150, tileY - 150, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 200, tileY - 200, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 250, tileY - 250, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 300, tileY - 300, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 350, tileY - 350, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 400, tileY - 400, TILE_SIDE, TILE_SIDE);
				//upper right
				g.fillRect(tileX + 50, tileY - 50, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 100, tileY - 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 150, tileY - 150, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 200, tileY - 200, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 250, tileY - 250, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 300, tileY - 300, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 350, tileY - 350, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 400, tileY - 400, TILE_SIDE, TILE_SIDE);
				//down left
				g.fillRect(tileX - 50, tileY + 50, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 100, tileY + 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 150, tileY + 150, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 200, tileY + 200, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 250, tileY + 250, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 300, tileY + 300, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 350, tileY + 350, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 400, tileY + 400, TILE_SIDE, TILE_SIDE);
				//down right
				g.fillRect(tileX + 50, tileY + 50, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 100, tileY + 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 150, tileY + 150, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 200, tileY + 200, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 250, tileY + 250, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 300, tileY + 300, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 350, tileY + 350, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 400, tileY + 400, TILE_SIDE, TILE_SIDE);
				
			}
			}
			else
			{
			if(DarkBishopMove1) {
				g.setColor(Color.GREEN);
				//upper left
				g.fillRect(tileX - 50, tileY - 50, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 100, tileY - 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 150, tileY - 150, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 200, tileY - 200, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 250, tileY - 250, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 300, tileY - 300, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 350, tileY - 350, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 400, tileY - 400, TILE_SIDE, TILE_SIDE);
				//upper right
				g.fillRect(tileX + 50, tileY - 50, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 100, tileY - 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 150, tileY - 150, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 200, tileY - 200, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 250, tileY - 250, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 300, tileY - 300, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 350, tileY - 350, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 400, tileY - 400, TILE_SIDE, TILE_SIDE);
				//down left
				g.fillRect(tileX - 50, tileY + 50, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 100, tileY + 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 150, tileY + 150, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 200, tileY + 200, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 250, tileY + 250, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 300, tileY + 300, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 350, tileY + 350, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 400, tileY + 400, TILE_SIDE, TILE_SIDE);
				//down right
				g.fillRect(tileX + 50, tileY + 50, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 100, tileY + 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 150, tileY + 150, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 200, tileY + 200, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 250, tileY + 250, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 300, tileY + 300, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 350, tileY + 350, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 400, tileY + 400, TILE_SIDE, TILE_SIDE);
				
				}
			if(DarkBishopMove2) {
				g.setColor(Color.GREEN);
				//upper left
				g.fillRect(tileX - 50, tileY - 50, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 100, tileY - 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 150, tileY - 150, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 200, tileY - 200, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 250, tileY - 250, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 300, tileY - 300, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 350, tileY - 350, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 400, tileY - 400, TILE_SIDE, TILE_SIDE);
				//upper right
				g.fillRect(tileX + 50, tileY - 50, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 100, tileY - 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 150, tileY - 150, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 200, tileY - 200, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 250, tileY - 250, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 300, tileY - 300, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 350, tileY - 350, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 400, tileY - 400, TILE_SIDE, TILE_SIDE);
				//down left
				g.fillRect(tileX - 50, tileY + 50, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 100, tileY + 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 150, tileY + 150, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 200, tileY + 200, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 250, tileY + 250, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 300, tileY + 300, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 350, tileY + 350, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX - 400, tileY + 400, TILE_SIDE, TILE_SIDE);
				//down right
				g.fillRect(tileX + 50, tileY + 50, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 100, tileY + 100, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 150, tileY + 150, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 200, tileY + 200, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 250, tileY + 250, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 300, tileY + 300, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 350, tileY + 350, TILE_SIDE, TILE_SIDE);
				g.fillRect(tileX + 400, tileY + 400, TILE_SIDE, TILE_SIDE);
				
			}
			}
			if(Player == player1) {
				if(WhiteRookMove1) {
					g.setColor(Color.GREEN);
					//up
					g.fillRect(tileX, tileY - 50, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY - 100, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY - 150, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY - 200, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY - 250, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY - 300, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY - 350, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY - 400, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY - 450, TILE_SIDE, TILE_SIDE);
					//down
					g.fillRect(tileX, tileY + 50, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY + 100, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY + 150, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY + 200, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY + 250, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY + 300, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY + 350, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY + 400, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY + 450, TILE_SIDE, TILE_SIDE);
					//left
					g.fillRect(tileX - 50, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 100, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 150, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 200, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 250, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 300, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 350, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 400, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 450, tileY, TILE_SIDE, TILE_SIDE);
					//right
					g.fillRect(tileX + 50, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 100, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 150, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 200, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 250, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 300, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 350, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 400, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 450, tileY, TILE_SIDE, TILE_SIDE);
				}
				
				if(WhiteRookMove2) {
					g.setColor(Color.GREEN);
					//up
					g.fillRect(tileX, tileY - 50, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY - 100, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY - 150, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY - 200, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY - 250, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY - 300, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY - 350, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY - 400, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY - 450, TILE_SIDE, TILE_SIDE);
					//down
					g.fillRect(tileX, tileY + 50, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY + 100, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY + 150, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY + 200, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY + 250, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY + 300, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY + 350, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY + 400, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY + 450, TILE_SIDE, TILE_SIDE);
					//left
					g.fillRect(tileX - 50, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 100, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 150, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 200, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 250, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 300, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 350, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 400, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 450, tileY, TILE_SIDE, TILE_SIDE);
					//right
					g.fillRect(tileX + 50, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 100, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 150, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 200, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 250, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 300, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 350, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 400, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 450, tileY, TILE_SIDE, TILE_SIDE);
				}
				else {
					if(WhiteRookMove1) {
						g.setColor(Color.GREEN);
						//up
						g.fillRect(tileX, tileY - 50, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 100, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 150, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 200, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 250, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 300, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 350, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 400, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 450, TILE_SIDE, TILE_SIDE);
						//down
						g.fillRect(tileX, tileY + 50, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 100, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 150, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 200, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 250, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 300, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 350, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 400, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 450, TILE_SIDE, TILE_SIDE);
						//left
						g.fillRect(tileX - 50, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 100, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 150, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 200, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 250, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 300, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 350, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 400, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 450, tileY, TILE_SIDE, TILE_SIDE);
						//right
						g.fillRect(tileX + 50, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 100, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 150, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 200, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 250, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 300, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 350, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 400, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 450, tileY, TILE_SIDE, TILE_SIDE);
					}
					if(DarkRookMove1) {
						g.setColor(Color.GREEN);
						//up
						g.fillRect(tileX, tileY - 50, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 100, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 150, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 200, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 250, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 300, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 350, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 400, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 450, TILE_SIDE, TILE_SIDE);
						//down
						g.fillRect(tileX, tileY + 50, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 100, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 150, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 200, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 250, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 300, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 350, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 400, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 450, TILE_SIDE, TILE_SIDE);
						//left
						g.fillRect(tileX - 50, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 100, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 150, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 200, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 250, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 300, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 350, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 400, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 450, tileY, TILE_SIDE, TILE_SIDE);
						//right
						g.fillRect(tileX + 50, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 100, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 150, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 200, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 250, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 300, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 350, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 400, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 450, tileY, TILE_SIDE, TILE_SIDE);
					}
					if(DarkRookMove2) {
						g.setColor(Color.GREEN);
						//up
						g.fillRect(tileX, tileY - 50, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 100, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 150, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 200, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 250, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 300, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 350, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 400, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 450, TILE_SIDE, TILE_SIDE);
						//down
						g.fillRect(tileX, tileY + 50, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 100, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 150, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 200, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 250, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 300, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 350, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 400, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 450, TILE_SIDE, TILE_SIDE);
						//left
						g.fillRect(tileX - 50, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 100, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 150, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 200, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 250, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 300, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 350, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 400, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 450, tileY, TILE_SIDE, TILE_SIDE);
						//right
						g.fillRect(tileX + 50, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 100, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 150, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 200, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 250, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 300, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 350, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 400, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 450, tileY, TILE_SIDE, TILE_SIDE);
					}
				}
				if(Player == player1) {
				if(WhiteQueenMove) {
					g.setColor(Color.GREEN);
					//up
					g.fillRect(tileX, tileY - 50, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY - 100, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY - 150, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY - 200, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY - 250, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY - 300, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY - 350, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY - 400, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY - 450, TILE_SIDE, TILE_SIDE);
					//down
					g.fillRect(tileX, tileY + 50, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY + 100, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY + 150, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY + 200, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY + 250, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY + 300, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY + 350, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY + 400, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY + 450, TILE_SIDE, TILE_SIDE);
					//left
					g.fillRect(tileX - 50, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 100, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 150, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 200, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 250, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 300, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 350, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 400, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 450, tileY, TILE_SIDE, TILE_SIDE);
					//right
					g.fillRect(tileX + 50, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 100, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 150, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 200, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 250, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 300, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 350, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 400, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 450, tileY, TILE_SIDE, TILE_SIDE);
					//upper left
					g.fillRect(tileX - 50, tileY - 50, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 100, tileY - 100, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 150, tileY - 150, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 200, tileY - 200, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 250, tileY - 250, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 300, tileY - 300, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 350, tileY - 350, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 400, tileY - 400, TILE_SIDE, TILE_SIDE);
					//upper right
					g.fillRect(tileX + 50, tileY - 50, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 100, tileY - 100, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 150, tileY - 150, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 200, tileY - 200, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 250, tileY - 250, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 300, tileY - 300, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 350, tileY - 350, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 400, tileY - 400, TILE_SIDE, TILE_SIDE);
					//down left
					g.fillRect(tileX - 50, tileY + 50, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 100, tileY + 100, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 150, tileY + 150, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 200, tileY + 200, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 250, tileY + 250, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 300, tileY + 300, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 350, tileY + 350, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 400, tileY + 400, TILE_SIDE, TILE_SIDE);
					//down right
					g.fillRect(tileX + 50, tileY + 50, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 100, tileY + 100, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 150, tileY + 150, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 200, tileY + 200, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 250, tileY + 250, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 300, tileY + 300, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 350, tileY + 350, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 400, tileY + 400, TILE_SIDE, TILE_SIDE);
					
				}
				}
				else
				{
					if(DarkQueenMove) {
						g.setColor(Color.GREEN);
						//up
						g.fillRect(tileX, tileY - 50, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 100, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 150, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 200, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 250, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 300, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 350, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 400, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY - 450, TILE_SIDE, TILE_SIDE);
						//down
						g.fillRect(tileX, tileY + 50, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 100, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 150, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 200, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 250, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 300, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 350, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 400, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX, tileY + 450, TILE_SIDE, TILE_SIDE);
						//left
						g.fillRect(tileX - 50, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 100, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 150, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 200, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 250, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 300, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 350, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 400, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 450, tileY, TILE_SIDE, TILE_SIDE);
						//right
						g.fillRect(tileX + 50, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 100, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 150, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 200, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 250, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 300, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 350, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 400, tileY, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 450, tileY, TILE_SIDE, TILE_SIDE);
						//upper left
						g.fillRect(tileX - 50, tileY - 50, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 100, tileY - 100, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 150, tileY - 150, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 200, tileY - 200, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 250, tileY - 250, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 300, tileY - 300, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 350, tileY - 350, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 400, tileY - 400, TILE_SIDE, TILE_SIDE);
						//upper right
						g.fillRect(tileX + 50, tileY - 50, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 100, tileY - 100, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 150, tileY - 150, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 200, tileY - 200, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 250, tileY - 250, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 300, tileY - 300, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 350, tileY - 350, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 400, tileY - 400, TILE_SIDE, TILE_SIDE);
						//down left
						g.fillRect(tileX - 50, tileY + 50, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 100, tileY + 100, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 150, tileY + 150, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 200, tileY + 200, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 250, tileY + 250, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 300, tileY + 300, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 350, tileY + 350, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX - 400, tileY + 400, TILE_SIDE, TILE_SIDE);
						//down right
						g.fillRect(tileX + 50, tileY + 50, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 100, tileY + 100, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 150, tileY + 150, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 200, tileY + 200, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 250, tileY + 250, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 300, tileY + 300, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 350, tileY + 350, TILE_SIDE, TILE_SIDE);
						g.fillRect(tileX + 400, tileY + 400, TILE_SIDE, TILE_SIDE);
						
					}
				}
				if(Player == player1) {
				if(WhiteKingMove) {
					g.setColor(Color.GREEN);
					g.fillRect(tileX, tileY - 50, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY + 50, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 50, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 50, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 50, tileY - 50, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 50, tileY - 50, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 50, tileY + 50, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 50, tileY + 50, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY - 450, TILE_SIDE, TILE_SIDE);
				}
				}
				else {
				if(DarkKingMove) {
					g.setColor(Color.GREEN);
					g.fillRect(tileX, tileY - 50, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX, tileY + 50, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 50, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 50, tileY, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 50, tileY - 50, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 50, tileY - 50, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX - 50, tileY + 50, TILE_SIDE, TILE_SIDE);
					g.fillRect(tileX + 50, tileY + 50, TILE_SIDE, TILE_SIDE);
				}
				}
				if(Player == player1) {
					if(WhitePawnMove1) {
						g.setColor(Color.GREEN);
						g.fillRect(tileX, tileY - 50, TILE_SIDE, TILE_SIDE);
				}
					if(WhitePawnMove2) {
						g.setColor(Color.GREEN);
						g.fillRect(tileX, tileY - 50, TILE_SIDE, TILE_SIDE);
				}
					if(WhitePawnMove3) {
						g.setColor(Color.GREEN);
						g.fillRect(tileX, tileY - 50, TILE_SIDE, TILE_SIDE);
				}
					if(WhitePawnMove4) {
						g.setColor(Color.GREEN);
						g.fillRect(tileX, tileY - 50, TILE_SIDE, TILE_SIDE);
				}
					if(WhitePawnMove5) {
						g.setColor(Color.GREEN);
						g.fillRect(tileX, tileY - 50, TILE_SIDE, TILE_SIDE);
				}
					if(WhitePawnMove6) {
						g.setColor(Color.GREEN);
						g.fillRect(tileX, tileY - 50, TILE_SIDE, TILE_SIDE);
				}
					if(WhitePawnMove7) {
						g.setColor(Color.GREEN);
						g.fillRect(tileX, tileY - 50, TILE_SIDE, TILE_SIDE);
				}
					if(WhitePawnMove8) {
						g.setColor(Color.GREEN);
						g.fillRect(tileX, tileY - 50, TILE_SIDE, TILE_SIDE);
				}
				}
				else {
					if(DarkPawnMove1) {
						g.setColor(Color.GREEN);
						g.fillRect(tileX, tileY + 50, TILE_SIDE, TILE_SIDE);
				}
					if(DarkPawnMove2) {
						g.setColor(Color.GREEN);
						g.fillRect(tileX, tileY + 50, TILE_SIDE, TILE_SIDE);
				}
					if(DarkPawnMove3) {
						g.setColor(Color.GREEN);
						g.fillRect(tileX, tileY + 50, TILE_SIDE, TILE_SIDE);
				}
					if(DarkPawnMove4) {
						g.setColor(Color.GREEN);
						g.fillRect(tileX, tileY + 50, TILE_SIDE, TILE_SIDE);
				}
					if(DarkPawnMove5) {
						g.setColor(Color.GREEN);
						g.fillRect(tileX, tileY + 50, TILE_SIDE, TILE_SIDE);
				}
					if(DarkPawnMove6) {
						g.setColor(Color.GREEN);
						g.fillRect(tileX, tileY + 50, TILE_SIDE, TILE_SIDE);
				}
					if(DarkPawnMove7) {
						g.setColor(Color.GREEN);
						g.fillRect(tileX, tileY + 50, TILE_SIDE, TILE_SIDE);
				}
					if(DarkPawnMove8) {
						g.setColor(Color.GREEN);
						g.fillRect(tileX, tileY + 50, TILE_SIDE, TILE_SIDE);
				}
				}
			}
			
			
			return;
		}
		
		g.setColor(tileColor);
		g.fillRect(tileX, tileY, TILE_SIDE, TILE_SIDE);
	
//			tileMoveColor = null;
//			//Knight
//			if(KnightisSelected) {
//			tileX1PossibleMoves = (selectedRow - 1) * TILE_SIDE;
//			tileY1PossibleMoves = (selectedCol - 2) * TILE_SIDE;
//			
//			tileX2PossibleMoves = (selectedRow + 1) * TILE_SIDE;
//			tileY2PossibleMoves = (selectedCol - 2) * TILE_SIDE;
//			
//			tileX3PossibleMoves = (selectedRow + 2) * TILE_SIDE;
//			tileY3PossibleMoves = (selectedCol - 1) * TILE_SIDE;
//			
//			tileX4PossibleMoves = (selectedRow + 2) * TILE_SIDE;
//			tileY4PossibleMoves = (selectedCol + 1) * TILE_SIDE;
//			
//			tileX5PossibleMoves = (selectedRow + 1) * TILE_SIDE;
//			tileY5PossibleMoves = (selectedCol + 2) * TILE_SIDE;
//			
//			tileX6PossibleMoves = (selectedRow - 1) * TILE_SIDE;
//			tileY6PossibleMoves = (selectedCol + 2) * TILE_SIDE;
//			
//			tileX7PossibleMoves = (selectedRow - 2) * TILE_SIDE;
//			tileY7PossibleMoves = (selectedCol + 1) * TILE_SIDE;
//			
//			tileX8PossibleMoves = (selectedRow - 2) * TILE_SIDE;
//			tileY8PossibleMoves = (selectedCol - 1) * TILE_SIDE;
//			tileMoveColor = Color.GREEN;


//			
			//Rook
			
//			tileX1PossibleMoves = (selectedRow) * TILE_SIDE;
//			tileY1PossibleMoves = (selectedCol + 1) * TILE_SIDE;
//			
//			tileX2PossibleMoves = (selectedRow) * TILE_SIDE;
//			tileY2PossibleMoves = (selectedCol + 2) * TILE_SIDE;
//			
//			tileX3PossibleMoves = (selectedRow) * TILE_SIDE;
//			tileY3PossibleMoves = (selectedCol + 3) * TILE_SIDE;
//			
//			tileX4PossibleMoves = (selectedRow) * TILE_SIDE;
//			tileY4PossibleMoves = (selectedCol + 4) * TILE_SIDE;
//			
//			tileX5PossibleMoves = (selectedRow) * TILE_SIDE;
//			tileY5PossibleMoves = (selectedCol + 5) * TILE_SIDE;
//			
//			tileX6PossibleMoves = (selectedRow) * TILE_SIDE;
//			tileY6PossibleMoves = (selectedCol + 6) * TILE_SIDE;
//			
//			tileX7PossibleMoves = (selectedRow) * TILE_SIDE;
//			tileY7PossibleMoves = (selectedCol + 7) * TILE_SIDE;
//			
//			tileX8PossibleMoves = (selectedRow) * TILE_SIDE;
//			tileY8PossibleMoves = (selectedCol + 8) * TILE_SIDE;
			
		
		
//		g.setColor(tileColor);
//		g.fillRect(tileX, tileY, TILE_SIDE, TILE_SIDE);
//		g.setColor(tileMoveColor);
//		g.fillRect(tileX1PossibleMoves, tileY1PossibleMoves, TILE_SIDE, TILE_SIDE);
//		g.fillRect(tileX2PossibleMoves, tileY2PossibleMoves, TILE_SIDE, TILE_SIDE);
//		g.fillRect(tileX3PossibleMoves, tileY3PossibleMoves, TILE_SIDE, TILE_SIDE);
//		g.fillRect(tileX4PossibleMoves, tileY4PossibleMoves, TILE_SIDE, TILE_SIDE);
//		g.fillRect(tileX5PossibleMoves, tileY5PossibleMoves, TILE_SIDE, TILE_SIDE);
//		g.fillRect(tileX6PossibleMoves, tileY6PossibleMoves, TILE_SIDE, TILE_SIDE);
//		g.fillRect(tileX7PossibleMoves, tileY7PossibleMoves, TILE_SIDE, TILE_SIDE);
//		g.fillRect(tileX8PossibleMoves, tileY8PossibleMoves, TILE_SIDE, TILE_SIDE);
    }
}