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
public class ConsoleOutput implements OutputFormat {
    
    
    
    @Override
    public final void output(String data){
        System.out.println(data);
    }
}
