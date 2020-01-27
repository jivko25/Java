package com.kasparovtron.tests.tests1v1;


public class Visualisation {
	
	public static void MoveVisualisation(int x, int y, int a, int b) {
		int BeforeX = a - 1;
		int BetweenXY = x - a - 1;
		int AfterX = 10 - x;
		int BeforeY = x - 1;
		int BetweenYX = a - x - 1;
		int AfterY = 10 - a;
		int m = 10-x;;
		int n = 10-a;
		if(y != b) {
		for(int i = 9;i>0; i--)
		{
			if(b != y) {
			if(i != y)
			{
				System.out.print("- - - - - - - - - -");
				System.out.println("");
			}
			if(i == y)
			{
				for(int k = 1;k<x;k++)
				{
					System.out.print("- ");
				}
				System.out.print("1 ");
				for(int c = 0;m>c; c++)
				{
					System.out.print("- ");
				}
				System.out.println("");
			}
			if(i == b)
			{
				for(int h = 1;h<a;h++)
				{
					System.out.print("- ");
				}
				System.out.print("2 ");
				for(int p = 0;n>p; p++)
				{
					System.out.print("- ");
				}
				System.out.println("");
			}
			}
		}
		}
			if(y == b)
			{
				if(x > a) {
				for(int ix = 10;ix>0; ix--)
				{
				if(ix != y)
				{
					System.out.print("- - - - - - - - - -");
					System.out.println("");
				}
				if(ix == y) {
				for(int q = 0;q<BeforeX;q++)
				{
					System.out.print("- ");
				}
				System.out.print("2 ");
				
				for(int p = 0;BetweenXY>p; p++)
				{
					System.out.print("- ");
				}
				System.out.print("1 ");
				for(int t = 0;AfterX>t;t++)
				{
					System.out.print("- ");
				}
				System.out.println("");
				}
			}
				System.out.println("");
				}
				if(a > x) {
					for(int iy = 10;iy>0; iy--)
					{
					if(iy != y)
					{
						System.out.print("- - - - - - - - - -");
						System.out.println("");
					}
					if(iy == y) {
					for(int q = 0;q<BeforeY;q++)
					{
						System.out.print("- ");
					}
					System.out.print("1 ");
					
					for(int p = 0;BetweenYX>p; p++)
					{
						System.out.print("- ");
					}
					System.out.print("2 ");
					for(int t = 0;AfterY>t;t++)
					{
						System.out.print("- ");
					}
					System.out.println("");
					}
				}
					System.out.println("");
					}
		}
	}
}
