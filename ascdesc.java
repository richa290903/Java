/* Write a program to input 5 array value and print it into ascending 
 order and descending order*/
import java.util.Scanner;

class ascdesc {
      public static void main(String[] args) {
            int i,row,tmp=0,j;
            Scanner s1=new Scanner(System.in);
            System.out.print("Enter row size :");
            row=s1.nextInt();
            int x1[]=new int[row];
            for(i=0;i<row;i++){
                  System.out.print("Enter value of ["+i+"] :");
                  x1[i]=s1.nextInt();
            }
            System.out.println("Array is :");
            for(i=0;i<row;i++){
                  System.out.print(x1[i]+"\t");
            }
            for(i=0;i<row;i++){
                  for(j=i+1;j<x1.length;j++){
                        if(x1[i]>x1[j]){
                              tmp=x1[i];
                              x1[i]=x1[j];
                              x1[j]=tmp;
                        }
                  }
            }
            System.out.println("\nSorted elements are in ascending order :");
            for(i=0;i<row;i++){
                  System.out.print(x1[i]+"\t"); 
            }
            for(i=0;i<row;i++){
                  for(j=i+1;j<x1.length;j++){
                        if(x1[i]<x1[j]){
                              tmp=x1[i];
                              x1[i]=x1[j];
                              x1[j]=tmp;
                        }
                  }
            }
            System.out.println("\nSorted elements are in descending order :");
            for(i=0;i<row;i++){
                  System.out.print(x1[i]+"\t"); 
            }
      }      
}
