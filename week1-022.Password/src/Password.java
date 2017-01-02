
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; 

        
        System.out.print("Type the password: ");
        String attempt = reader.nextLine();
        
        
        
        while (!(attempt.equals(password))){
            System.out.println("Wrong!");
            System.out.print("Type the password: ");
            attempt = reader.nextLine();
        }
        
        System.out.println("Right!");
        System.out.println("The secret is: jryy qbar!");
        
    }
}
