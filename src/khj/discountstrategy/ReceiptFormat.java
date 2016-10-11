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
public interface ReceiptFormat {
    
    
    public final static String RECEIPT_NUM = "Reciept No.: ";
    public final static String THANK_YOU = "Thank You ";
    public final static String FOR_SHOPPING_AT = "For Shopping at ";
    public final static String ITEM_ID = "ID";
    public final static String ITEM_NAME = "Item";
    public final static String UNIT_COST = "Unit Cost";
    public final static String QTY = "Qty";
    public final static String EXT_PRICE = "Ext. Price";
    public final static String DISCOUNT_AMT = "Discount";
    public final static String GRAND_TOTALS = "Grand Totals:";
    public final static String TOTAL_BEFORE_DISCOUNT = "The Total Before Discount: ";
    public final static String TOTAL_AFTER_DISCOUNT = "The Total After Discount: ";
    public final static String AMOUNT_SAVED = "Total Savings Today: ";
    
    public abstract String format(Receipt receipt);
}
