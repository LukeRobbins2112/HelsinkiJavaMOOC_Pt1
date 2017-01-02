import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<Integer>(); 
        System.out.println("Type exam scores, -1 completes: ");
        int gradeNumber = Integer.parseInt(reader.nextLine());
        
        while (gradeNumber != -1){
            scores.add(numberToScore(gradeNumber));
            gradeNumber = Integer.parseInt(reader.nextLine());
        }
        
        for (int i = 0; i < scores.size(); i++){
            if (scores.get(i) == -1){
                scores.remove(i);
            }
        }
        
        System.out.println("Grade distribution: ");
        printScores(scores);
        System.out.println("Acceptance Percentage: " + acceptancePercentage(scores));

    }
    
    public static int numberToScore(int score){
        int num;
        
        if(score < 0 || score > 60){
            System.out.println("Please enter a valid score.");
            return -1;
        }
        else if (score < 30){
            num = 0;
        }
        else if (score < 35){
            num = 1;
        }
        else if (score < 40){
            num = 2;
        }
        else if (score < 45){
            num = 3;
        }
        else if (score < 50){
            num = 4;
        }
        else {
            num = 5;
        }
        
        return num;
    }
    
    public static void printScores(ArrayList<Integer> gradeScores){
        for(int i = 5; i >=0; i--) {
            System.out.print(i + ": ");

                for(int score : gradeScores) {
                    
                    if (score == i){
                        System.out.print("*");
                    }
                    
                }

                    System.out.println();
            }
    }
    
    public static double acceptancePercentage(ArrayList<Integer> gradeBook){
        
        int passes = 0;
        
        for (int score : gradeBook){
            
            if (score > 0){
                passes++;
            }
            
        }
        
        if (passes == 0){
            return 0;
        }
        
        return (100*passes) / gradeBook.size();
        
    }
    

}
