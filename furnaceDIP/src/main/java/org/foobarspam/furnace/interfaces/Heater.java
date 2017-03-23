package org.foobarspam.furnace.interfaces;

import org.foobarspam.furnace.components.AmbientTemperature;

public interface Heater {

public double engage(AmbientTemperature temperature);	

public double disengage(AmbientTemperature temperature);

	
}
