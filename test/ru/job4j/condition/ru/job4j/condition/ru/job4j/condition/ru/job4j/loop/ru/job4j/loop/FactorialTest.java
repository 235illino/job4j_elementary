package ru.job4j.condition.ru.job4j.condition.ru.job4j.condition.ru.job4j.loop.ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenN5Factorial120() {
        int rsl = Factorial.calc(5);
        int expected = 120;
        assertThat(rsl, is(expected));
    }
    @Test
    public void whenN0Factorial1() {
        int rsl = Factorial.calc(0);
        int expected = 1;
        assertThat(rsl, is(expected));
    }
}