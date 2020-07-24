package job4j.condition.ru.job4j.condition.ru.job4j.condition.ru.job4j.loop;

import org.junit.Test;
import ru.job4j.condition.ru.job4j.condition.ru.job4j.condition.ru.job4j.loop.Counter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void when0To5Sum15() {
        int rsl = Counter.sum(0, 5);
        int expected = 15;
        assertThat(rsl, is(expected));

    }
    @Test
    public void when0To10Sum30() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));

    }


}