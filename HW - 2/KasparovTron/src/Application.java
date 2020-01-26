import java.util.Scanner;
import com.kasparovtron.tests.tests1v1.Bishop1vs1;
import com.kasparovtron.tests.tests1v1.King1vs1;
import com.kasparovtron.tests.tests1v1.Knight1vs1;
import com.kasparovtron.tests.tests1v1.Pawn1vs1;
import com.kasparovtron.tests.tests1v1.Queen1vs1;
import com.kasparovtron.tests.tests1v1.Rook1vs1;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Choice your fighters: Bishops(b), Kings(k), Knights(n), Queens(q), Pawns(p), Rooks(r)");
		String choice = input.nextLine();
		switch (choice) {
		case "b":
		Bishop1vs1.BishopBattle();
		break;
		
		case "k":
        King1vs1.KingBattle();
        break;
        
		case "n":
		Knight1vs1.KnightBattle();
		break;
		
		case "q":
		Queen1vs1.QueenBattle();
		break;
		
		case "p":
		Pawn1vs1.PawnBattle();
		break;
		
		case "r":
		Rook1vs1.RookBattle();
		break;
		}
		
	}
}
