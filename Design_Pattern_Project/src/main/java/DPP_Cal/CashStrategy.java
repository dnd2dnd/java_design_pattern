/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DPP_Cal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

/**
 *
 * @author USER
 */
public class CashStrategy implements PaymentStrategy { // CashStrategy 구현체
    
    String orderName_txt = "";
    String price_txt =  "";
    String fileName = "calculration\\order_history_cash.txt"; // txt 입출력에 필요
    
    @Override
    public void orderhistory(String orderName,int price) {
        // 주문한 상품에 대해 txt 파일에 작성한다.
        orderName_txt = "주문 상품 :" + orderName + "/ ";
        price_txt = "상품 가격 :" + price + "/ ";
         
        try{
            BufferedWriter fw = new BufferedWriter(new FileWriter(fileName,true)); // false : 덮어쓰기. (주문내역에 대한 기록은 별도의 메소드가 있으므로)
            fw.write(orderName_txt);
            fw.flush();
            fw.write(price_txt);
            fw.flush();
            fw.close();
        } catch (Exception e) {
             e.getStackTrace();
        } 
    } 
}
