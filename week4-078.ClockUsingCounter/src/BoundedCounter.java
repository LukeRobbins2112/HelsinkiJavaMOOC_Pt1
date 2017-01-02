
/**
 *
 * @author LukeRobbins2112
 */
public class BoundedCounter {
    
    private int counterValue;
    private int upper;
    
    public BoundedCounter(int upperBound){
        this.counterValue = 0;
        this.upper = upperBound;
        
    }
    
    public void next(){
        this.counterValue++;
        if (this.counterValue > this.upper){
            this.counterValue=0;
        }
    }
    
    public String toString(){
        
        if (this.counterValue < 10){
            return "0" + this.counterValue;
        }
        else{
            return "" + this.counterValue;
        }
    }
    
    public int getValue(){
        return this.counterValue;
    }
    
    public void setValue(int timeDesired){
        if (timeDesired > this.upper || timeDesired < 0){
            return;
        }

        this.counterValue = timeDesired;
        
    }
    
}
