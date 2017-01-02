public class DecreasingCounter {
    private int value;  // instance variable that remembers the value of the counter
    private int returnValue;
    
    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.returnValue = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        
        if (this.value>0){
            this.value--;            
        }

    }

    public void reset(){
        this.value -= this.value;
    }
    
    public void setInitial(){
        this.value = this.returnValue;
    }
}
