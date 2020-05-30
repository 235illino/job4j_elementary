package ru.job4j.pojo;

import java.util.Date;

public class College {

    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static void main(String[] args) {
        Student student = new Student();
        student.setNameFull("Петров Петр Петрович");
        student.setGroup("ФБ-42");
        student.setDateEntry(new Date());
        System.out.println(student.getNameFull() + " student of " + student.getGroup() + " entried university in "
                + student.getDateEntry());
    }

}
