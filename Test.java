// Java program to demonstrate 
//schedule method calls of Timer class 
  
import java.util.Timer; 
import java.util.TimerTask;

/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    public static void main(String[] args) 
    { 
          
        Timer timer = new Timer(); 
        TimerTask task = new Helper(); 
          
        timer.schedule(task, 1000, 1000); 
        while (Helper.timeRemain > 0) {
            System.out.println(Helper.timeRemain);
        }
    } 
}
