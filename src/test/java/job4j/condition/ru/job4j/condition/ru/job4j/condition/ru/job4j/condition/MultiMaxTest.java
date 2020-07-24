package job4j.condition.ru.job4j.condition.ru.job4j.condition.ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        MultiMax multiMax = new MultiMax();
        int max = multiMax.max(5, 4, 3);
        assertThat(max, is(5));
    }

    @Test
    public void whenSecondMax() {
        MultiMax multiMax = new MultiMax();
        int max = multiMax.max(4, 5, 3);
        assertThat(max, is(5));
    }

    @Test
    public void whenThirdMax() {
        MultiMax multiMax = new MultiMax();
        int max = multiMax.max(4, 5, 9);
        assertThat(max, is(9));

    }
}