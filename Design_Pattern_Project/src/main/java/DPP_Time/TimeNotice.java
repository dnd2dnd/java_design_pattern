package DPP_Time;


public class TimeNotice implements Observer {
    private int Chour=0;
    private int Cminutes=0;
    private int Csecond=0;
    private int Lhour;
    private int Lminutes;
    private int Lsecond;    
    private TimeData timeData;

    public TimeNotice(TimeData timeData) {
        this.timeData = timeData;
        timeData.registerObserver(this);
    }

    public void update(int hour, int minutes, int second) {
        Lhour=Chour;
        Lminutes=Cminutes;
        Lsecond=Csecond;
        Chour=hour;
        Cminutes=minutes;
        Csecond=second;
        
        display();
    }

    public String display() {
        if(Chour<=0&&Cminutes<=0&&Csecond<=0){
            return ("충전해주세요~");
        }else if(Chour==0&&Cminutes<=2){
            return ("3분 남았습니다.");
        }else if(Chour==0&&Cminutes<=4){
            return ("5분 남았습니다.");
        }
        return "";
    }
}