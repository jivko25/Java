import com.kasparovtron.config.PieceColor;
import com.kasparovtron.pieces.*;
import com.kasparovtron.tests.BishopTest;
import com.kasparovtron.tests.KingTest;
import com.kasparovtron.tests.KnightTest;
import com.kasparovtron.tests.PawnTest;
import com.kasparovtron.tests.QueenTest;
import com.kasparovtron.tests.RookTest;

public class Application {

	public static void main(String[] args) {
		
		// How to restrict the input parameter. 
		// I need only two specific color strings
		// Pawn p1 = new Pawn(PieceColor.BLACK, 1, 0);
		
		PawnTest.run();
		KingTest.run();
		QueenTest.run();
		RookTest.run();
		BishopTest.run();
		KnightTest.run();
	}
}
