package com.engeto.lekce08;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.stream.Collectors;

public class Output implements InterfaceStudent{

    @Override
    public String firstTask(SchoolClass schoolClass) {
        return "Třída: " + schoolClass.getName() +
                " (ročník: " + schoolClass.getYear() + ") \n" +
                "Třídní učitel: " + schoolClass.teacher.getSurname() + ", "+ schoolClass.teacher.getTeachName() + "\n" +
                "Počet studentů: " + schoolClass.listOfStudents.size();
    }


    @Override
    public void secondTask(SchoolClass schoolClass) {

        for (int i = 0; i < schoolClass.listOfStudents.size(); i++) {
            System.out.println("# " + (i+1) + " # " + schoolClass.listOfStudents.get(i));
            }

    }


    @Override
    public String thirdTask(SchoolClass schoolClass){

        return schoolClass.getName() + ", " + schoolClass.teacher.getTeachName() + " " + schoolClass.teacher.getSurname() + "\n" +
                schoolClass.listOfStudents.stream().map(student -> student.secondForm()).collect(Collectors.joining("\n"));
    }

    @Override
    public void fileCreation(String filename, SchoolClass schoolClass){

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){

            System.out.println(schoolClass.listOfStudents.stream().map(student -> student.fileFormat()).collect(Collectors.joining("\n")));

        }catch (Exception ex){
            System.out.println("File has not been created! " + ex.getMessage());
        }

    }

}
