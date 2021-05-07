/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DPP_Order;

public class Americano extends Drink{

    public Americano() {
        super();
        Drinkname="아메리카노 ";
    }

    @Override
    public int cost() {
        return 2000;
    }
    
}