package job4j.condition.ru.job4j.condition.ru.job4j.condition.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.u.job4j.array.ru.job4j.array.ru.job4j.array.ru.job4j.array.ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void endsWithTrue() {
        char[] in = {'h', 'e', 'l', 'l', 'o'};
        char[] suf = {'l', 'l', 'o'};
        boolean exp = true;
        boolean rsl = EndsWith.endsWith(in, suf);
        assertThat(exp, is(rsl));

    }
    @Test
    public void endsWithFalse() {
        char[] in = {'h', 'e', 'l', 'l', 'u'};
        char[] suf = {'l', 'l', 'o'};
        boolean exp = false;
        boolean rsl = EndsWith.endsWith(in, suf);
        assertThat(exp, is(rsl));

    }
}