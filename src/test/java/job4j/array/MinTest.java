package job4j.array;

import org.junit.Test;
import ru.job4j.array.Min;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinTest {

    @Test
    public void findMin1() {

        assertThat(Min.findMin(new int[] {5, 6, 10, 4, 1, 78}), is(1));

    }
    @Test
    public void findMin0() {

        assertThat(Min.findMin(new int[] {0, 6, 10, 4, 1, 78}), is(0));

    }
    @Test
    public void findMin2() {

        assertThat(Min.findMin(new int[] {8, 6, 10, 4, 4, 2}), is(2));

    }
}