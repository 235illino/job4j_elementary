package ru.job4j.inheritance;

public class Diagnose {

    private String diagnose;
    private Pacient pacient;

    public Diagnose(String diagnose, Pacient pacient) {
        this.diagnose = diagnose;
        this.pacient = pacient;
    }

    public String getDiagnose() {
        return diagnose;
    }
}
