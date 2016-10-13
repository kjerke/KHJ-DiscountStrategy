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
public class VerboseReceiptFormat implements ReceiptFormat {
    
    public final String format(Receipt receipt){
        
    
    
    double totalBeforeDiscount = 0;
    double totalAfterDiscount = 0;
    double totalDiscount = 0;
    
    
    StringBuilder sb = new StringBuilder();
    
    
    sb.append(ReceiptFormat.RECEIPT_NUM)
            .append(Receipt.getReceiptNo());
    
    sb.append("\n\n").append(ReceiptFormat.THANK_YOU)
        .append(receipt.getCustomer().getCustomerName());
    
    sb.append("\n").append(ReceiptFormat.FOR_SHOPPING_AT)
            .append(receipt.getStoreName()).append("\n");
    
    
    
    sb.append("\n\n").append(ReceiptFormat.ITEM_ID).append("\t")
            .append(ReceiptFormat.ITEM_NAME).append("\t\t\t")
            .append(ReceiptFormat.UNIT_COST).append("\t")
            .append(ReceiptFormat.QTY).append("\t")
            .append(ReceiptFormat.EXT_PRICE).append("\t")
            .append(ReceiptFormat.DISCOUNT_AMT);
    sb.append("\n---\t----\t\t\t----------\t---\t------------\t---------");
    
    LineItem[] items = receipt.getLineItems();
    for (LineItem item : items) {
        totalBeforeDiscount += item.getExtPrice();
        totalAfterDiscount += (item.getExtPrice() - item.getDiscountTotal());
        totalDiscount += item.getDiscountTotal();
    
    
   sb.append(String.format("\n%-8s",item.getProduct().getProductId()));
   sb.append(String.format("%-25s",item.getProduct().getProductName()));
   sb.append(String.format("%8.2f",item.getProduct().getUnitCost()));
   sb.append(String.format("%10d", item.getQty()));
   sb.append(String.format("%15.2f",item.getExtPrice()));
   sb.append(String.format("%8.2f",item.getDiscountTotal()));
   
    }
    
    sb.append("\n\n\t\t\t\t\t\t").append(ReceiptFormat.GRAND_TOTALS)
            .append("\n");
    
    sb.append("\n\n\t\t\t\t\t\t").append(ReceiptFormat.TOTAL_BEFORE_DISCOUNT)
            .append(String.format("%9.2f,",totalBeforeDiscount));
    
    sb.append("\n\n\t\t\t\t\t\t").append(ReceiptFormat.TOTAL_AFTER_DISCOUNT)
            .append(String.format("%10.2f,",totalBeforeDiscount));
    
    sb.append("\n\n\t\t\t\t\t\t").append(ReceiptFormat.AMOUNT_SAVED)
            .append(String.format("%14.2f,",totalBeforeDiscount));
    
        return sb.toString();
    }
}

