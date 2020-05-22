package ru.job4j.condition.ru.job4j.condition.ru.job4j.condition.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.u.job4j.array.ru.job4j.array.ru.job4j.array.ru.job4j.array.ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int k = word.length - 1;

        for (int i = post.length - 1; i >= 0; i--) {
            if (post[i] != word[k]) {
                result = false;
                break;
            }
            k--;
        }
        return result;
    }

}
