package DPP_Order;

public class AddEgg extends FoodDecorator{

    Food food;
    
    public AddEgg(Food food) {
        super();
        this.food = food;
    }

    @Override
    public String getFoodName() {
        return food.getFoodName()+"+ 계란추가 ";
    }

    @Override
    public int cost() {
        return food.cost()+500;
    }
    
}
