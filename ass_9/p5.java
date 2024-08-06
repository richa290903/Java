
/*write a program to create digital clock that display the output in the following way.  
    time:HH:MM::SS */
import java.text.SimpleDateFormat;
import java.util.Date;

class clockthread extends Thread {
    public void run() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

        while (true) {
            Date now = new Date();
            String currentTime = dateFormat.format(now);
            System.out.print("\rTime:" + currentTime);
            try {
                Thread.sleep(1000); 
            }
            catch (InterruptedException e) {
                System.out.println("Main Thread Interrupted");
            }
        }
    }
}
public class p5 {
    public static void main(String[] args) {
        clockthread ct = new clockthread();
        ct.start();
    }
}
