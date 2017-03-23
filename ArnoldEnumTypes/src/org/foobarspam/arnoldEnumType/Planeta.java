package org.foobarspam.arnoldEnumType;

public enum Planeta {
	MERCURY (3.303e+23, 2.4397e6),     
	VENUS   (4.869e+24, 6.0518e6),     
	EARTH   (5.976e+24, 6.37814e6),     
	MARS    (6.421e+23, 3.3972e6),     
	JUPITER (1.9e+27,   7.1492e7),     
	SATURN  (5.688e+26, 6.0268e7),     
	URANUS  (8.686e+25, 2.5559e7),     
	NEPTUNE (1.024e+26, 2.4746e7);

	private Double masa;
	private Double radio;
	private final double G = 6.67300E-11;
	private String[] planetasTerrestres;
	
	Planeta(double masa, double radio){
		this.masa = masa;
		this.radio = radio;
	}
	
	public double getMasa(){
		return this.masa;
	}
	
	public double getRadio(){
		return this.radio;
	}
	
	public double pesoSuperficie(double pesoHumano){
		return tuMasa(pesoHumano) * gravedadSuperficie();
	}
	
	public double gravedadSuperficie(){
		return G * masa /(radio * radio); 
		
	}
	
	public double tuMasa(double pesoHumano){
		return pesoHumano / EARTH.gravedadSuperficie();
	}
	
	//Enumset
	public static Planeta[] getPlanetasTerrestres(){
		Planeta[] planetasTerrestres = {MERCURY, VENUS, EARTH, MARS};
		return planetasTerrestres;
	}
	
	public static Planeta[] getGigantesGaseosos(){
		Planeta[] gigantesGaseosos = {JUPITER, SATURN, URANUS, NEPTUNE};
		return gigantesGaseosos;
	}
}
