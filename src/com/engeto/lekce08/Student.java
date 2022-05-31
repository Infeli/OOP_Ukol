package com.engeto.lekce08;

import java.time.LocalDate;

public class Student {
    private String name;
    private String surname;
    private LocalDate dateBirth;
    private String id;
    private Integer lineNumber = 1;

    public Student(){}

    public Student (String name, String surname, LocalDate dateBirth, String id){
        this.name = name;
        this.surname = surname;
        this.dateBirth = dateBirth;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {

        return "# " + lineNumber++ + " # " + "ID"+ id + " - " + name + " " + surname + " " + " ("+ dateBirth.getYear() +") ";

    }
}
