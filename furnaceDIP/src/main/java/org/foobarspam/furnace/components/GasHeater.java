package org.foobarspam.furnace.components;

import org.foobarspam.furnace.interfaces.Heater;

public class GasHeater implements Heater {

	
    @Override
    public void engage(AmbientTemperature temperature) {
        temperature.IncrementTemperature(1);
    }

    @Override
	public double disengage(AmbientTemperature temperature) {
    	temperature.IncrementTemperature(-1);
	}


}
