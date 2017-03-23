package org.foobarspam.furnace.main;

import org.foobarspam.furnace.components.AmbientTemperature;
import org.foobarspam.furnace.components.GasHeater;
import org.foobarspam.furnace.components.Regulator;
import org.foobarspam.furnace.components.RemoteCommandSensor;
import org.foobarspam.furnace.interfaces.Heater;
import org.foobarspam.furnace.interfaces.Thermometer;

public class Main {

	public static void main(String[] args) {
		double minTemp = 15.0;
		double maxTemp = 22.0;
		AmbientTemperature ambTemp = new AmbientTemperature(15.0);
		Thermometer remoteCommand = new RemoteCommandSensor();
		Heater gasHeater = new GasHeater();
		Regulator regulador = new Regulator();
		regulador.regulate(remoteCommand, gasHeater, minTemp, maxTemp, ambTemp);

	}

}
