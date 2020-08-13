package ru.job4j;

import java.io.FileOutputStream;

public class Multiple {
    public static void main(String[] args) {


        try (FileOutputStream out = new FileOutputStream("result.txt")) {
            out.write(("1 * 1 = 1" +
                    "1 * 2 = 2" +
                    "1 * 3 = 3" +
                    "1 * 4 = 4" +
                    "1 * 5 = 5" +
                    "1 * 6 = 6" +
                    "1 * 7 = 7" +
                    "1 * 8 = 8" +
                    "1 * 9 = 9" +
                    "1 * 10 = 10"
            ).getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
