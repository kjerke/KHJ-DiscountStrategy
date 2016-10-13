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
public class FakeDatabase implements ArrayDatabase {

    private Customer[] customers = {
        new Customer("100", "John Smith"),
        new Customer("101", "Sam Smith"),
        new Customer("102", "Kevin Smith")
    };
   
    private Product[] products = {
       new Product("1", "Bucks Sweatshirt  ", 59.99),
        new Product("10", "Nike Running Shoes   ", 109.99),
        new Product("15", "Nike Socks    ", 14.99),
    };

    @Override
    public final Customer findCustomerById(String customerId){
         Customer customer = null;
         
         
         for(Customer c : customers){
             if(c.getCustomerId().equals(customerId))
                 customer = c;
             break;
            }
         return customer;
        }
    
    public final Product findProductById(String productId){
        
        Product product = null;
        
        for(Product p: products){
            if(p.getProductId(). equals(productId)){
                product = p;
                break;
            }
        }
        return product;
    }
 
}
