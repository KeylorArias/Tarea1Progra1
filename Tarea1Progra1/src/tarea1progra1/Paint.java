/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1progra1;

/**
 *
 * @author Keylor
 */

import java.awt.Graphics;
import javax.swing.JPanel;

public class Paint extends JPanel{
  
  Polygon [] poligono;
  Polygon fig;
  
  public Paint(int tam){
    this.poligono = new Polygon[tam];
  }
  
  public void add( Polygon p, int i){
      poligono [i] = p;
  }
  
  public void paintComponent(Graphics g){
      
    for (int i = 0; i < poligono.length; i++) {
        fig = (Polygon) poligono[i];
      
        int tan = fig.length()- 1;
        for (int a = 0; a< tan; a++){
            Point pi = fig.returnPoint(a); 
            Point pf = fig.returnPoint(a+1);
            g.drawLine(pi.getX(), pi.getY(), pf.getX(), pf.getY());
        }    

        Point pi = fig.returnPoint(0); 
        Point pf = fig.returnPoint(tan);
        g.drawLine(pi.getX(), pi.getY(), pf.getX(), pf.getY());
    }
  }  
}
