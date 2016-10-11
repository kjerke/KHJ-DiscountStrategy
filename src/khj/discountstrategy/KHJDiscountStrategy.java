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
public class KHJDiscountStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayDatabase ad = new FakeDatabase();
       ReceiptFormat rf = new VerboseReceiptFormat();
       
       OutputFormat[] outputs = {
           new ConsoleOutput(),
           new GuiOutput
          };
       
       
       Register register = new Register("Kohls Department Store");
       register.startNewSale("100", ad, rf, outputs);
       
       
       register.addItemToSale("1", 1);
       register.addItemToSale("10", 1);
       register.addItemToSale("15", 3);
       
       
       register.endSale();
                       
       }
    }    

