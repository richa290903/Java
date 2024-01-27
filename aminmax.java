/*Write a program to input 5 array value and find out maximum value and minimum value as well as count positive value and negative value.*/

import java.util.Scanner;

class aminmax{
      public static void main(String[] args) {
            int row,i,max,min,positive,negative,zero;
            positive=negative=zero=0;
            Scanner s1 = new Scanner(System.in);   
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
            max=x1[0];
            min=x1[0];
            for(i=0;i<row;i++){
                  if(max<x1[i]){
                        max=x1[i];
                  }
                  else if(min>x1[i]){
                        min=x1[i];
                  }
            }
            System.out.println("\n\nMaximum number is :"+max);
            System.out.println("Minimum number is :"+min);
            for(i=0;i<row;i++){
                  if(x1[i]>0)
                  {
                        positive++;
                  }
                  else if(x1[i]<0){
                        negative++;
                  }
                  else{
                        zero++;
                  }
            }
            System.out.println("\nTotal Positive number is :"+positive);
            System.out.println("\nTotal Negative number is :"+negative);
            System.out.println("\nTotal zero number is :"+zero);
            
      }
}