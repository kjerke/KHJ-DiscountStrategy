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
class Customer {
    private String customerId;
    private String customerName;

    public Customer(String customerId, String customerName){
        setCustomerId(customerId);
        setCustomerName(customerName);
    }
    
    
    public final String getCustomerId() {
        return customerId;
    }

    public final void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public final String getCustomerName() {
        return customerName;
    }

    public final void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    
    
    
    
    
    
    
    
}
