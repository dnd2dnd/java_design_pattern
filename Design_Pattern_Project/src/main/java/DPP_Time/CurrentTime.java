package DPP_Time;

public class CurrentTime implements Observer {
    private int hour;
    private int minutes;
    private int second;
    private TimeData timeData;
            
    public CurrentTime(TimeData timeData) {
        this.timeData = timeData;
        timeData.registerObserver(this);
    }
	
    public void update(int hour, int minutes, int second) {
        this.hour=hour;
        this.minutes=minutes;
        this.second=second;
        display();
    }
	
    public String display() {
        return (hour+"시간 "+minutes+"분 "+second+ "초");
    }
    
}