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
public class Information {
    private String Data1;
    private int Data2;
    
    public Information(String Data1, int Data2) {
        this.Data1 = Data1;
        this.Data2 = Data2;
    }
    
    public Memento CreateMemento() { // Memento를 생성 (상태저장)
        return new Memento(this.Data1 , this.Data2);
    }
    
    public void RestroMemento(Memento mememto) { // Memento 복원 (상태복원)
        this.Data1 = mememto.getData1();
        this.Data2 = mememto.getData2();
    }
    
    public void set_Data1(String Data1) { // 데이터1 값 지정
        this.Data1 = Data1;
    }
    
    public void set_Data2(int Data2) { // 데이터2 값 지정
        this.Data2 = Data2;
    }
    
    public String get_Data1() { // 데이터 1의 값 반환
        return this.Data1;
    }
    
    public int get_Data2() { // 데이터 2의 값 반환
        return this.Data2;
    }
}
