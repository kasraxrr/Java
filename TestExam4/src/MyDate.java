import java.time.LocalDate;

public class MyDate {
    private int day,month,year;
    public MyDate(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void set(int day,int month,int year) {
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public MyDate copy(){
        return new MyDate(day,month,year);
    }
    public static MyDate now(){
        LocalDate today=LocalDate.now();
        return new  MyDate(today.getDayOfMonth(), today.getMonthValue(), today.getYear() );
    }
}
