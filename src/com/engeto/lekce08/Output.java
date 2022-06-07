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
        int line = 1;
        for(int i = 0; i < schoolClass.listOfStudents.size(); i++){
            System.out.println(line++);;
            }

            for (Student a : schoolClass.listOfStudents){
                System.out.println(a);

        }


         //schoolClass.listOfStudents.forEach(System.out::println);

    }



    @Override
    public String thirdTask(SchoolClass schoolClass){

        return schoolClass.getName() + ", " + schoolClass.teacher.getTeachName() + " " + schoolClass.teacher.getSurname() + "\n"
                + schoolClass.student.secondString();
    }






//     System.out.println("# " + i + " # " + "ID" + schoolClass.student.getId() + " - " + schoolClass.student.getName() + " " + schoolClass.student.getSurname() + " " + " (" + schoolClass.student.getDateBirth() + ") ");


}
