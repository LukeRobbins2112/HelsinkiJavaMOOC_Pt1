import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    private int currentDay;
    private int currentMonth; 
    private int currentYear;
    private MyDate currentDate;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
        this.currentDay = Calendar.getInstance().get(Calendar.DATE);
        this.currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
        this.currentDate = new MyDate(this.currentDay, this.currentMonth, this.currentYear);
        
    }
    
    public Person(String name, MyDate birthday){
        this.name = name;
        this.birthday = birthday;
        this.currentDay = Calendar.getInstance().get(Calendar.DATE);
        this.currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
        this.currentDate = new MyDate(this.currentDay, this.currentMonth, this.currentYear);
    }
    
    public Person(String name){
        this.name = name;
        this.currentDay = Calendar.getInstance().get(Calendar.DATE);
        this.currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
        this.currentDate = new MyDate(this.currentDay, this.currentMonth, this.currentYear);
        this.birthday = this.currentDate;
    }
    
    
    public int age() {
        
        
        return this.birthday.differenceInYears(this.currentDate);
    }
    
    public boolean olderThan(Person compared) {
          return this.birthday.earlier((compared.birthday));

    }
    
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
