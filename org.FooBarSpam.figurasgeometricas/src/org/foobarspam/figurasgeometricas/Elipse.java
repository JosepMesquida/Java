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
public class Elipse extends Figura {

    private double radioHorizontal = 0d;
    private double radioVertical = 0d;

    public Elipse() {
        super();

    }

    public Elipse(double radioHorizontal, double radioVertical) {
        this.radioHorizontal = radioHorizontal;
        this.radioVertical = radioVertical;

    }

    public Elipse(double rradioHorizontal, double radioVertical, String nombre) {
        super(nombre);
        this.radioHorizontal = radioHorizontal;
        this.radioVertical = radioVertical;

    }
    
    public double getRadioHorizontal(){
       return this.radioHorizontal = radioHorizontal;
    }
    
    public double getRadioVertical(){
        return this.radioVertical = radioVertical;
    }
    
    public void setRadioHorizontal(double radioHorizontal ){
        this.radioHorizontal = radioHorizontal;
    }
    
    public void setRadioVertical(double radioVerical){
        this.radioVertical = radioVertical;
    }
    
    @Override
    public double area(){
        return Math.PI*radioHorizontal*radioVertical;
    }

}
