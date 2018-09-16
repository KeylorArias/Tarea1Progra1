/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1progra1;

/**
 * Descripcion: Clase encargada de inicializar el menu  
 * 
 * @author  Keylor Arias y Jenner Rodriguez 
 * @version  10 setiembre 2018 
 */

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
public class TestFigure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //primera prueba dibujar un punto
        Point p1 = new Point(10, 10);
        Polygon polygonPoint = new Polygon(1);
        polygonPoint.addPoint(p1, 0);
        
        //Segunda prueba dibujar una linea
        Line line = new Line(new Point (20, 20), new Point (100, 100));
        Polygon polygonLine = new Polygon(2);
        polygonLine.addPoint(line.getPointStart(), 0);
        polygonLine.addPoint(line.getPointEnd(), 1);
        
        //Tercera prueba dibujar un triangulo
        Triangle triangule = new Triangle(new Point (200, 30), new Point (300, 100), new Point (200, 200));
        Polygon poligonTriangle = new Polygon(3);
        poligonTriangle.addPoint(triangule.getPoint1(), 0);
        poligonTriangle.addPoint(triangule.getPoint2(), 1);
        poligonTriangle.addPoint(triangule.getPoint3(), 2);

        //Cuarta prueba dibujar un rectangulo    
        Point point1 = new Point(100, 100);
        Point point2 = new Point(300, 100);
        Point point3 = new Point(300, 300);
        Point point4 = new Point(100, 300);
        Polygon poligonRectangle = new Polygon(4);
        poligonRectangle.addPoint(point1, 0);
        poligonRectangle.addPoint(point2, 1);
        poligonRectangle.addPoint(point3, 2);
        poligonRectangle.addPoint(point4, 3);
               
        JFrame jframe = new JFrame("Dibujador de Poligonos");
        Paint paint = new Paint(4);
        paint.add(polygonPoint, 0);
        paint.add(polygonLine, 1);
        paint.add(poligonTriangle, 2);
        paint.add(poligonRectangle, 3);
        
        jframe.add(paint);
        jframe.setSize(500,500);
        jframe.setVisible(true);
        jframe.addWindowListener( new WindowAdapter() { 
        public void windowClosing( WindowEvent evt ) { 
            System.exit( 0 ); 
        } 
        } ); 
        
    }   
    
}