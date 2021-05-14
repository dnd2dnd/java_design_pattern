package DPP_Time;

public class TimeSave implements TimeObserver {
    private static TimeSave timesave = null;
    
    private int TimeHour=0;
    private int TimeMin=5;
    private int TimeSec=30;
    private TimeSave() {}
    public int getTimeHour() {
        return TimeHour;
    }

    public void setTimeHour(int Timehour) {
        this.TimeHour += Timehour;
    }

    public int getTimeMin() {
        return TimeMin;
    }

    public void setTimeMin(int TimeMin) {
        this.TimeMin = TimeMin;
    }

    public int getTimeSec() {
        return TimeSec;
    }

    public void setTimeSec(int TimeSec) {
        this.TimeSec = TimeSec;
    }
    public static TimeSave getInstance(){
        if(timesave==null){
            timesave = new TimeSave();
        }
        return timesave;
    }

    @Override
    public int update() {
        if(TimeHour==0&&TimeMin==5&&TimeSec==0){
            return 5;
        }
        else {
            return 0;
        }
    }
}
