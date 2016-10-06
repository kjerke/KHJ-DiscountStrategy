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
public class PercOfDiscount implements DiscountStrategy {
        private double discountRate;

        
        
        public PercOfDiscount(double discountRate) {
            setDiscountRate(discountRate);
        }
        
        @Override
    public final double getDiscountAmt(double qty, double unitCost){
        return unitCost * qty * discountRate;
    }
    
    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
