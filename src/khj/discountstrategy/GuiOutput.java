/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khj.discountstrategy;

import javax.swing.JOptionPane;

/**
 *
 * @author kevinjerke
 */
public class GuiOutput implements OutputFormat {
    
    public final void output(String data) {
        JOptionPane.showMessageDialog(null, data);
    }
    
}
