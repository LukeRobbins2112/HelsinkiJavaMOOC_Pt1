
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Please enter the final power of 2: ");
        int number = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        int i = 0;
        
        while (i <= number){
            sum += Math.pow(2, i);
            i++;
        }

        System.out.println("The result is " + sum);
    }
}
