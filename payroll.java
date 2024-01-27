/*Write a program to create payroll sheet of employees. [create atleast 
3 list of employees]
*/
import java.util.Scanner;
class payroll {
      public static void main(String[] args) {
            int row,i;
            Scanner s1=new Scanner(System.in);
            System.out.println("How many Employee payroll sheet you want to insert :");
            row=s1.nextInt();
            int no[]=new int[row];
            String name[]=new String[row];
            int p_h[]=new int[row];
            int h_worked[]=new int[row];
            int o_h[]=new int[row];
            int overtime_hours[]=new int[row];
            double gross_pay[]=new double[row];
            for(i=0;i<row;i++)
            {
                  System.out.print("Enter ["+(i+1)+"] Employee no :");
                  no[i]=s1.nextInt();
                  System.out.print("Enter ["+(i+1)+"] Employee name :");
                  name[i]=s1.next();
                  System.out.print("Enter ["+(i+1)+"] pay/hours :Rs.");
                  p_h[i]=s1.nextInt();
                  System.out.print("Enter ["+(i+1)+"] hours Worked :");
                  h_worked[i]=s1.nextInt();
                  System.out.print("Enter ["+(i+1)+"] overtime/hours :Rs.");
                  o_h[i]=s1.nextInt();
                  System.out.print("Enter ["+(i+1)+"] overtime hours :");
                  overtime_hours[i]=s1.nextInt();
                  gross_pay[i]=p_h[i]*h_worked[i]+o_h[i]*overtime_hours[i];
            }
            System.out.println("Employeee Payroll Information.......");
            System.out.println("No\tName\tpay/hours\thours Worked\tovertime/hours\tovertime hours\tTotal Gross pay");
            for(i=0;i<row;i++)
            {
                  
                  System.out.println(no[i]+"\t"+name[i]+"\t\tRs."+p_h[i]+"\t\t"+h_worked[i]+"\t\tRs."+o_h[i]+"\t\t"+overtime_hours[i]+"\tRs."+gross_pay[i]);
            }
      }      
}
