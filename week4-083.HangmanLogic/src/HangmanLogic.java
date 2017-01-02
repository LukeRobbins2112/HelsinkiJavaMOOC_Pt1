
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // if the letter has already been guessed, nothing happens
        // it the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters
        String stringconverter = "";
        int i = 0;
        while (i < this.guessedLetters.length()){
            stringconverter = "" + this.guessedLetters.charAt(i);
            if (letter.equals(stringconverter)){
                return;
            }
            i++;
        }
       
        
        int j = 0;
        
         while (j < this.word.length()){
             stringconverter = "" + (this.word.charAt(j));
             if (letter.equals(stringconverter)){
               this.guessedLetters += letter;  
               return;  
             }

             j++;
         }
        
        this.numberOfFaults++;
        this.guessedLetters += letter;

         
    }

    public String hiddenWord() {
        
        String hiddenWord = "";
        String aString = "";
        
        int i = 0;
        
        while (i < this.word.length()){
            
            aString = "" + (this.word.charAt(i));
            if (this.guessedLetters.contains(aString)){
                hiddenWord+=aString;
            }
            else{
                hiddenWord+="_";
            }
            
            
            
            i++;
            }
            
            
            return hiddenWord;
        }


        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 

        // return the hidden word at the end
        
    }

