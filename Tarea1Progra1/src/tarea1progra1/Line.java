/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1progra1;

/**
 * Descripcion: Clase encargada de crear la lineas con utilizando la clase punto por medio de agregacion  
 * 
 * @author  Keylor Arias y Jenner Rodriguez 
 * @version  10 setiembre 2018 
 */
public class Line {
    private Point pointStart;
    private Point pointEnd;

    public Line() {
    }

    public Line(Point pointStart, Point pointEnd) {
        this.pointStart = pointStart;
        this.pointEnd = pointEnd;
    }

    public Point getPointStart() {
        return pointStart;
    }

    public void setPointStart(Point pointStart) {
        this.pointStart = pointStart;
    }

    public Point getPointEnd() {
        return pointEnd;
    }

    public void setPointEnd(Point pointEnd) {
        this.pointEnd = pointEnd;
    }

    @Override
    public String toString() {
        return "Line{" + "pointStart=" + pointStart + ", pointEnd=" + pointEnd + '}';
    }
    
}
