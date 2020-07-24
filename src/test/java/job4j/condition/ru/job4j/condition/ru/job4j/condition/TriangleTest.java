package job4j.condition.ru.job4j.condition.ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.ru.job4j.condition.ru.job4j.condition.Triangle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void existTriangleTrueIfAb2Ac2Bc2() {
        double inAc = 2;
        double inAb = 2;
        double inBc = 2;
        boolean result = Triangle.exist(inAb, inAc, inBc);
        assertThat(result, is(true));

    }
}