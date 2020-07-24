package job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointTest {


    @Test
    public void d2() {
        double expected = 2.83;
        Point a = new Point(3, 1);
        Point b = new Point(5, 3);
        double rsl = a.distance(b);
        Assert.assertEquals(expected, rsl, 0.01);
    }
    @Test
    public void d3() {
        double expected = 3.46;
        Point a = new Point(3, 1, 0);
        Point b = new Point(5, 3, 2);
        double rsl = a.distance3d(b);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}