package com.engeto.lekce08;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Teacher u1 = new Teacher("Jan", "Novák");
        Teacher u2 = new Teacher("Pavel", "Polák");
        Teacher u3 = new Teacher("Petr", "Honák");

        Student s1 = new Student("Petr", "Svoboda", LocalDate.of(2011, 6, 12), "001");
        Student s2 = new Student("Milan", "Říha", LocalDate.of(2010, 10, 8), "123");
        Student s3 = new Student("Jindřich", "Nový", LocalDate.of(2012, 5, 1), "345");


        SchoolClass c1 = new SchoolClass(u1, "4.C", 4);

        c1.listOfStudents.add(s1);
        c1.listOfStudents.add(s2);
        c1.listOfStudents.add(s3);

        System.out.println("####################################");
        System.out.println(c1.toString());
        System.out.println("\n####################################");


        c1.listOfStudents.forEach(System.out::println);

        System.out.println("\n####################################");

        System.out.println(c1.newFormat());


    }
}
