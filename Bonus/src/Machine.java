
public class Machine {
	
    int power;
	int height;
	String Color;

	public Machine(int power,int height, String Color) {
		this.power = power;
		this.height = height;
		this.Color = Color;	
	}

	public static void Machine(int power,int height, String Color) {
		System.out.print("The Power of thig machine is " + power + " and the height is " + height + " with color " + Color);
		System.out.println();
	}

}
