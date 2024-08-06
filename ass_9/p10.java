/*write a program to create thread that prints 1 to 10 multiplication table as per given following image.
 */

class tablethread extends Thread {
      int i,j;
      public void run() {
            for (i = 1; i <=10; i++) {
                  for(j=1;j<=10;j++){
                        System.out.print(i*j+"\t");
                        
                  }
                  System.out.println();
            }
            
      }
  }
  public class p10 {
      public static void main(String[] args) {
            tablethread t = new tablethread();
            t.start();
      }
  }