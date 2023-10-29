package ru.mirea.lab6.ex11;

public class Kelvin implements Convertable {
    private final double temperature;

    public Kelvin(double temperature) {
        this.temperature = temperature;
    }

    public double convert(Scales s) {
        switch (s) {
            case KELVIN -> {
                return temperature;
            }
            case FAHRENHEIT -> {
                return (temperature - 273.15d) * 9 / 5 + 32;
            }
            case CELCIUS -> {
                return temperature-273.15d;
            }
        }
        return temperature;
    };
}
