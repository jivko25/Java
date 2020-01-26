package com.kasparovtron.tests.tests1v1;


public class Visualisation {
	
	public static void MoveVisualisation(int RowV, int ColV ) {
		int VarTool1 = 10-RowV;;
		for(int i = 10;i>0; i--)
		{
			if(i != ColV)
			{
				System.out.print("- - - - - - - - - -");
				System.out.println("");
			}
			else
			{
				for(int k = 1;k<RowV;k++)
				{
					System.out.print("- ");
				}
				System.out.print("+ ");
				for(int c = 0;VarTool1>c; c++)
				{
					System.out.print("- ");
				}
				System.out.println("");
			}
		}
		
	}

}
