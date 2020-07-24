package ru.job4j.inheritance;

public class Doctor extends Profession {

    private int patients;
    private String diagnose;

    public Doctor(String name, String surname, String education, String birthday, int patients, String diagnose) {
        super(name, surname, education, birthday);
        this.patients = patients;
        this.diagnose = diagnose;
    }

    public int getPatients() {
        return patients;
    }

    public Diagnose heal(Pacient pacient) {
        return new Diagnose(this.diagnose, pacient);
    }

}
