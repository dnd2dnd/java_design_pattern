package DPP_Order;

public class AddRice extends FoodDecorator{

    Food food;
    
    public AddRice(Food food) {
        super();
        this.food=food;
    }

    @Override
    public String getFoodName() {
        return food.getFoodName()+"+ 밥추가 ";
    }

    @Override
    public int cost() {
        return food.cost()+1000;
    }
    
}
