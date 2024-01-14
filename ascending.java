class ascending {
      public static void main(String[] args) {
            int x1[]={20,30,50,10,40};
		int i,j,tmp;
		for(i=0;i<5;i++)
		{
			System.out.print(x1[i] + "   ");
		}
		for(i=1;i<5;i++)
		{
			for(j=0;j<(x1.length)-1;j++)
			{
				if(x1[j]>x1[j+1])
				{
					tmp=x1[j];
					x1[j]=x1[j+1];
					x1[j+1]=tmp;
				}
			}
		}
		System.out.println();
		System.out.println("Array in Ascending order..........");
		for(i=0;i<5;i++)
		{
			System.out.print(x1[i] + "   ");
		}
      }      
}
