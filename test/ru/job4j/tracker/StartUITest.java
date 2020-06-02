package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void createItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void showAll() {
    }

    @Test
    public void replaceItem() {
    }

    @Test
    public void deleteItem() {
    }

    @Test
    public void findId() {
    }

    @Test
    public void findName() {
    }

    @Test
    public void init() {
    }

    @Test
    public void main() {
    }
}