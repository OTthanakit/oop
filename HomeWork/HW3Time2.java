package HomeWork;

import java.sql.Time;

import lab8.Time2;

public class HW3Time2 {
    private int hour; //0-23
    private int min; //0-59
    private int sec; // 0-59

    public HW3Time2(){
        this(0 , 0 , 0);
    }

    public HW3Time2(int hour){
        this(hour,0,0);        
    }

    public HW3Time2(int hour, int min){
        this(hour,min,0);
    }

    public HW3Time2(int hour,int min,int sec){
        setTime(hour,min,sec);
    }

    public HW3Time2(Time2 time){
        this(time.getHour(), time.getMin(), time.getSec());
    }

    public void setTime(int hour, int min, int sec){
        setHour(hour);
        setMin(min);
        setSec(sec);
        if (hour < 0 && hour >= 23 ) {
            throw new IllegalArgumentException("Invaid hour: must be 0-24");
        }
        if (min < 0 && min >= 59) {
            throw new IllegalArgumentException("Invaid min: must be 0-59");
        }
        if (sec < 0 && sec >= 59) {
            throw new IllegalArgumentException("Invaid sec: must be 0-59");
        }
    }

    public void setHour(int hour){
        if(hour >= 0 && hour < 24){
            throw new IllegalArgumentException("Invaid hour: must be 0-24");
        }
        this.hour = hour;
    }

    public void setMin(int min){
        if (min >= 0 && min < 60) {
            throw new IllegalArgumentException("Invaid min: must be 0-59");
        }
        this.min = min;
    }

    public void setSec(int sec){
        if (sec >= 0 && sec < 60) {
            throw new IllegalArgumentException("Invaid sec: must be 0-59");
        }
        this.sec = sec;
    }

    public int getHour(){
        return hour;
    }

    public int getMin(){
        return min;
    }

    public int getSec(){
        return sec;
    }

    public void tick(){
        setSec(sec+1);
        if (sec == 0) {
            incrementMin();
        }
    }

    public void incrementMin(){
        setMin(min+1);
        if (min == 0) {
            incrementHour();
        }
    }

    public void incrementHour(){
        setHour(hour+1);
    }

    public String toUniversalString(){
        return String.format("%0.2d:%0.2d:%0.2d", getHour(),getMin(),getSec());
    }

    public String toString(){
        return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12)? 12 : getHour() % 12),getMin(),getSec(),(getHour() < 12 ? "AM":"PM"));
    }
}
