package ru.job4j.condition.ru.job4j.condition.ru.job4j.condition.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.u.job4j.array.ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void when5Index0() {

        FindLoop findLoop = new FindLoop();
        int[] input = {5, 6, 7};
        int el = 5;
        int rsl = findLoop.indexOf(input, el);
        int expected = 0;
        assertThat(expected, is(rsl));

    }
    @Test
    public void when8IndexMinus1() {

        FindLoop findLoop = new FindLoop();
        int[] input = {5, 6, 7};
        int el = 8;
        int rsl = findLoop.indexOf(input, el);
        int expected = -1;
        assertThat(expected, is(rsl));

    }
    @Test
    public void when14From2To4Index4() {

        int[] input = {5, 6, 7, 8, 14, 0};
        int el = 14;
        int rsl = FindLoop.indexOf(input, 14, 2, 4);
        int expected = 4;
        assertThat(expected, is(rsl));

    }
}