package ru.mirea.lab6.ex11;

public class Celcuis implements Convertable {
    private final double temperature;

    public Celcuis(double temperature) {
        this.temperature = temperature;
    }

    public double convert(Scales s) {
        switch (s) {
            case KELVIN -> {
                return temperature+273.15d;
            }
            case FAHRENHEIT -> {
                return (temperature * 9 / 5) + 32;
            }
            case CELCIUS -> {
                return temperature;
            }
        }
        return temperature;
    };
}
