
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        System.out.print("Type a word: ");
        String nextWord = reader.nextLine();
        
        while (!words.contains(nextWord)){
            words.add(nextWord);
            System.out.print("Type a word: ");
            nextWord = reader.nextLine();
        }
        
        System.out.println("You gave the word " + nextWord + " twice.");
        
    }
}
