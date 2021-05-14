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
public abstract class Payment { // Payment 추상 클래스
    private String orderName; // 주문 내용
    private int price; // 상품 가격
    private PaymentStrategy paymentStrategy; // 결제 전략
    
    public Payment(String orderName) {
        this.orderName = orderName;
    }
    
    public Payment(int price) {
        this.price = price;
    }
    
    public void display(String orderName , int price) {
        PaymentJFrame.orderString = orderName;
        PaymentJFrame.priceNum = price;
    }
    
    public void orderhistory(String orderName, int price) {
        paymentStrategy.orderhistory(orderName, price);
    }
    
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
