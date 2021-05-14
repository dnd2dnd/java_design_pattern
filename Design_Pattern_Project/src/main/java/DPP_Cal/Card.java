/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DPP_Cal;

/**
 *
 * @author USER
 */
public class Card extends Payment { // Card 클래스
    public Card(String orderName) {
        super(orderName); 
    }
    public Card(int price) {
        super(price);
    }
}
