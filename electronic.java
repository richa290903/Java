/*Design a program by creating dynamic array of 5 elements that contains the following 
list of electronic shop. Display the output in an appropriate format.
NAME        CODE        QTY         RATE        TOTAL
-------------------------------------------------------------------------------------
Tablet      1001        05          5000        25000
Adapter     1002        10          1500        15000
MP3 Player  1003        10          1200        12000
……..        ……..        ………         ……….        ……..
……..        ……..        ………         ……….        …….. */

import java.util.Scanner;

class electronic {
      public static void main(String[] args) {
            int row,i;
            Scanner s1=new Scanner(System.in);
            System.out.println("How many Electronic Item you want to insert :");
            row=s1.nextInt();
            String name[]=new String[row];
            int code[]=new int[row];
            int qty[]=new int[row];
            int rate[]=new int[row];
            int total[]=new int[row];
            for(i=0;i<row;i++)
            {
                  System.out.print("Enter ["+(i+1)+"] electronic item name :");
                  s1.nextLine();
                  name[i]=s1.nextLine();
                  System.out.print("Enter ["+(i+1)+"] electronic item code :");
                  code[i]=s1.nextInt();
                  System.out.print("Enter ["+(i+1)+"] electronic item qty :");
                  qty[i]=s1.nextInt();
                  System.out.print("Enter ["+(i+1)+"] electronic item rate :");
                  rate[i]=s1.nextInt();
                  total[i]=qty[i]+rate[i];
            }
            System.out.println("Electronic Item List.....");
            System.out.println("Name\t\tCode\tQty\tRate\tTotal");
            System.out.println("------------------------------------------------");
            for(i=0;i<row;i++)
            {
                  System.out.println(name[i]+"\t\t"+code[i]+"\t"+qty[i]+"\t"+rate[i]+"\t"+total[i]);
            }

      }
}
