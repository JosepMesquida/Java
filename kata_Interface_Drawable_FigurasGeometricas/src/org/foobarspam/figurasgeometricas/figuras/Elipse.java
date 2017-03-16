package org.foobarspam.figurasgeometricas.figuras;

public class Elipse extends FiguraGeometrica implements Drawable {
	
	/* Elipse no hereda de C�ruclo porque la relaci�n IS-A o ES-Una 
	 * trata sobre el comportamiento de objeto. 
	 * Una elipse no se comporta como un c�rculo. 
	 * El comportamiento determina la programaci�n por contrato de la clase Elipse y sus m�todos.
	 * Una instancia de C�rculo no verificar�a la condici�n semiejeMayor != semiejeMenor,
	 * por lo que se violar�a el principio de substituci�n de Liskov (LSP).
	 * */
	
	private double semiejeMayor = 0d;
	private double semiejeMenor = 0d;
	private final double PI = Math.PI;
	
	public Elipse() {
		super();
	}
	
	public Elipse(double semiejeMayor, double semiejeMenor) {
		super();
		this.semiejeMayor = semiejeMayor;
		this.semiejeMenor = semiejeMenor;		
	}

	public Elipse(String nombre, double semiejeMayor, double semiejeMenor) {
		super(nombre);
		this.semiejeMayor = semiejeMayor;
		this.semiejeMenor = semiejeMenor;		
	}
	
	public double getSemiejeMayor() {
		return this.semiejeMayor;
	}

	public void setSemiejeMayor(double semiejeMayor) {
		this.semiejeMayor = semiejeMayor;
	}

	public double getSemiejeMenor() {
		return this.semiejeMenor;
	}

	public void setSemiejeMenor(double semiejeMenor) {
		this.semiejeMenor = semiejeMenor;
	}

	@Override
	public double area() {
		return PI * getSemiejeMayor() * getSemiejeMenor();
	}
	
	// implementar m�todo interfaz Drawable
	public void draw(){
		System.out.println("Esto es una: " + this.getNombre());
	}

	/* A elipse no se le puede aplicar un tema => no implementa la espefificaci�n applyTheme()
	* de la interfaz Drawable.
	* Se ejecuta el m�todo default de la interfaz => desde el caller hay que atrapar esa excepci�n.
	*/


}
