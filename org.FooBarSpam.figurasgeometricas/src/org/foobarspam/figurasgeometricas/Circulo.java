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
import java.lang.Math;
public class Circulo extends Figura {

    //formula Area = pi * (radio * 2) 
    private double radio = 0d;

    public Circulo() {
        super();
    }

    public Circulo(double radio) {
        this.radio = radio;

    }

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;

    }

    public double getRadio() {
        return this.radio;

    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
    return Math.pow(getRadio(), 2)*Math.PI;
    }

}
