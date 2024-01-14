class matrix {
      public static void main(String[] args) {
            int x1[][]={{1,1,1},{2,2,2},{3,3,3}};
		int x2[][]={{4,4,4},{3,3,3},{5,5,5}};	
		int x3[][]= new int[3][3];
		int i,j,k;
		System.out.println("First Matrix is..........");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(x1[i][j] + "   ");
			}
			System.out.println();
		}
		System.out.println("Second Matrix is..........");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(x2[i][j] + "   ");
			}
			System.out.println();
		}
		System.out.println("Addition of two Matrix is..........");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(x1[i][j]+x2[i][j] + "   ");
			}
			System.out.println();
		}
		System.out.println("Subtraction of two Matrix is..........");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(x1[i][j]-x2[i][j] + "   ");
			}
			System.out.println();
		}
		System.out.println("Multiplication of two Matrix is..........");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{	
				for(k=0;k<3;k++)
				{
					x3[i][j]=x3[i][j]+x1[i][k]*x2[k][j];
				}
				System.out.print(x3[i][j]+"   ");
			}
			System.out.println();
		}
      }      
}
