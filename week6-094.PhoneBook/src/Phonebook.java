import java.util.ArrayList;

public class Phonebook {
    
    private ArrayList<Person> person;
    
    public Phonebook(){
        
        this.person = new ArrayList<Person>();
        
    }
    
    public void add(String name, String number){
        
        Person p = new Person(name, number);
        
        person.add(p);
    }
    
    public void printAll(){
        
        for (Person per : person){
            System.out.println(per);
        }
        
    }
    
    public String searchNumber(String name){
        
        for (Person per : person){
            
            if (per.getName().equals((name))){         
                return per.getNumber();
        }
        }
        
        return"number not known";
    }
    
}
