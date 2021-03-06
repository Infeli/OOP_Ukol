package com.engeto.lekce08;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    private String name;
    private Integer year;
    Teacher teacher = new Teacher();
    Student student = new Student();

    public List<Student> listOfStudents = new ArrayList<>();

    public SchoolClass(){};

    public SchoolClass (Teacher teacher, String name, Integer year){
        this.teacher = teacher;
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

}
