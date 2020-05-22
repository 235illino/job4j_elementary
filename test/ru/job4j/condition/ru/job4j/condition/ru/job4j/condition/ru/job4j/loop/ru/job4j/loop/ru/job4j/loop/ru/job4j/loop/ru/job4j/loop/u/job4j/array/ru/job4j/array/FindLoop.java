package ru.job4j.condition.ru.job4j.condition.ru.job4j.condition.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.u.job4j.array.ru.job4j.array;

public class FindLoop {

    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;

        for (int index = 0; index <= finish; index++) {
            if (index >= start) {
                if (data[index] == el) {
                    rst = index;
                    break;
                }
            }
        }
        return rst;
    }

}
