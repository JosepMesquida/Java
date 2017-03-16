package org.foobarspam.figurasgeometricas.figuras;

import org.foobarspam.figurasgeometricas.figuras.Drawable;

public class Cuadrado extends FiguraGeometrica implements Drawable {
	
	/* Cuadrado no hereda de Rect�ngulo porque la relaci�n IS-A o ES-Una 
	 * trata sobre el comportamiento de objeto. 
	 * Un cuadrado no se comporta como un rect�ngulo. 
	 * El comportamiento determina la programaci�n por contrato de la clase Cuadrado y sus m�todos.
	 * Una instancia de Rect�ngulo no verificar�a la condici�n anchura = altura,
	 * por lo que se violar�a el principio de substituci�n de Liskov (LSP).
	 * */
	
	double lado = 0d;

	/* Sobrecarga de constructores: utilizo el constructor de la superclase FiguraGeometrica */
	
	public Cuadrado() {
		super();
	}

	public Cuadrado(double lado){
		super();
		this.lado = lado;
	}
	
	public Cuadrado(String nombre, double lado){
		super(nombre);
		this.lado = lado;
	}
	
	public double getLado(){
		return this.lado;
	}
	
	public void setlado(double lado){
		this.lado = lado;
	}
	
	@Override
	public double area(){
		return Math.pow(getLado(), 2);
	}
	
	// implementar m�todo interfaz Drawable
	public void draw(){
		System.out.println("Esto es un: " + this.getNombre());
	}
	
	// Eliminar en la sobreesceritura un throw Exception de un m�todo default de la interfaz
	// est� permitido porque es imponer restricciones a la definici�n del m�todo...
	// ... pero la excepci�n ha de ser recogida por el caller.	
}