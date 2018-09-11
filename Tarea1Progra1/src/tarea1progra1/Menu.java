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
public class Menu {

    GestorIO gestor = new GestorIO();
    private boolean salirMenu;
    private int opcionMenu;
    Point point = new Point();
    Point point2 = new Point();
    Point point3 = new Point();
    Point point4 = new Point();
    Line line = new Line();
    Triangle triangle = new Triangle();
    Rectangle rectangle = new Rectangle();

    public void iniciarMenu() {

        while (salirMenu == false) {
            opcionMenu = gestor.solicitarInt("1) Dibujar un punto. 2) Dibujar una linea. 3) Dibujar un triangulo.  4) Dibujar un rectangulo. 5) Salir");
            switch (opcionMenu) {
                case 1:
                    point.setX(gestor.solicitarInt("Ingrese el valor de X"));
                    point.setY(gestor.solicitarInt("Ingrese el valor de Y"));

                    gestor.mostrarMensaje("El punto es: \n" + "X =" + point.getX() + " Y = " + point.getY());
                    break;
                case 2:
                    point.setX(gestor.solicitarInt("Ingrese el valor x del punto 1"));
                    point.setY(gestor.solicitarInt("Ingrese el valor y del punto 1"));
                    point2.setX(gestor.solicitarInt("Ingrese el valor x del punto 2"));
                    point2.setY(gestor.solicitarInt("Ingrese el valor y del punto 2"));
                    gestor.mostrarMensaje("El punto 1 de la linea es: \n" + "X1 = " + point.getX() + " Y1 = " + point.getY());
                    gestor.mostrarMensaje("El punto 2 de la linea es: \n" + "X2 = " + point2.getX() + " Y2 = " + point2.getY());
                    break;
                case 3:
                    point.setX(gestor.solicitarInt("Ingrese el valor x del punto 1"));
                    point.setY(gestor.solicitarInt("Ingrese el valor y del punto 1"));
                    point2.setX(gestor.solicitarInt("Ingrese el valor x del punto 2"));
                    point2.setY(gestor.solicitarInt("Ingrese el valor y del punto 2"));
                    point3.setX(gestor.solicitarInt("Ingrese el valor x del punto 3"));
                    point3.setY(gestor.solicitarInt("Ingrese el valor y del punto 3"));
                    gestor.mostrarMensaje("El punto 1 del triángulo es: \n" + "X1 = " + point.getX() + " Y1 = " + point.getY());
                    gestor.mostrarMensaje("El punto 2 del triángulo es: \n" + "X2 = " + point2.getX() + " Y2 = " + point2.getY());
                    gestor.mostrarMensaje("El punto 3 del triángulo es: \n" + "X3 = " + point3.getX() + " Y3 = " + point3.getY());
                    break;
                case 4:
                    point.setX(gestor.solicitarInt("Ingrese el valor x del punto 1"));
                    point.setY(gestor.solicitarInt("Ingrese el valor y del punto 1"));
                    point2.setX(gestor.solicitarInt("Ingrese el valor x del punto 2"));
                    point2.setY(gestor.solicitarInt("Ingrese el valor y del punto 2"));
                    point3.setX(gestor.solicitarInt("Ingrese el valor x del punto 3"));
                    point3.setY(gestor.solicitarInt("Ingrese el valor y del punto 3"));
                    point4.setX(gestor.solicitarInt("Ingrese el valor x del punto 4"));
                    point4.setY(gestor.solicitarInt("Ingrese el valor y del punto 4"));
                    gestor.mostrarMensaje("El punto 1 del triángulo es: \n" + "X1 = " + point.getX() + " Y1 = " + point.getY());
                    gestor.mostrarMensaje("El punto 2 del triángulo es: \n" + "X2 = " + point2.getX() + " Y2 = " + point2.getY());
                    gestor.mostrarMensaje("El punto 3 del triángulo es: \n" + "X3 = " + point3.getX() + " Y3 = " + point3.getY());
                    gestor.mostrarMensaje("El punto 4 del triángulo es: \n" + "X4 = " + point4.getX() + " Y4 = " + point4.getY());
                    break;
                case 5:
                    salirMenu = true;
                    break;
            }
        }
    }
}
