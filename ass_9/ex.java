// class ex
// {
//       public static void main(String arg[])
//       {
//             Thread t=Thread.currentThread();
//             System.out.println("Current Thread=" +t);
//             t.setName("My Thread");
//             System.out.println("After Name Change:" +t);
//             try
//             {
//                   for(int i=5;i>0;i--)
//                   {
//                         System.out.println(i);
//                         Thread.sleep(1000);
//                   }
//             }
//             catch(InterruptedException e)
//             {
//                   System.out.println("Main Thread Interrupted");
//       }
//  }
// }
// Create multiple threads.
class newthread implements Runnable
{
      String name; //name of thread
      Thread t;
      newthread(String threadname)
      {
            name = threadname;
            t = new Thread(this, name);
            System.out.println("New thread: " + t);
            t.start(); // Start the thread
      }
      // This is the entry point for thread.
      public void run()
      {
            try {
                  for(int i = 5; i > 0; i--)
                  {
                  System.out.println(name + ": " + i);
                  Thread.sleep(1000);
                  }
            } 
            catch (InterruptedException e) {
                  System.out.println(name + "Interrupted");
            }
            System.out.println(name + " exiting.");
      }
}

class ex
{     
      public static void main(String args[])
      {
            new newthread("One"); // start threads or newthread n1=new newthread(“One”);
            new newthread("Two"); // or newthread n2=new newthread(“Two”);
            new newthread("Three"); // or newthread n3=new newthread(“Three”);
            try
            {
                  // wait for other threads to end
                  Thread.sleep(10000);
            }
            catch (InterruptedException e) {
                  System.out.println("Main thread Interrupted");
            }
            System.out.println("Main thread exiting.");
      }
}