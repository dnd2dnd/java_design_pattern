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
public class Payment { // Payment 추상 클래스
    private PaymentStrategy paymentStrategy;
    public void pay() {
        paymentStrategy.pay();
    }
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
