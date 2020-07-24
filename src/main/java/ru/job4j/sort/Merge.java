package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int leftIdx = 0;
        int rightIdx = 0;
        int[] rsl = new int[left.length + right.length];
        for (int i = 0; i < rsl.length; i++) {
            if (leftIdx < left.length && rightIdx < right.length && left[leftIdx] < right[rightIdx]) {
                rsl[i] = left[leftIdx];
                leftIdx++;
            } else if (rightIdx < right.length) {
                rsl[i] = right[rightIdx];
                rightIdx++;
            } else {
                if (leftIdx < left.length) {
                    rsl[i] = left[leftIdx];
                    leftIdx++;
                }
                if (rightIdx < right.length) {
                    rsl[i] = right[rightIdx];
                    rightIdx++;
                }
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{2, 4},
                new int[]{1, 3, 5}
        );
        System.out.println(Arrays.toString(rsl));
    }

}
