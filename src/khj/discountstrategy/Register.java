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
public class Register {
   private Receipt receipt;
   private String storeName;
   private ReceiptFormat rf;
   private OutputFormat[] outputs;
   
   
   public Register(String storeName) {
       this.storeName = storeName;
   }
   
   public final void startNewSale(String customerId, ArrayDatabase ad, ReceiptFormat rf ) {
       receipt = new Receipt(storeName, customerId, ad);
       setRf(rf);
       setOutputs(outputs);
   }
   
   public final void endSale() {
       String data = rf.format(receipt);
       for(OutputFormat out : outputs) {
           out.output(data);
       }
   }
  
   public final void addItemToSale(String productId, int qty) {
       receipt.addItemToReceipt(productId, qty);
   }
   
   public final void removeItemFromArray(String productId, int qty) {
       receipt.removeItemFromArray(productId, qty);
   }

    public final Receipt getReceipt() {
        return receipt;
    }

    public final void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public final String getStoreName() {
        return storeName;
    }

    public final void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public final ReceiptFormat getRf() {
        return rf;
    }

    public final void setRf(ReceiptFormat rf) {
        this.rf = rf;
    }

    public final OutputFormat[] getOutputs() {
        return outputs;
    }

    public final void setOutputs(OutputFormat[] outputs) {
        this.outputs = outputs;
    }
   
   
   
   
}
