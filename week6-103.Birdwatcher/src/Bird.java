
public class Bird {
    
    private String name;
    private String latinName;
    private int timesObserved;
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.timesObserved = 0;
    }
    
    public Bird(){
        this.name = "";
        this.latinName = "";
        this.timesObserved = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getLatinName(){
        return this.latinName;
    }
    
    public String toString(){
        return this.name + " (" + this.latinName + ")"; 
    }
    
    public void setName(String birdName){
        this.name = birdName;
    }
    
    public void setLatinName(String birdLatinName){
        this.latinName = birdLatinName;
    }
    
    public int timesObserved(){
        return this.timesObserved;
    }
    
    public void Observation(){
        this.timesObserved++;
    }
    
        
        
    
    
}
