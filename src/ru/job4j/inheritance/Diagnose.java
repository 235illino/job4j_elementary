package ru.job4j.inheritance;

public class Diagnose {

    String diagnose;
    Pacient pacient;

    public Diagnose(String diagnose, Pacient pacient) {
        this.diagnose = diagnose;
        this.pacient = pacient;
    }

    public String getDiagnose() {
        return diagnose;
    }
}
