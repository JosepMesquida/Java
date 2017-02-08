/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
/**
 *
 * @author Josep Mesquida
 */
public class Ejercicio1 {

    private double[] ventas = {8000, 200, 930, 1020.99, 650};
    private double mayor = 0;
    private double menor = 0;
    private double total = 0;
    private int posicionMayor = 0;
    private int posicionMenor = 0;

    //contructor
    public Ejercicio1() {

    }

    ;
    
     //inicializador
     public void Ejercicio1(double mayor, double menor, double total, int posicionMayor, int posicionMenor, double[] ventas) {
        this.mayor = mayor;
        this.menor = menor;
        this.total = total;
        this.posicionMayor = posicionMayor;
        this.posicionMenor = posicionMenor;
        this.ventas = ventas;
    }

    //sets
    private void setMayor(double mayor) {
        this.mayor = mayor;
    }

    private void setMenor(double menor) {
        this.menor = menor;
    }

    private void setTotal(double total) {
        this.total = total;
    }

    private void setPosicionMayor(int posicionMayor) {
        this.posicionMayor = posicionMayor;
    }

    private void setPosicionMenor(int posicionMenor) {
        this.posicionMenor = posicionMenor;
    }

    //Gets
    public double getMayor() {
        return this.mayor;
    }

    public double getMenor() {
        return this.menor;
    }

    public double getTotal() {
        return this.total;
    }

    public int getPosicionMayor() {
        return this.posicionMayor;
    }

    public int getPosicionMenor() {
        return this.posicionMenor;
    }

    //metodos
    public double empresaMayorVentas() {
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] > mayor) {
                mayor = ventas[i];
                posicionMayor = i;
            }
        }
            return posicionMayor;
    }

    public double empresaMenorVentas() {
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] < menor) {
                menor = ventas[i];
                posicionMenor = i;
            }
        }
        return posicionMenor;
    }

    public double totalVentas() {
        for (int i = 0; i < ventas.length; i++) {
            total += ventas[i];
        }
        
        return total;
    }

    public String empresaMenorMensaje() {
        return ("La tienda que menos ha vendido fue la " + (posicionMenor + 1) + ", que vendió " + menor + " €");
    }

    public String empresaMayorMensaje() {
        return ("La tienda que mas ha vendido fue la " + (posicionMayor + 1) + ", que vendió " + mayor + " €");
    }

    public String totalVentasMensaje() {
        return ("El total de las ventas es: " + total + " €");
    }
}
