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

    public boolean setTime(int hour, int min, int sec){
        boolean isHourValid = setHour(hour);
        boolean isMinuteValid = setMin(min);
        boolean isSecondValid = setSec(sec);
        return isHourValid && isMinuteValid && isSecondValid;
    }

    public boolean setHour(int hour){
        if(hour >= 0 && hour < 24){
            this.hour = hour;
            return true;
        }
        else{
            this.hour = 0;
            return false;
        }
    }

    public boolean setMin(int min){
        if (min >= 0 && min < 60) {
            this.min = min;
            return true;
        }
        else{
            this.min = 0;
            return false;
        }
    }

    public boolean setSec(int sec){
        if (sec >= 0 && sec < 60) {
            this.sec = sec;
            return true;
        }
        else{
            this.sec = 0;
            return false;
        }
        
    }

    public int getHour(){
        return this.hour;
    }

    public int getMin(){
        return this.min;
    }

    public int getSec(){
        return this.sec;
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
        return String.format("%02d:%02d:%02d", getHour(),getMin(),getSec());
    }

    public String toString(){
        return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12)? 12 : getHour() % 12),getMin(),getSec(),(getHour() < 12 ? "AM":"PM"));
    }
}
