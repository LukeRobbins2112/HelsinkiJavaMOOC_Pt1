
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account myAccount = new Account("Luke's account", 100.00);
        
        myAccount.deposit(20);
        System.out.println(myAccount);
        
        
    }

}
