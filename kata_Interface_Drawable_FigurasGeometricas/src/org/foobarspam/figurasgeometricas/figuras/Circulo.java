package org.foobarspam.figurasgeometricas.figuras;

public class Circulo extends FiguraGeometrica implements Drawable {
	
	private double radio = 0d;
	// el valor de la propiedad PI no puede variar => final
	private final double PI = Math.PI;
	
	/* Sobrecarga de constructores: utilizo el constructor de la superclase FiguraGeometrica */
	
	public Circulo(){
		super();
	}
	
	public Circulo(double radio){
		super();
		this.radio = radio;
	}
	
	public Circulo(String nombre, double radio){
		super(nombre);
		this.radio = radio;
	}

	@Override
	public double area() {
		// math.pow(numero, potencia) = elevar un n�mero a una potencia
		return PI * Math.pow(this.radio, 2);
	}
	
	// implementar m�todo interfaz Drawable
	public void draw(){
		System.out.println("Esto es un: " + this.getNombre());
	}
	
	// Eliminar en la sobreesceritura un throw Exception de un m�todo default de la interfaz
	// est� permitido porque es imponer restricciones a la definici�n del m�todo...
	// ... pero la excepci�n ha de ser recogida por el caller.
	
	@Override
	
	public void applytheme(){
		System.out.println("Esto es un: " + this.getNombre());
	}

}
