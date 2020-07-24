package job4j.stragery;

import org.junit.Test;
import ru.job4j.stragery.Triangle;

import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void draw() {
        Triangle triangle = new Triangle();
        assertThat(triangle.draw(), is(new StringJoiner(System.lineSeparator())
                .add("  *")
                .add(" ***")
                .add("*****").toString()));
    }
}