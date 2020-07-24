package job4j.array;

import org.junit.Test;
import ru.job4j.array.Turn;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void back() {
        int[] arrayIn = {2, 6, 9, 0, 4};
        int[] expected = {4, 0, 9, 6, 2};
        int[] rsl = Turn.back(arrayIn);

        assertThat(expected, is(rsl));

    }
    @Test
    public void back2() {
        int[] arrayIn = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        int[] rsl = Turn.back(arrayIn);

        assertThat(expected, is(rsl));

    }
}