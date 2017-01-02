
public class Main {

    public static void main(String[] args) {
        MyDate date = new MyDate(10, 3, 2011);
        MyDate compareDate = new MyDate(9, 3, 2012);
        
        System.out.println(date.differenceInYears(compareDate));
        
        MyDate date2 = new MyDate(2, 4, 2016);
        MyDate compareDate2 = new MyDate(2, 4, 2003);
        
        System.out.println(compareDate2.differenceInYears(date2));
    }
}
