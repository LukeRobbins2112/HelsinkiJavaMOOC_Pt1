import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        NumberStatistics totalSum = new NumberStatistics();
        NumberStatistics evenSum = new NumberStatistics();
        NumberStatistics oddSum = new NumberStatistics();
        
        System.out.print("Type numbers: ");
        int num = Integer.parseInt(reader.nextLine());
        
        while (num != -1){
            
            if (num%2 == 0){
                evenSum.addNumber(num);
            }
            
            if (num%2 != 0){
                oddSum.addNumber(num);
            }
            
            totalSum.addNumber(num);
            System.out.print("Type numbers: ");
            num = Integer.parseInt(reader.nextLine());
        }
        
        System.out.println("sum: " + totalSum.sum());
        System.out.println("sum of even: " + evenSum.sum());
        System.out.println("sum of odd: " + oddSum.sum());


    }
}
