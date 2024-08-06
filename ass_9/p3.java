/*write a program to create a thread that display prime number from 1 to n after 1 second. */
import java.util.Scanner;
class primethread extends Thread {
      int i,j,n;
      public primethread(int no) {
          n = no;
      }
      public void run() {
            for (int i = 1; i <= n; i++) {
                  for(j=2;j<=i;j++){
                        if (i%j==0) {
                              break;
                        }
                  }
                  if(i==j){
                        try {
                              Thread.sleep(1000); 
                              System.out.print(i+"\t");
                        } 
                        catch (InterruptedException e) {
                              System.out.println("Main Thread Interrupted");
                        }
                  }
            }
      }
  }
  
 class p3 {
      public static void main(String[] args) {
            int n; 
            Scanner s1=new Scanner(System.in);
            System.out.print("Enter how many number you want to display :");
            n=s1.nextInt();
            primethread pt = new primethread(n);
            pt.start();
      }
  }
  