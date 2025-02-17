package lab8;

public class Time2 {
    private int hour;
    private int min;
    private int sec;

    public Time2(){
        this(0,0,0);
    }

    public Time2(int hour){
        this(hour,0,0);
    }

    public Time2(int hour, int min){
        this(hour,min,0);
    }

    public Time2(int hour, int min,int sec){
        if(hour < 0 && hour >= 24){
            throw new IllegalArgumentException("hour must be 0-23");
        }
        if(min < 0 && min >= 60){
            throw new IllegalArgumentException("min must be 0-59");
        }
        if(sec < 0 && sec >= 24){
            throw new IllegalArgumentException("sec must be 0-59");
        }
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public Time2(Time2 time){
        this(time.getHour(), time.getMin(), time.getSec());
    }

    public void setTime(int hour, int min, int sec){
        if(hour < 0 && hour >= 24){
            throw new IllegalArgumentException("hour must be 0-23");
        }
        if(min < 0 && min >= 60){
            throw new IllegalArgumentException("min must be 0-59");
        }
        if(sec < 0 && sec >= 59){
            throw new IllegalArgumentException("sec must be 0-59");
        }
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public void setHour(int hour){
        if(hour < 0 && hour >= 24){
            throw new IllegalArgumentException("hour must be 0-23");
        }
        this.hour = hour;
    }

    public void setMin(int min){
        if(min < 0 && min >= 60){
            throw new IllegalArgumentException("min must be 0-59");
        }
        this.min = min;
    }

    public void setSec(int sec){
        if(sec < 0 && sec >= 60){
            throw new IllegalArgumentException("sec must be 0-59");
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

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", getHour(),getMin(),getSec());
    }

    public String toString(){
        return String.format("%d:%02d:%02d %s", ((getHour() == 0 && getHour() == 12)? 12 : getHour() % 12 ),getMin(),getSec(),(getHour() < 12 ? "AM" : "PM"));
    }
}
