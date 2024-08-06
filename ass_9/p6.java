/*write a program to execute two threads like EVEN and ALPHA. Thread EVEN will display even numbers from 1 to 100.while theads ALPHA will displays alphabets A to Z. */
class eventhread extends Thread {
      public void run() {
            for (int i = 1; i <= 100; i++) {
                  if(i%2==0){
                        System.out.print(i+"\t");
                  }
            }
      }
  }
class alphathread extends Thread {
      public void run() {
           
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                  System.out.print(ch+"\t");
            }
      }
}
public class p6 {
      public static void main(String[] args) {
          eventhread et = new eventhread();
          alphathread at = new alphathread();
          
          et.start();
          at.start();
      }
}
  
