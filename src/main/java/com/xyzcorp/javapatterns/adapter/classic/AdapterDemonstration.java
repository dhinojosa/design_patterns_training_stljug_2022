package com.xyzcorp.javapatterns.adapter.classic;

import com.xyzcorp.javapatterns.adapter.CelciusThermometer;
import com.xyzcorp.javapatterns.adapter.FahrenheitThermometer;

/**
 * @author John Ericksen
 */
public class AdapterDemonstration {

    public static void main(String args[]) {

        CelciusThermometer celciusThermometer = new CelciusThermometer(34);

        FahrenheitThermometer thermometer = new CelciusToFahrenheitAdapter(celciusThermometer);

        System.out.println(
                "Celcius: " + celciusThermometer.getTemperateInC() +
                        " Fahrenheit: " + thermometer.getTemperateInF());
    }
}
