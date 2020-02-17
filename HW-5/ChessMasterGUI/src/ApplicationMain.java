import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class ApplicationMain {

	public static void main(String[] args) {
		
		JFrame windowFrame = new JFrame();
		
		
		
		
		
		
		windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowFrame.setSize(500, 500);
		
		
		
		
		windowFrame.add(new GameBoardPanel());
//		windowFrame.add(new JPanel() {
//			
//			public void paint(Graphics g) {
//				
//				g.setColor(Color.black);
//				g.fillRect(10, 10, 100, 100);
//			}
//		});
		
		
		new AbstractTest() {
			
			@Override
			public void initClassMethod() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		windowFrame.setVisible(true);
		
		
		String[] collection = new String[] {
			"H", "B", "C"	
		};
		
	}
}