package org.foobarspam.furnace.components;

import org.foobarspam.furnace.interfaces.Heater;
import org.foobarspam.furnace.interfaces.Thermometer;

public class Regulator {


    public void regulate(Thermometer t, Heater h, double minTemp, double maxTemp, AmbientTemperature temperature) {
        RegulatorDisplayCodes code;
        while (t.read(temperature) < maxTemp) {
            code = RegulatorDisplayCodes.HEATING;
            h.engage(temperature);
            message(code, temperature);
        }
        while (t.read(temperature) > minTemp) {
            code = RegulatorDisplayCodes.WAITING;
            h.disengage(temperature);
            message(code, temperature);
        }
    }

    private void message(RegulatorDisplayCodes code, AmbientTemperature temperature) {
        switch (code) {
            case HEATING:
                System.out.println("Está calentando. La temperatura es: " + temperature.getTemperature());
                break;

            case WAITING:
                System.out.println("Hace demasiado calor, la temperatura está bajando y ya va por " + temperature.getTemperature());
                break;
                
            default:
                System.out.println("Algo raro pasa...");
                break;
        }
}
}
