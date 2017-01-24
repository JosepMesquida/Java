/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foobarspam.figurasgeometricas;

/**
 *
 * @author Josep Mesquida
 */
import java.util.ArrayList;

public class FigurasGeometricasMain {

    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Figura> figuras = new ArrayList<>();

        Rectangulo figuraRectangulo = new Rectangulo("Rectangulo", 3, 4);

        Cuadrado figuraCuadrado = new Cuadrado("Cuadrado", 4);
        
        Triangulo figuraTriangulo = new Triangulo("Triangulo", 2, 4);

        
        figuras.add(figuraRectangulo);
        figuras.add(figuraCuadrado);
    }
}
