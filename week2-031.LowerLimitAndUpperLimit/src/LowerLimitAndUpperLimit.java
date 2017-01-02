
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Please enter the lower limit: ");
        int lower = Integer.parseInt(reader.nextLine());
        System.out.print("Please enter the upper limit: ");
        int upper = Integer.parseInt(reader.nextLine());
        
        int count = lower;
        
        if (lower > upper){
            System.out.println("Please try again.");
        }
        
        while (count <= upper){
                System.out.println(count);
                count++;
            }
        

    }
}
