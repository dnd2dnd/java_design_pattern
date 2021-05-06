package DPP_Order;

public class Ramen extends Food {
    public Ramen(){
        super();
        Foodname="라면";
    }
    @Override
    public int cost(){
        return 3000;
    }
}
