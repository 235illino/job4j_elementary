package ru.job4j.condition.ru.job4j.condition.ru.job4j.condition.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FitnessTest {

    @Test
    public void whenIvan50Nik100Month2() {
        int rsl = Fitness.calc(50, 100);
        int expected = 2;
        assertThat(rsl, is(expected));

    }
    @Test
    public void whenIvan50Nik60Month1() {
        int rsl = Fitness.calc(50, 60);
        int expected = 1;
        assertThat(rsl, is(expected));

    }
    @Test
    public void whenIvan50Nik200Month4() {
        int rsl = Fitness.calc(50, 200);
        int expected = 4;
        assertThat(rsl, is(expected));

    }
    @Test
    public void whenIvan90Nik90Month1() {
        int rsl = Fitness.calc(90, 90);
        int expected = 1;
        assertThat(rsl, is(expected));

    }
}