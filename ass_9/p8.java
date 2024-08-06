/*Assume that one class has method (void print(char oper)) that perform the mathematical operations addition,subtraction,multipliaction and division on the same object at sametime.write a java program to solve this problem using synchronization concept in java. */
class mathoperation {
    private int ans;
      public synchronized void print(char oper,int operand) {
          switch (oper) {
              case '+':
                  ans += operand;
                  System.out.println("Addition: " + ans);
                  break;
              case '-':
                  ans -= operand;
                  System.out.println("Subtraction: " + ans);
                  break;
              case '*':
                  ans *= operand;
                  System.out.println("Multiplication: " + ans);
                  break;
              case '/':
                  if (operand != 0) {
                        ans /= operand;
                      System.out.println("Division: " + ans);
                  } else {
                      System.out.println("Error: Division by zero");
                  }
                  break;
              default:
                  System.out.println("Error: Invalid operator");
          }
      }
  }
  
  class operationthread extends Thread {
      private mathoperation mo;
      private char operator;
      private int operand;
  
      public operationthread(mathoperation mathOperation, char operator, int operand) {
          this.mo = mathOperation;
          this.operator = operator;
          this.operand = operand;
      }
  
      public void run() {
            mo.print(operator,operand);
      }
  }
  
  public class p8 {
      public static void main(String[] args) {
            mathoperation mo = new mathoperation();
  
          // Creating threads for mathematical operations
          operationthread add = new operationthread(mo, '+', 10);
          operationthread sub = new operationthread(mo, '-', 5);
          operationthread multi = new operationthread(mo, '*', 3);
          operationthread div = new operationthread(mo, '/', 2);
  
          // Start threads
          add.start();
          sub.start();
          multi.start();
          div.start();
      }
  }