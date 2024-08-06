
class method{
      int i,j,num=1;
	int rs=0,cs=0,ls=0,ris=0;
      int a1[][] = new int[3][3];

      void matrix()
      {
            System.out.println("Matrix is ...");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a1[i][j]=num;     
                        num++;            
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
      }
      void row_total()
      {
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
      }
      void col_total()
      {
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
      }
      void left_diagonal(){
            System.out.print("\n\n3.sum of the numbers in left diagonal : ");
		for(i=0;i<3;i++)
		{
			ls += a1[i][i];
		}
            System.out.print(ls);
      }
      void right_diagonal(){
            System.out.print("\n\n4.sum of the numbers in right diagonal : ");
		for(i=0;i<3;i++)
		{
			ris += a1[i][3-1-i];
		}
		System.out.print(ris);
      }
}
class matrixmethod
{
	public static void main(String a[])
	{
            method m1=new method();
		m1.matrix();
            m1.row_total();
            m1.col_total();
            m1.left_diagonal();
            m1.right_diagonal();
	}
}

