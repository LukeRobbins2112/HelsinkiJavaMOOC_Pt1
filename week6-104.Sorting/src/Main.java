import java.util.Arrays;

public class Main {  

    public static void main(String[] args) {

    int[] values = {5,4,3,2,1,0};
    sort(values);
    for (int value : values){
        System.out.println(value);
    }
        
    }
    
    public static int smallest(int[] array) {
        
        int smallestValue = array[0];
        
        for (int i = 1; i < array.length; i++){
            if (array[i] < smallestValue){
                smallestValue = array[i];
            }
        }
        
        return smallestValue;
    }
    
    public static int indexOfTheSmallest(int[] array) {
            
        int smallestIndex = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] < array[smallestIndex]){
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallestIndex = index;
        
        for (int i = index; i < array.length; i++) {
            
        if (array[i] < array[smallestIndex]) {
            smallestIndex = i;
        }
        
        }
        return smallestIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        
        int temp = array[index1];
        
        array[index1] = array[index2];
        array[index2] = temp;
        
    }
    
    public static void sort(int[] array) {
        
        int smallestFrom;
        
        for (int i = 0; i < array.length - 1; i++){
            
             smallestFrom = indexOfTheSmallestStartingFrom(array, i);
             
            swap(array, i, smallestFrom);
        
            
        
    }
        
    }
}
