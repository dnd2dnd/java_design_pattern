package DPP_Order;

public abstract class Food {
    
    String Foodname = "";
    
    public abstract int cost();
    
    public String getFoodName(){
        return Foodname;
    }
}
