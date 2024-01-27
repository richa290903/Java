/*Write a program to identify and to remove duplicate elements in a 
one-dimensional array. Program should display the original array and
the modified array after removing the duplicates. */
import java.util.Scanner;
class rmv {
      public static void main(String[] args) {
            int row,i,j;
            Scanner s1=new Scanner(System.in);
            System.out.print("Enter row size :");
            row=s1.nextInt();
            int x1[]=new int[row];
            int ma[]=new int[row];
            for(i=0;i<row;i++){
                  System.out.print("Enter value of ["+i+"] :");
                  x1[i]=s1.nextInt();
            }
            System.out.println("Array is :");
            for(i=0;i<row;i++){
                  System.out.print(x1[i]+"\t");
            }
            System.out.println("\nArray elements after deletion of the duplicate elements: ");    
            for (i=0;i<row;i++)  
            {  
                  for(j=i+1;j<row;j++)  
                  {    
                        if(x1[i]==x1[j]) 
                        {   
                              x1[j]=x1[row-1];  
                              row--;
                              j--;
                        } 
                  }    
            }    
            for (i=0;i<row;i++)  
            {    
                  ma[i]=x1[i];
                  System.out.print(ma[i]+"\t");  
            }
      }
}

