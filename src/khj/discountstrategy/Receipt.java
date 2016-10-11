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
public class Receipt {
   private static int receiptNo;
   private String storeName;
   private ArrayDatabase ad;
   private Customer customer;
   private LineItem[] lineItems;
   
   
   public Receipt(String storeName, String custId, ArrayDatabase ad) {
       setStoreName(storeName);
       receiptNo++;
       setAd(ad);
       setCustomer(ad.findCustomerById(custId));
       lineItems = new LineItem[0];
       
   }
   
   public final void addItemToReceipt(String prodId, int qty) {
       LineItem item = new LineItem(prodId, qty, ad);
       addItemToArray(lineItems, item);
   }
   
   public final void addItemToArray(LineItem[] origArray, LineItem item) {
       LineItem[] tempArray = new LineItem[origArray.length + 1];
       System.arraycopy(origArray, 0, tempArray, 0, origArray.length);
       tempArray[tempArray.length - 1] = item;
       origArray = tempArray;
       lineItems = origArray;
   }
   public final void removeItemFromArray(String prodId, int qty) {
       for(int i=0; i < lineItems.length; i++) {
           if(lineItems[i].getProduct().getProductId().equals(prodId)) {
               lineItems[i] = null;
               break;
           }
       }
       shrinkArray(lineItems);
   }
   
   
   private void shrinkArray(LineItem[] origArray) {
       LineItem[] tempArray = new LineItem[lineItems.length-1];
       
       for(int i=0, j=0; i < origArray.length; i++) {
           if(origArray[i] != null) {
               tempArray[j++] = origArray[i];
           }
       }
       lineItems = tempArray;
   }

    public static int getReceiptNo() {
        return receiptNo;
    }

    public static void setReceiptNo(int receiptNo) {
        Receipt.receiptNo = receiptNo;
    }

    public final String getStoreName() {
        return storeName;
    }

    public final void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public final ArrayDatabase getAd() {
        return ad;
    }

    public final void setAd(ArrayDatabase ad) {
        this.ad = ad;
    }

    public final Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public final LineItem[] getLineItems() {
        return lineItems;
    }

    public final void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }
   
   
   
}
