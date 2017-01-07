
public class Date {

    private int day;
    private int month;
    private int year;
    private Time time;

    public Date(int day, int month, int year, Time time){
        this.day = day;
        this.month = month;
        this.year = year;
        this.time = time;
    }
    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    public Time getTime(){
        return this.time;
    }
}
