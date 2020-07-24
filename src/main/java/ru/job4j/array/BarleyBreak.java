package ru.job4j.array;

public class BarleyBreak {

    public static void main(String[] args) {
        int[][] array = new int[3][3];

        int k = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = k;
                k++;
            }
        }

        for (int[] u : array) {
            for (int y : u) {

                System.out.println(y);

            }

        }
    }

}
