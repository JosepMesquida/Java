package org.foobarspam.furnace.components;

import org.foobarspam.furnace.interfaces.Thermometer;

public class RemoteCommandSensor implements Thermometer {
	
    @Override
    public double read(AmbientTemperature temperature) {
        return temperature.getTemperature();
}

}
