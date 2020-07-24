package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    public Surgeon(String name, String surname, String education, String birthday, int patients, String diagnose) {
        super(name, surname, education, birthday, patients, diagnose);
    }
}
