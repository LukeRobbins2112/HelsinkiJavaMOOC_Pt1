
public class Accounts {

    public static void main(String[] args) {
        Account a = new Account("Account a", 100.0);
        Account b = new Account("Account b", 0.0);
        Account c = new Account("Account c", 0.0);
        
        transfer(a,b,50);
        transfer(b,c,25);
        
    }
    
    public static void transfer (Account to, Account from, double howMuch){
        to.withdrawal(howMuch);
        from.deposit(howMuch);
    }


}
