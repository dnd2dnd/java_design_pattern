/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DPP_Order;

public class AddMilk extends DrinkDecorator{

     Drink drink;
    
    public AddMilk(Drink drink) {
        super();
        this.drink = drink;
    }

    @Override
    public String getDrinkName() {
        return drink.getDrinkName()+"+ 우유 추가 ";
    }

    @Override
    public int cost() {
        return drink.cost()+400;
    }
    
}