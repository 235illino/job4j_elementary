package ru.job4j.condition.ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void max1To2Then2() {
        int inRight = 1;
        int inLeft = 2;
        int expected = 2;
        int result = Max.max(inLeft, inRight);
        Assert.assertEquals(2, result);
    }
    @Test
    public void max2To4Then4() {
        int inRight = 4;
        int inLeft = 2;
        int expected = 4;
        int result = Max.max(inLeft, inRight);
        Assert.assertEquals(4, result);
    }
    @Test
    public void max5To5Then5() {
        int inRight = 5;
        int inLeft = 5;
        int expected = 5;
        int result = Max.max(inLeft, inRight);
        Assert.assertEquals(5, result);
    }




}