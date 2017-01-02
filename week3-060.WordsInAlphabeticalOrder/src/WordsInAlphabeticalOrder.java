
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        System.out.print("Type a word: ");
        String nextWord = reader.nextLine();
        
        while (!nextWord.equals("")){
            words.add(nextWord);
            System.out.print("Type a word: ");
            nextWord = reader.nextLine();
        }
        
        Collections.sort(words);
        System.out.println("You typed the following words: ");
        
        for (String word : words){
            System.out.println(word);
        }
    }
}
