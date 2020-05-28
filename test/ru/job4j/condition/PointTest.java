package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointTest {


    @Test
    public void whenFirstPoint3And1SecondPoint5And3Distance2Point83() {
        double expected = 2.83;
        Point a = new Point(3, 1);
        Point b = new Point(5, 3);
        double rsl = a.distance(b);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}