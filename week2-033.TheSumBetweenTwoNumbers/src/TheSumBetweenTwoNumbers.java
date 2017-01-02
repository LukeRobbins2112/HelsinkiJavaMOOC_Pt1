
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Please enter a lower limit: ");
        int lower = Integer.parseInt(reader.nextLine());
        System.out.print("Please enter an upper limit: ");
        int upper = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        int i = lower;
        
        while (i <= upper){
            sum+=i;
            i++;
        }
        
        System.out.println("The sum is " + sum);
        
    }
}
