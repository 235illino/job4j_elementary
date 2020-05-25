package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.condition.ru.job4j.condition.ru.job4j.condition.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.Mortgage;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MortgageTest {

    @Test
    public void whenCredit100Calary120Percent50Years2() {
        ru.job4j.condition.ru.job4j.condition.ru.job4j.condition.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.Mortgage mortgage = new ru.job4j.condition.ru.job4j.condition.ru.job4j.condition.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.Mortgage();
        int rsl = mortgage.year(100, 120, 0.5);
        int expected = 2;
        assertThat(rsl, is(expected));
    }
    @Test
    public void whenCredit1000Calary1200Percent1Years1() {
        ru.job4j.condition.ru.job4j.condition.ru.job4j.condition.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.Mortgage mortgage = new Mortgage();
        int rsl = mortgage.year(1000, 1200, 0.01);
        int expected = 1;
        assertThat(rsl, is(expected));
    }
}