/*Write a program to create an array stock containing script name, 
opening and closing prices per share as follows:
Script Name       Opening     Closing     Difference
TCS               2770.30     2776.60     6.30
SBI               600         650         50
Tata Steel        1233        1240        7
IRCTC             938.75      945.50      6.75
Design the methods to perform the following activities:
(1) Print difference of prices for each share
(2) Print the name of the share that has got the maximum rise.
(3) Print the average opening and closing prices for all the shares.
 */
import java.util.*;

class share {
        public static void main(String[] args) {
            int row,i;
            double mr=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter how many records you want to print :");
            row=sc.nextInt();
            String name[]=new String[row];
            double op[]=new double[row];
            double cp[]=new double[row];
            double d[]=new double[row];
            for(i=0;i<row;i++)
            {
                System.out.print("Enter ["+(i+1)+"] Script name :");
                sc.nextLine();
                name[i] = sc.nextLine();
                System.out.print("Enter ["+(i+1)+"] opening price :");
                op[i]=sc.nextDouble();
                System.out.print("Enter ["+(i+1)+"] closing price :");
                cp[i]=sc.nextDouble();
                d[i]=cp[i]-op[i];
            }
            System.out.println("Name\tOpening price\tClosing Price\tDiffrence");
            for(i=0;i<row;i++)
            {
                  System.out.println(name[i]+"\t"+op[i]+"\t\t"+cp[i]+"\t\t"+d[i]);
            }
            String maxrisename="";
            for (i=0;i<name.length;i++) 
            {
                if (d[i] > mr) {
                    mr = d[i];
                    maxrisename = name[i];
                }
            }
            System.out.println("Share with Maximum Rise: " + maxrisename);
            double top = 0;
            double tcp = 0;

            for (i=0;i<name.length;i++) 
            {
                top = top+op[i];    
                tcp = tcp+cp[i];
            }
            double avgOpening = top / row;
            double avgClosing = tcp / row;
            System.out.println("Average Opening Price: " + avgOpening);
            System.out.println("Average Closing Price: " + avgClosing);
        }      
}
