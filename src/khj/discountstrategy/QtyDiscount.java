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
public class QtyDiscount implements DiscountStrategy{
    private double discountRate;
    private final int noDiscount = 0;

    
    
    
    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
