class array1 {
      public static void main(String[] args) {
            int i,total;
		double per;
		char grade;
		int rollno[]={1,2,3};
		String name[]={"ABC","DEF","GHI"};
		int sub1[]={70,65,75};
		int sub2[]={80,60,65};
		int sub3[]={60,80,70};
		System.out.println("rollno\tname\tsubject 1\tsubject 2\tsubject 3\tGrade");
		for(i=0;i<3;i++)
		{
			total=sub1[i]+sub2[i]+sub3[i];
			per=total/3;
			System.out.println("Total :"+total);
			System.out.println("Percentage :"+per);
			if(per>=40 && per<50)
			{
				grade='D';	
			}
			else if(per>=50 && per<60)
			{
				grade='C';	
			}
			else if(per>=60 && per<70)
			{
				grade='B';	
			}
			else
			{
				grade='A';	
			}
			System.out.println(rollno[i] + "\t" + name[i] + "\t\t" + sub1[i] + "\t\t" + sub2[i] + "\t\t" + sub3[i] + "\t" + grade);
		}

      }      
}
