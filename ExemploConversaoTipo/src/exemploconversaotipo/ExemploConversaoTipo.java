/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploconversaotipo;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class ExemploConversaoTipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String x = "3.85";
        float j = (float)4.4;
        double v;
        
        v = Double.valueOf(x);
        
        System.out.println(v);
        
        JOptionPane.showMessageDialog(null, v);
        v = Double.valueOf(JOptionPane.showInputDialog("Informe um valor:"));
        
        JOptionPane.showMessageDialog(null, v);
    }
    
}
