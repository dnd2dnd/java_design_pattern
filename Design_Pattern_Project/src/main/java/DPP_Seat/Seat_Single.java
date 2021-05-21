package DPP_Seat;

public class Seat_Single {
    private static Seat_Single seat_single = null;
    
    private int power = 0; // 전원
    private int num = 0;      //좌석 번호
    private Seat_Single(){}

    public int getPower() {
        return power;
    }
    
    public void setPower(int power) {
        this.power = power;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public static Seat_Single getInstance(){
        if(seat_single == null){
            seat_single = new Seat_Single();
        }
        return seat_single;
    }
}
