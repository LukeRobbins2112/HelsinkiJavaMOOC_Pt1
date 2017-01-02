
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String userAnswer1 = "alex";
        String passAnswer1 = "mightyducks";
        
        String userAnswer2 = "emily";
        String passAnswer2 = "cat";
        
        System.out.print("Type your username: ");
        String userName = reader.nextLine();
        System.out.print("Type your password: ");
        String passWord = reader.nextLine();
        
        if (userName.equals(userAnswer1) && passWord.equals(passAnswer1)){
            System.out.println("You are now logged into the system!");
        }
        else if (userName.equals(userAnswer2) && passWord.equals(passAnswer2)){
            System.out.println("You are now logged into the system!");
        }
        else{
            System.out.println("Your username or password was invalid!");
        }

    }
}
