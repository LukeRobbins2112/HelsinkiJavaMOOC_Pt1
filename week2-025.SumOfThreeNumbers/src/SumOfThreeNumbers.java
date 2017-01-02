
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable

        System.out.print("Please enter the first number: ");
        read = Integer.parseInt(reader.nextLine());
        sum = sum + read;
        System.out.print("Please enter the second number: ");
        read = Integer.parseInt(reader.nextLine());
        sum = sum + read;
        System.out.print("Please enter the third number: ");
        read = Integer.parseInt(reader.nextLine());
        sum = sum + read;
        
       
        System.out.println("Sum: " + sum);
    }
}
