package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {

        int in = 140;
        int expected = 2;
        int outEuro = rubleToEuro(in);
        boolean passedEuro = expected == outEuro;
        System.out.println("140 rubles are 2. Test result : " + passedEuro);

        int outDollar = rubleToDollar(in);
        boolean passedDollar = expected == outDollar;
        System.out.println("140 rubles are 2. Test result : " + passedDollar);


    }
}
