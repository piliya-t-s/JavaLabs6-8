package ru.mirea.lab6.ex11;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Введите систему измерения: C, K, F");
        String typ = sc.nextLine();
        System.out.println("Введите значение");
        double inp = Double.parseDouble(sc.nextLine());

        Convertable res = new Celcuis(inp);

        switch (typ) {
            case "C":
                res = new Celcuis(inp);
                break;
            case "K":
                res = new Kelvin(inp);
                break;
            case "F":
                res = new Fahrenheit(inp);
                break;
        }


        System.out.println("В какую систему перевести: C, K, F");
        String out = sc.nextLine();
        switch (out) {
            case "C":
                System.out.println(res.convert(Scales.CELCIUS));
                break;
            case "K":
                System.out.println(res.convert(Scales.KELVIN));
                break;
            case "F":
                System.out.println(res.convert(Scales.FAHRENHEIT));
                break;
        }
    }
}
