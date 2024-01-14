/*write a java program to initialize two arrays of integers data type and 
print out total comman elements from both arrays.*/
class common {
      public static void main(String[] args) {
            int x1[]={10,20,30,40,50};
		int x2[]={10,20,60,90,50};
		int i,count=0;
		System.out.print("First Array is : ");
		for(i=0;i<5;i++)
		{
			System.out.print(x1[i] + "   ");
		}
		System.out.println();
		System.out.print("Second Array is : ");
		for(i=0;i<5;i++)
		{
			System.out.print(x2[i]+"   ");
		}
		for(i=0;i<5;i++)
		{
			if(x1[i]==x2[i])
			{
				count++;
			}
		}
		System.out.println();
		System.out.println("Total same element is : "+count);
      }      
}
