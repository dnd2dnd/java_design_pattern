package DPP_Time;

import java.util.ArrayList;

public class TimeData implements Subject {
    private ArrayList observers;
    private int hour;
    private int minutes;
    private int second;
            
    public TimeData() {
        observers = new ArrayList<Observer>();
    }
	
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }
	
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(hour, minutes, second);
	}	
    }

    public void measurementsChanged() {
        notifyObservers();
    }
	
    public void setMeasurements(int hour, int minutes, int second) {
        this.hour = hour;
	this.minutes = minutes;
        this.second = second;
	measurementsChanged();
    }
    public void setHourM(int hour,int minutes){
        this.hour=hour;
        this.minutes=minutes;
        measurementsChanged();        
    }
    public void setMinSe(int minutes,int second){
        this.minutes=minutes;
        this.second=second;
        measurementsChanged();        
    }
    public void setHour(int hour) {
        this.hour += hour;
        measurementsChanged();
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
        measurementsChanged();
    }

    public void setSecond(int second) {
        this.second = second;
        measurementsChanged();
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSecond() {
        return second;
    }
    
}