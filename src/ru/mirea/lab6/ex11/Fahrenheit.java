package ru.mirea.lab6.ex11;

public class Fahrenheit implements Convertable {
    private final double temperature;

    public Fahrenheit(double temperature) {
        this.temperature = temperature;
    }

    public double convert(Scales s) {
        switch (s) {
            case KELVIN -> {
                return (temperature-32) * 5 / 9 + 273.15d;
            }
            case FAHRENHEIT -> {
                return temperature;
            }
            case CELCIUS -> {
                return (temperature-32) * 5 / 9;
            }
        }
        return temperature;
    };
}
