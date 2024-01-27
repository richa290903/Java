/*Write a program to create two 3*3 matrix and perform addition, 
subtraction, multiplication operation. */
import java.util.Scanner;

class matrix {
      public static void main(String[] args) {
		int i,j,k,row,col;
		Scanner s1 = new Scanner(System.in);
            System.out.print("Enter row size :");	
            row=s1.nextInt();
		System.out.print("Enter column size :");
            col=s1.nextInt();
            int x1[][]=new int[row][col];	
		int x2[][]=new int[row][col];
		int x3[][]=new int[row][col];
		System.out.println("First Matrix is..........");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print("Enter value for x1["+i+"]["+j+"]:");
				x1[i][j]=s1.nextInt();
			}
			System.out.println();
		}
		System.out.println("Second Matrix is..........");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print("Enter value for x1["+i+"]["+j+"]:");
				x2[i][j]=s1.nextInt();
			}
			System.out.println();
		}
		System.out.println("First Matrix is..........");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(x1[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Second Matrix is..........");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(x2[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Addition of two Matrix is..........");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(x1[i][j]+x2[i][j] + "   ");
			}
			System.out.println();
		}
		System.out.println("Subtraction of two Matrix is..........");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(x1[i][j]-x2[i][j] + "   ");
			}
			System.out.println();
		}
		System.out.println("Multiplication of two Matrix is..........");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{	
				for(k=0;k<x3.length;k++)
				{
					x3[i][j]=x3[i][j]+x1[i][k]*x2[k][j];
				}
				System.out.print(x3[i][j]+"   ");
			}
			System.out.println();
		}
      }      
}
