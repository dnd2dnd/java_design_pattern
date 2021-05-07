/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DPP_Order;

public class CafeLatte extends Drink{

    public CafeLatte() {
        super();
        Drinkname="카페라떼 ";
    }

    @Override
    public int cost() {
        return 2800;
    }
    
}
