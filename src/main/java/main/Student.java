package main;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
    private ArrayList<Grade> grades = new ArrayList<>();
    private String name;
    private String number;

    public Student(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void addGrade(String course, int grade) {
        grades.add(new Grade(course, grade));
    }

    public void listGradeInformation() {
        for (Grade grade : grades) {
            System.out.println(grade.getCourse() + ": " + grade.getGrade());
        } 
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }


}
