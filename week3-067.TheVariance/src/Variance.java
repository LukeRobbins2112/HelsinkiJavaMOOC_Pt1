import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        
        int sum = 0;
        
        for (int num : list){
            sum+=num;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        
        double avg = (double)sum(list) / list.size();
        
        return avg;
    }

    public static double variance(ArrayList<Integer> list) {
        double helper = 0.0;
        double avg = average(list);
        
        for (double number : list){
            helper+=Math.pow((number - avg), 2);
        } 
        return helper/(list.size() - 1);

    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
