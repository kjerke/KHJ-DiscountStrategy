/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khj.discountstrategy;

/**
 *
 * @author kevinjerke
 */
public class FlatAmtDiscount implements DiscountStrategy {
    private double discountRate;

    public FlatAmtDiscount(double Rate) {
         setDiscountRate(discountRate);
    }
    
    
    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
    public final double getDiscountAmt(int qty, double unitCost){
        return discountRate;
    }
     
    
}
