public class Reformatory {

    private int measures;
    
    public int weight(Person person) {
        this.measures++;
        return person.getWeight();
    }
    
    public void feed(Person person){
        person.setWeight(weight(person) + 1);
    }
    
    public int totalWeightsMeasured(){
        return this.measures;
    }

}
