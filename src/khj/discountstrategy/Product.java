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
public class Product {
    private String productId; 
    private String productName;
    private double unitCost;
    private DiscountStrategy discount;
    
    
    
    public Product(String productId, String productName, double unitCost) {
        setProductId(productId);
        setProductName(productName);
        setUnitCost(unitCost);
    }

    public final String getProductId() {
        return productId;
    }

    public final void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public final void setProductName(String productName) {
        this.productName = productName;
    }

    public final double getUnitCost() {
        return unitCost;
    }

    public final void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public final DiscountStrategy getDiscount() {
        return discount;
    }

    public final void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
    
    public final double getDiscountAmount(int qty){
        return discount.getDiscountAmt(qty, unitCost);
    }
    
}
