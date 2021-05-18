/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DPP_Memeto;
/**
 *
 * @author USER
 */
public class User {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Information info;
        CareTaker caretaker;
    
        
        info = new Information("Data1", 10); // Information 객체 생성
        caretaker = new CareTaker(); // CareTaker 객체 생성
        // 현재 Information의 상태 정보를 가지는 Memento를 생성하여 CareTaker에 추가
        caretaker.push(info.CreateMemento());
        
        // Information 정보 수정
        info.set_Data1("Data2");
        info.set_Data2(20);
        
        // 현재 Information의 상태정보를 출력
        System.out.println("현재 Data1 :" + info.get_Data1());
        System.out.println("현재 Data2 :" + info.get_Data2());
        
        // 가장 최근에 생성 된 Memento를 가지고 와서 상태 정보를 복원
        info.RestroMemento(caretaker.pop()); 
        
        // 상태 정보를 복원 한 후에 Information 상태 정보를 출력
        System.out.println("복구된 Data1 :" + info.get_Data1());
        System.out.println("복구된 Data2 :" + info.get_Data2()); 
    }  
}
