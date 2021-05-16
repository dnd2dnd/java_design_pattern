package DPP_Order;

public class AddCheese extends FoodDecorator{

    public AddCheese(Food food) {
        super();
        this.food = food;
    }
    
    @Override
    public String getFoodName() {
        return food.getFoodName()+"+ 치즈추가 ";
    }

    @Override
    public int cost() {
        return food.cost()+600;
    }
    
}
