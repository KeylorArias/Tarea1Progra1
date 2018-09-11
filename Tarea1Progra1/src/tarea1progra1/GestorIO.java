/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1progra1;

import javax.swing.JOptionPane;

/**
 *
 * @author Keylor
 */
public class GestorIO {
       public void mostrarMensaje (String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
        
    }
    public String solicitarString (String mensaje){
        String texto = JOptionPane.showInputDialog(mensaje);
        return texto;
    }
    public double solicitarDOuble (String mensaje){
        double numDigitado = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
        return numDigitado;
    }
    public int solicitarInt (String mensaje){
        int numDigitado = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return numDigitado;
        
    }
}