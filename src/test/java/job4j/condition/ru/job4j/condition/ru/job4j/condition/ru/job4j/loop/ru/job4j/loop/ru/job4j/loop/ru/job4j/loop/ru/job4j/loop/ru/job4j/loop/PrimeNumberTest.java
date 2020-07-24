package job4j.condition.ru.job4j.condition.ru.job4j.condition.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop;

import org.junit.Test;
import ru.job4j.condition.ru.job4j.condition.ru.job4j.condition.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.PrimeNumber;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void whenFinish5Primes3() {
        PrimeNumber primeNumber = new PrimeNumber();
        int rsl = primeNumber.calc(5);
        int expected = 3;
        assertThat(expected, is(rsl));
    }
    @Test
    public void whenFinish5Primes11() {
        PrimeNumber primeNumber = new PrimeNumber();
        int rsl = primeNumber.calc(11);
        int expected = 5;
        assertThat(expected, is(rsl));
    }
    @Test
    public void whenFinish5Primes2() {
        PrimeNumber primeNumber = new PrimeNumber();
        int rsl = primeNumber.calc(2);
        int expected = 1;
        assertThat(expected, is(rsl));
    }
}