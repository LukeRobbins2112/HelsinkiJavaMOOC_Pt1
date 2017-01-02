import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        

        int sum = 0;
        int i = 1;
        int even = 0;
        int odd = 0;

        
        System.out.println("Type numbers: ");
        while (true){
            int num = Integer.parseInt(reader.nextLine());
            
            if (num == -1)
            {
                break;
            }
                       
            sum += num;
            i++;
                
            if (num % 2 == 0){
                    even++;
                }
                else if (num % 2 == 1){
                    odd++;
                }
                
            }
            
        
        double avg = (double)sum/i;
        
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + i);
        System.out.println("The average is " + avg);
        System.out.println("The number of even numbers is: " + even);
        System.out.println("The number of odd numbers is: " + odd);
        System.out.println("Thank you and see you later!");

    }
}
