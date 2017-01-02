import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        int i = 1;
        int total = 1;
        
        while (i <= number){
            total *= i;
            i++;
        }
        
        System.out.println("Factorial is " + total);
               
        
    }
}
