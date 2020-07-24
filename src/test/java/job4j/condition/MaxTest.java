package job4j.condition;

import org.hamcrest.core.Is;
import org.junit.Test;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void max() {
        assertThat(3, Is.is(Max.max(2, 3)));
    }

    @Test
    public void testMax() {
        assertThat(4, is(Max.max(2, 3, 4)));

    }

    @Test
    public void testMax1() {
        assertThat(10, is(Max.max(2, 3, 6, 10)));

    }
}