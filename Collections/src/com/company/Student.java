/*
Developer: Kulani Makhubele
Date: 30-07-2021
Filename: Student.java
Classname: Student
*/
package com.company;
import java.util.HashMap;
import java.util.Map.Entry;

public class Student {
    //student properties
    private static int studentId;
    private static String studentName;
    private static String[] grade = {"A+", "C", "B-", "B"};
    private static String gradeValue = "C";

            //student id is mandatory for all students and should not be changed
    private Student(int studentId) {
        this.studentId = studentId;

    }
    public static void checkGrade() {

        HashMap<Integer, String>  student = new HashMap<>();

            //adding 4 student ids with names
        student.put(1001, "Kulani");
        student.put(1002,  "Ivan");
        student.put(1003,  "Kgomotso");
        student.put(1004, "Sego");

            //removing a student by id
        student.remove(1004);

            //iterate through the student list
        for(Entry<Integer, String> stud : student.entrySet()){

            //assigning grades to the students
            if(stud.getKey() == 1001){
                gradeValue = grade[0];
            }
            if(stud.getKey() == 1002) {
                gradeValue = grade[1];
            }
            if(stud.getKey() == 1003) {
                gradeValue = grade[2];
            }

            //find student by grade
            if(gradeValue == "C") {
                System.out.println("Student:" + stud);
            }
        }


    }

}
















