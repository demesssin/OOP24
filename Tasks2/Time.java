package Tasks2;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second){
        if (hour >= 0 && hour < 24){
            this.hour = hour;
        } else{
            this.hour = 0;
        }
        if (minute >= 0 && minute < 60){
            this.minute = minute;
        } else{
            this.minute = 0;
        }
        if (second >= 0 && second < 60){
            this.second = second;
        } else{
            this.second = 0;
        }
    }
    public Time(int hour, int minute, int second){
        setTime(hour, minute, second);
    }
    public void toUniversal(){
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }
    public void toStandard(){
        int hour12 = hour%12;
        if (hour12 == 0){
            hour12 = 12;
        }
        String period = (hour >= 12) ? "PM" : "AM";
        System.out.printf("%02d:%02d:%02d", hour12, minute, second, period);
    }
}
