/*write a program to create two threads that ha at least 5 car names as well as your friens's name. city names will be displayed after 1 second and friend's name will be after 2 seconds. */

class carthread extends Thread {
      String car[]={"Audi","BMW","Rang Rover","Thar","Scorpio"};
      public void run() {
          for (String cars : car) {
              try {
                  Thread.sleep(1000); 
                  System.out.println("car: " + cars);
              }
            catch (InterruptedException e) {
                  System.out.println("Main Thread Interrupted");
              }
          }
      }
  }
  
  class friendthread extends Thread {
     String names[]={"abc","def","ght","aew","qwe"};
      public void run() {
          for (String name : names) {
              try {
                  Thread.sleep(2000); 
                  System.out.println("Friend: " + name);
              } 
              catch (InterruptedException e) {
                  System.out.println("Main Thread Interrupted");
              }
          }
      }
  }
  
  class p2 {
      public static void main(String[] args) {
          carthread ct = new carthread();
          friendthread ft = new friendthread();
          
          ct.start();
          ft.start();
      }
  }
  

