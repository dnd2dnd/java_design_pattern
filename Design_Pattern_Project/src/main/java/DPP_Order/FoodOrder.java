/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DPP_Order;

/**
 *
 * @author MongGu
 */
public class FoodOrder {
    private String foodName;
    private String foodCodeNum;
    private String userInfo;
    private int foodFrice;
    private int totalFrice;

    public FoodOrder(String foodName, String foodCodeNum, String userInfo, int foodFrice, int totalFrice) {
        this.foodName = foodName;
        this.foodCodeNum = foodCodeNum;
        this.userInfo = userInfo;
        this.foodFrice = foodFrice;
        this.totalFrice = totalFrice;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodCodeNum() {
        return foodCodeNum;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public int getFoodFrice() {
        return foodFrice;
    }

    public int getTotalFrice() {
        return totalFrice;
    }
    
    
}
