import java.util.Scanner;
import java.util.ArrayList;
        
public class Main {  

    public static void main(String[] args) {
        
        ArrayList<Bird> birds = new ArrayList<Bird>();
        Scanner reader = new Scanner(System.in);
        String input = "";
        String name = "";
        String latinName = "";
        String observedName = "";
        String showName = "";
        boolean isBird;

        System.out.println("?");
        
        while(true){
            input = reader.nextLine();
            
            if (input.equals("Quit")){
                break;
            }
            
            if (input.equals("Add")){
                System.out.println("Name: ");
                name = reader.nextLine();
                System.out.println("Latin name: ");
                latinName = reader.nextLine();
                birds.add(new Bird(name, latinName));
            }
            
            if (input.equals("Observation")){
                System.out.println("What was observed:?");
                observedName = reader.nextLine();
                isBird = false;

                for (Bird birdie : birds){
                    if (observedName.equals(birdie.getName())){
                        birdie.Observation();
                        isBird = true;
                    }
                }
                
                if (!isBird){
                    System.out.println("Is not a bird!");
                }
            }
            
            if (input.equals("Statistics")){
                for (int i = 0; i < birds.size(); i++){
                    System.out.println(birds.get(i).toString() + ": " + birds.get(i).timesObserved() + " observations");
                }
            }
            
            if (input.equals("Show")){
                System.out.println("What?");
                showName = reader.nextLine();
                
                for (Bird birdie : birds){
                    if (showName.equals(birdie.getName())){
                        System.out.println(birdie.toString() + ": " + birdie.timesObserved() + " observations");
                }
                
                }
            
            }
        
    }
        
    }   
     
}

