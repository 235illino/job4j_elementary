package ru.job4j.stragery;

import org.junit.Test;
import ru.job4j.condition.u.job4j.condition.SqArea;

import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void draw() {
        Square square = new Square();
        assertThat(square.draw(), is(new StringJoiner(System.lineSeparator())
                .add("++++")
                .add("+  +")
                .add("+  +")
                .add("++++").toString()));
    }
}