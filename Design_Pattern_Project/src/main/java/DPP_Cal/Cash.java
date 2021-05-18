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
public class Cash extends Payment { // Cash 클래스
    public Cash(String orderName) {
        super(orderName);
    } 
    public Cash(int price) {
        super(price);
    }
}
