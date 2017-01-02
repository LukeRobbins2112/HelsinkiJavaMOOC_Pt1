
public class Main {

    public static void main(String[] args) {
        MyDate date = new MyDate(29, 12, 2015);
        
        System.out.println(date);
        
        date.advance();
        date.advance();
        
        System.out.println(date);
        
        date.advance(3);
        
        System.out.println(date);
        
        MyDate newDate = date.afterNumberOfDays(4);
        
        System.out.println(date);
        System.out.println(newDate);
        
        
    }
}
