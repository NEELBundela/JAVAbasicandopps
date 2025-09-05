import java.util.Timer;
import java.util.TimerTask;

public class timertask {
    public static void main(String[] args) {
        Timer timer  = new Timer();
        TimerTask task = new TimerTask() {
            int i=0;
            @Override
            public void run() {
                System.out.println("Hello....");
                i++;
                if(i>=3){
                    System.out.println("Task completed");
                    timer.cancel();
                }
            }
        };
        //timer.schedule(task,3000); //it will print hello after 3 sec
        timer.schedule(task,0,1000);
    }
}
