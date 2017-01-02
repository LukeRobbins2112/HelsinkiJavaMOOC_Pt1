
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister = 1000.0;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        double econPrice = 2.50;
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        if (cashGiven >= econPrice){
            this.cashInRegister+=econPrice;
            this.economicalSold++;
            return cashGiven - econPrice;
        }
        else{
            return cashGiven;
        }
        // if not enough money given, all is returned and nothing else happens        
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        double gourmetPrice = 4.00;
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        if (cashGiven >= gourmetPrice){
            this.cashInRegister+=gourmetPrice;
            this.gourmetSold++;
            return cashGiven - gourmetPrice;
        }
        else{
            return cashGiven;
        }

    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
    
    public boolean payEconomical (LyyraCard card){
        double econPrice = 2.50;
        
        if (card.balance() >= econPrice){
            card.pay(econPrice);
            this.economicalSold++;
            return true;
        }
        
        return false;
    }
    
    public boolean payGourmet(LyyraCard card){
        double gourmetPrice = 4.00;
        
        if (card.balance() >= gourmetPrice){
            card.pay(gourmetPrice);
            this.gourmetSold++;
            return true;
        }
        
        return false;
    }
    
    public void loadMoneyToCard (LyyraCard card, double sum){
        
        if (sum >= 0){
        card.loadMoney(sum);
        this.cashInRegister+=sum;
        }
        
    }
}