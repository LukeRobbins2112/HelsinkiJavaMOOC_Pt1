public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount){
            System.out.print("*");
            i++;
        }
        System.out.println("");
        
    }

    public static void printWhitespaces(int amount) {
        int i = 0;
        while (i < amount){
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 1;
        while (i <= size){
        printWhitespaces(size - i);  
        printStars(i);
        i++;
        }
    }

    public static void xmasTree(int height) {
        int i = 1;
        int j = 1;
        while (i <=(height * 2)){
        printWhitespaces(height - j);
        printStars(i);
        i+=2;
        j++;
        }
        printWhitespaces(i/2 - 2);
        printStars(3);
        printWhitespaces(i/2 - 2);
        printStars(3);
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
