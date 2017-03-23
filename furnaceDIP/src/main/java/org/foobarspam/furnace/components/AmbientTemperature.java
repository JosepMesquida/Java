package org.foobarspam.furnace.components;

public class AmbientTemperature {

	private double temperature = 0d;
	
	
	public AmbientTemperature(double temperature){
		this.temperature = temperature;
	}
	
	private void setTemperature(double temperature){
		this.temperature = temperature;
	}
	
	public double getTemperature(){
		return this.temperature;
	}
	
	public double IncrementTemperature(double increment){
		return temperature += increment;
	}
}
