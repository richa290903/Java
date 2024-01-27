/*Write a program to create 3*3 matrix and store the first nine natural 
numbers in it row wise.
For example
1 2 3
4 5 6
7 8 9
Now design the methods to perform the following
1. sum of the numbers in each row
2. sum of the numbers in each column
3. sum of the numbers in left diagonal
4. sum of the numbers in right diagonal  */
import java.util.Scanner;
class matrixn
{
	public static void main(String a[])
	{
		int a1[][] = new int[3][3];
		int i,j,num=1;
		int rs=0,cs=0,ls=0,ris=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("Matrix is ...");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a1[i][j]=num;     //[0][0]=1 [0][1]=2
                        num++;            //2         3
			}
			System.out.println();
		}
            for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a1[i][j] + "\t");
			}
                  System.out.println();
		}
		System.out.println("\n\n1. sum of the numbers in each row ...\n\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				rs += a1[i][j];
			}
			System.out.println("Row " + (i+1) + " : " + rs);
			rs=0;
		}
		System.out.println("\n\n2. sum of the numbers in each colmns ...\n\n");
		for(j=0;j<3;j++)
		{
			for(i=0;i<3;i++)
			{
				cs += a1[i][j];
			}
			System.out.println("Column " + (j+1) + " : " + cs);
			cs=0;
		}
		System.out.print("\n\n3.sum of the numbers in left diagonal : ");
		for(i=0;i<3;i++)
		{
			ls += a1[i][i];
		}
		System.out.print(ls);
		System.out.print("\n\n4.sum of the numbers in right diagonal : ");
		for(i=0;i<3;i++)
		{
			ris += a1[i][3-1-i];
		}
		System.out.print(ris);		
	}
}
