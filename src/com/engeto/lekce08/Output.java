package com.engeto.lekce08;

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
         schoolClass.listOfStudents.forEach(System.out::println);

    }

    @Override
    public String thirdTask(SchoolClass schoolClass){

        return schoolClass.getName() + ", " + schoolClass.teacher.getTeachName() + " " + schoolClass.teacher.getSurname() + "\n"
                + schoolClass.student.getId() + ", " + schoolClass.student.getName() + " " + schoolClass.student.getSurname();
    }




//     System.out.println("# " + i + " # " + "ID" + schoolClass.student.getId() + " - " + schoolClass.student.getName() + " " + schoolClass.student.getSurname() + " " + " (" + schoolClass.student.getDateBirth() + ") ");


}
