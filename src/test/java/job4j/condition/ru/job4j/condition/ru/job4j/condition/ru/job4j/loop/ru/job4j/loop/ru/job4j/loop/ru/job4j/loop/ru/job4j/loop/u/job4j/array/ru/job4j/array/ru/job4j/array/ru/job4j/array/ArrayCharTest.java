package job4j.condition.ru.job4j.condition.ru.job4j.condition.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.u.job4j.array.ru.job4j.array.ru.job4j.array.ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ArrayCharTest {

    @Test
    public void startsWithTrue() {

        char[] word = {'h', 'e', 'l', 'l', 'o'};
        char[] pref = {'h', 'e', 'l'};

        boolean rsl = ArrayChar.startsWith(word, pref);
        boolean exp = true;

        assertThat(exp, is(rsl));

    }
    @Test
    public void startsWithFalse() {

        char[] word = {'h', 'e', 'l', 'l', 'o'};
        char[] pref = {'h', 'e', 'j'};

        boolean rsl = ArrayChar.startsWith(word, pref);
        boolean exp = false;

        assertThat(exp, is(rsl));

    }
}