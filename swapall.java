/*
int a1[]={11,42,-5,27,0,89};
int a2[]={10,20,30,40,50,60};
after swapping ,the arrays should store the following elements:
int a1[]={10,20,30,40,50,60};
int a2[]={11,42,-5,27,0,89};*/

class swapall {
      public static void main(String[] args) {
            int a1[]={11,42,-5,27,0,89};
		int a2[]={10,20,30,40,50,60};
		int i;
		System.out.println("Before Swapping..........");
		System.out.print("First Array is : ");
		for(i=0;i<6;i++)
		{
			System.out.print(a1[i] + "   ");
		}
		System.out.println();
		System.out.print("Second Array is : ");
		for(i=0;i<6;i++)
		{
			System.out.print(a2[i]+"   ");
		}
		for(i=0;i<6;i++)
		{
			a1[i]=a1[i]+a2[i];
			a2[i]=a1[i]-a2[i];
			a1[i]=a1[i]-a2[i];
		}
		System.out.println();
		System.out.println("After Swapping..........");
		System.out.print("First Array is : ");
		for(i=0;i<6;i++)
		{
			System.out.print(a1[i] + "   ");
		}
		System.out.println();
		System.out.print("Second Array is : ");
		for(i=0;i<6;i++)
		{
			System.out.print(a2[i]+"   ");
		}

      }      
}
