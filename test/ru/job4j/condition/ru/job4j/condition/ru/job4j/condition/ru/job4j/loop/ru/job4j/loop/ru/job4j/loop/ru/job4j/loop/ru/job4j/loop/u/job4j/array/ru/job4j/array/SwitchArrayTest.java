package ru.job4j.condition.ru.job4j.condition.ru.job4j.condition.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.u.job4j.array.ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap1to2() {
        int[] arrayIn = {1, 8, 6, 9};
        int[] expected = {1, 6, 8, 9};
        int[] rsl = SwitchArray.swap(arrayIn, 1, 2);

        assertThat(expected, is(rsl));

    }
    @Test
    public void whenSwap0to1() {
        int[] arrayIn = {1, 8, 6, 9};
        int[] expected = {8, 1, 6, 9};
        int[] rsl = SwitchArray.swap(arrayIn, 0, 1);

        assertThat(expected, is(rsl));

    }
}