
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the points [0-60]: ");
        int score = reader.nextInt();
        
        if(score < 0){
            System.out.println("Please enter a valid score.");
        }
        else if (score < 30){
            System.out.println("Grade: failed.");
        }
        else if (score < 35){
            System.out.println("Grade: 1");
        }
        else if (score < 40){
            System.out.println("Grade: 2");
        }
        else if (score < 45){
            System.out.println("Grade: 3");
        }
        else if (score < 50){
            System.out.println("Grade: 4");
        }
        else if (score < 61){
            System.out.println("Grade: 5");
        }
        else{
            System.out.println("Please enter a valid score.");
        }

    }
}
