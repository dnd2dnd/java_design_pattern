package DPP_Order;

public class FriedRice extends Food {
    
    public FriedRice(){
        super();
        Foodname="볶음밥";
    }
    
    @Override
    public int cost(){
        return 3500;
    }
}
