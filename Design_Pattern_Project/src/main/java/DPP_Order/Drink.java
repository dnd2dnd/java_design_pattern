/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DPP_Order;

public abstract class Drink {
    
    String Drinkname = "";
    
    public abstract int cost();
    
    public String getDrinkName(){
        return Drinkname;
    }
}
