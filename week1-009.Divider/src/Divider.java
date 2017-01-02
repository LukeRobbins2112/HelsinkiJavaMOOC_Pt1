
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        
        System.out.println("Please enter the dividend");
        double firstNum = Integer.parseInt(reader.nextLine());
        System.out.println("Plese enter the divisor");
        double secondNum = Integer.parseInt(reader.nextLine());
        double result = firstNum/secondNum;
        System.out.println("Division: " + firstNum + " / " + secondNum + " = " + result);
    }
}
