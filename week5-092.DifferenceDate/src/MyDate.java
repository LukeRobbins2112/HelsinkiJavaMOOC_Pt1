public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public int differenceInYears(MyDate comparedDate){
        
        int yearDifference;
        
        if (comparedDate.earlier(this)){

            yearDifference = this.year - comparedDate.year;
        
        
        if (this.month < comparedDate.month){
            return yearDifference - 1;
        }
        
        if (this.month == comparedDate.month){
            if (this.day < comparedDate.day){
                return yearDifference - 1;
            }
        }
        
        return yearDifference;
        
        }
        
        else{
            
            yearDifference = comparedDate.year - this.year;
        
        
        if (comparedDate.month < this.month){
            return yearDifference - 1;
        }
        
        if (comparedDate.month == this.month){
            if (comparedDate.day < this.day){
                return yearDifference - 1;
            }
        }
        
        return yearDifference;
        
        }
            
            
        }
    }


