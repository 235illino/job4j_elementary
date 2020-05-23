package ru.job4j.condition.ru.job4j.condition.ru.job4j.condition.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.u.job4j.array.ru.job4j.array.ru.job4j.array.ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinDiapasonTest {

    @Test
    public void findMin2From1to3() {
        assertThat(MinDiapason.findMin(new int[] {0, 2, 10, 8, 16}, 1, 3), is(2));
    }
    @Test
    public void findMin0From0to3() {
        assertThat(MinDiapason.findMin(new int[] {0, 2, 10, 8, 16}, 0, 3), is(0));
    }
    @Test
    public void findMin1From2to4() {
        assertThat(MinDiapason.findMin(new int[] {0, 2, 10, 8, 1}, 2, 4), is(1));
    }
}