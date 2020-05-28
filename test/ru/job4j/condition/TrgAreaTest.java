package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TrgAreaTest {

    @Test
    public void area() {
        Point a = new Point(0, 2);
        Point b = new Point(3, 0);
        Point c = new Point(3, 2);
        double exp = 3.00;
        double ab = a.distance(b);
        double bc = b.distance(c);
        double ac = a.distance(c);

        TrgArea trgArea = new TrgArea(a, b, c);

        double rsl = trgArea.area(a, b, c);
        Assert.assertEquals(rsl, exp, 0.01);
    }
}