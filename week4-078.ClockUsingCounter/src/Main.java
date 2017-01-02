
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        
        System.out.print("seconds: ");
        int sec = Integer.parseInt(reader.nextLine());
        System.out.print("minutes: ");
        int min = Integer.parseInt(reader.nextLine());
        System.out.print("hours: ");
        int hr = Integer.parseInt(reader.nextLine());
        
        seconds.setValue(sec);
        minutes.setValue(min);
        hours.setValue(hr);

        
        int i = 0;
        
        while (i < 150){
            System.out.println(hours + ":" + minutes + ":" + seconds);    
     
            seconds.next();
            
            if (seconds.getValue() == 0){
                minutes.next();
                
                if (minutes.getValue() == 0)
                {
                    hours.next();
                }
                
            }
            

            
            i++;
        }
        

    }
}
