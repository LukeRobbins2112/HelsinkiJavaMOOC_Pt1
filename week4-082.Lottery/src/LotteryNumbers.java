import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    Random random = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        int num;
        
        int i = 1;
        while (i < 8){
            num = random.nextInt(39) + 1;
            
            if (!containsNumber(num)){
                this.numbers.add(num);  
                i++;
            }

        }
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}
