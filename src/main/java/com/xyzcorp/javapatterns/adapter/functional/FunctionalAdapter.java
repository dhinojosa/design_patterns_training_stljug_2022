package com.xyzcorp.javapatterns.adapter.functional;

import com.xyzcorp.javapatterns.adapter.CelciusThermometer;
import com.xyzcorp.javapatterns.adapter.FahrenheitThermometer;

import java.util.function.Function;

public class FunctionalAdapter {
    public static void main(String[] args) {
        CelciusThermometer celciusThermometer = new CelciusThermometer(13);
        Function<CelciusThermometer, FahrenheitThermometer> converter =
            c ->  () -> (c.getTemperateInC() * 9 / 5) + 32;
        double temperateInF =
            converter.apply(celciusThermometer).getTemperateInF();
        System.out.println(temperateInF);
    }
}
