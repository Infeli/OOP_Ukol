package com.engeto.lekce08;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    private String name;
    private String surname;
    private LocalDate dateBirth;
    private String id;


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
        return "ID"+ id + " - " + name + " " + surname + " " + "(" + dateBirth.getYear() + ")";
    }

    public String secondForm(){
        return "ID"+ id + ", " + name + " " + surname;
    }

    public String fileFormat(){
        LocalDate today = LocalDate.now();
        Period p = Period.between(dateBirth, today);

        return "Student: " + name + " " + surname + " with ID" + id + ", is " + p.getYears() + " years old";
    }
}
