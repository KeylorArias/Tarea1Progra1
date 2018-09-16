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
public class Polygon {

    private Point[] arrayPoligon;

    public Polygon(int length) {
        arrayPoligon = new Point[10];
        arrayPoligon[0] = new Point(0, 0);
        arrayPoligon[1] = new Point(0, 0);
        arrayPoligon[2] = new Point(0, 0);
        arrayPoligon[3] = new Point(0, 0);
        arrayPoligon[4] = new Point(0, 0);
        arrayPoligon[5] = new Point(0, 0);
        arrayPoligon[6] = new Point(0, 0);
        arrayPoligon[7] = new Point(0, 0);
        arrayPoligon[8] = new Point(0, 0);
        arrayPoligon[9] = new Point(0, 0);


    }

    public Point[] getArrayPoligon() {
        return arrayPoligon;
    }

    public void setArrayPoligon(Point[] arrayPoligon) {
        this.arrayPoligon = arrayPoligon;
    }

    public int length() {
        return arrayPoligon.length;

    }

    public Point returnPoint(int index) {
        return arrayPoligon[index];

    }

    public void addPoint(Point point, int index) {
        arrayPoligon[index] = point;
    }

    @Override
    public String toString() {
        return "Polygon{" + "arrayPoligon=" + arrayPoligon + '}';
    }

}
