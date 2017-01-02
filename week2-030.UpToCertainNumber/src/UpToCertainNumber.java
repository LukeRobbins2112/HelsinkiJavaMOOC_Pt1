
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int count = 1;
        
        System.out.print("Up to what number? ");
        int limit = Integer.parseInt(reader.nextLine());
        
        while (count <= limit){
            System.out.println(count);
            count++;
        }
        
    }
}
