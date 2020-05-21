package ru.job4j.condition.ru.job4j.condition.ru.job4j.condition.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void when5PrimeTrue() {
        boolean rsl = CheckPrimeNumber.check(5);
        assertThat(rsl, is(true));
    }
    @Test
    public void when6PrimeFalse() {
        boolean rsl = CheckPrimeNumber.check(6);
        assertThat(rsl, is(false));
    }
}