public class Main {
    public static void main(String[] args) {
        Counter startAndCheck = new Counter(3, true);
        Counter start = new Counter(4);
        Counter check = new Counter(true);
        Counter neither = new Counter();
        
        
        System.out.println("start and check " + startAndCheck.value());
        System.out.println("start " + start.value());
        System.out.println("check " +check.value());
        System.out.println("neither " +neither.value());
        System.out.println("---------");
        
        startAndCheck.increase();
        start.increase();
        check.increase();
        neither.increase();
        
        System.out.println("start and check " + startAndCheck.value());
        System.out.println("start " + start.value());
        System.out.println("check " +check.value());
        System.out.println("neither " +neither.value());
        System.out.println("---------");
        
        startAndCheck.decrease();
        start.decrease();
        check.decrease();
        neither.decrease();
        
        System.out.println("start and check " + startAndCheck.value());
        System.out.println("start " + start.value());
        System.out.println("check " +check.value());
        System.out.println("neither " +neither.value());
        
    }
}
