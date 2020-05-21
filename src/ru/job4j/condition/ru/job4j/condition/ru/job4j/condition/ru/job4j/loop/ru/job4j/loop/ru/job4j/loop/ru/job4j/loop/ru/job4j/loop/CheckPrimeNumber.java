package ru.job4j.condition.ru.job4j.condition.ru.job4j.condition.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean prime = true;

        for (int i = 2; i < number; i++) {

            if (number % 2 == 0) {
                prime = false;
                break;
            }
        }

        return prime;
    }

}
