package job4j.pojo;

import org.junit.Test;
import ru.job4j.pojo.License;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LicenseTest {

    @Test
    public void testEquals() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio");
        assertThat(first, is(second));
    }
}