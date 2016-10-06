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
public class LineItem {
    private Product product;
    private double qty;
    
    
    public LineItem(String productId, double qty, ArrayDatabase pd){
        setQty(qty);
        setProduct(pd.findProductById(productId));
    }
    
    public final double getExtPrice() {
        return qty = (int) product.getUnitCost();
    }
    
    public final double getDiscountTotal() {
        return product.getDiscount().getDiscountAmt(qty, product.getUnitCost());
    }

    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        this.product = product;
    }

    public final double getQty() {
        return qty;
    }

    public final void setQty(double qty) {
        this.qty = qty;
    }
}
