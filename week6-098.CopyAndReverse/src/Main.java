

public class Main {
    
    public static int[] copy(int[] array){
        int[] newArray = new int[array.length];
        
        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        
        return newArray;
    }
    
    public static int[] reverseCopy(int[] array){
        int[] reversedArray = new int[array.length];
        
        int j = 0;
        
        for(int i = array.length - 1; i >= 0; i--){
            reversedArray[j] = array[i];
            j++;
        }
        
        return reversedArray;
    }

    public static void main(String[] args) {
    int[] original = {1, 2, 3, 4};
    int[] copied = copy(original);
    int[] reversed = reverseCopy(original);
    
    copied[0] = 99;
    
        System.out.println(original[0]);
        System.out.println(copied[0]);
        
        for (int i : original){
            System.out.println(i);
        }
        
        for (int i : reversed){
            System.out.println(i);
        }
        
        

    }
    
}
