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

  

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public int SolicitarMensaje(int var, String mensaje) {
        return var = Integer.parseInt(JOptionPane.showInputDialog(mensaje));

    }
}