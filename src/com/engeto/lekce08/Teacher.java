package com.engeto.lekce08;

public class Teacher {
    private String teachName;
    private String surname;

    public Teacher(){}

    public Teacher(String teachName, String surname){
        this.teachName = teachName;
        this.surname = surname;
    }

    public String getTeachName() {
        return teachName;
    }

    public void setName(String name) {
        this.teachName = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


}
