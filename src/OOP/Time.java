package OOP;

public class Time {
    int hour , minute , second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }

    public Time nextSecond()
    {
        Time time = new Time(hour,minute,second);
        if(time.second<=59) time.second+=1;
        if (time.second>=59)
        {
            time.minute +=1 ;
            time.second =0;
        }
        else if (minute>=59) {
            time.hour+=1;
            time.minute = 0;
        }
        else if (time.hour>=23) {
            time.hour = 0;
        }
        return time;
    }

    public Time previousSecond()
    {
        Time time = new Time(hour,minute,second);
        time.second-=1;
        if (time.second<=1)
        {
            time.minute -=1 ;
            time.second =59;
        }
        else if (time.minute<=1) {
            time.hour-=1;
            time.minute = 59;
        }

        return time;
    }

}
