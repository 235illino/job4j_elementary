package io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {

    public static void main(String[] args) {
        System.out.print("Я великий Оракул. Что ты хочешь узнать?\n");
        Scanner input = new Scanner(System.in);
        String question = input.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case (0):
                System.out.println("Да");
                break;
            case (1):
                System.out.println("Нет");
                break;
            default:
                System.out.println("Может быть");
                break;
        }
    }

}