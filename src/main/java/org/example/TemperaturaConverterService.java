package org.example;

import org.springframework.stereotype.Service;

@Service
public class TemperaturaConverterService {
    public double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}