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
public interface DiscountStrategy {
    public abstract double getDiscountAmt(double qty, double unitCost);
}
