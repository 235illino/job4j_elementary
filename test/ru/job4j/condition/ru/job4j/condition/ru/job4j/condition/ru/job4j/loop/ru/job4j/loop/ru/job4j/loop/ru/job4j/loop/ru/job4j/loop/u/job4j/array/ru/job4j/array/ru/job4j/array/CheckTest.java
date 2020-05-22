package ru.job4j.condition.ru.job4j.condition.ru.job4j.condition.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.u.job4j.array.ru.job4j.array.ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void mono() {
        boolean[] in = {false, false, false};
        boolean rsl = Check.mono(in);
        boolean exp = true;
        assertThat(exp, is(rsl));
    }
    @Test
    public void mono1() {
        boolean[] in = {false, true, false};
        boolean rsl = Check.mono(in);
        boolean exp = false;
        assertThat(exp, is(rsl));
    }
}