package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
// import java.io.FileInputStream;
// import java.io.FileNotFoundException;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.ObjectInputStream;
// import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class University {
    final private String FILENAME = "students.data";
    private ArrayList<Student> students = new ArrayList<>();
    
    // private EventLogger eventlogger;

    // public University(EventLogger eventlogger) {
    //     this.eventLogger = eventLogger;
    //     FILENAME = "students.data";
    // }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void listStudentsInformation() {
        System.out.println("Opiskelijat:");
        for (Student student : students) {
            System.out.println(student.getNumber() + ": " + student.getName());           
        }
    }

    public void listStudents() {
        int i = 0;
        for (Student student : students) {
            System.out.println(i++ + ": " + student.getName());
        }
    }

    public Student getStudentId(int id) {
        return students.get(id);
    }

    public void saveStudents() {
        try {
            ObjectOutputStream studentWriter = new ObjectOutputStream(new FileOutputStream(FILENAME));
            studentWriter.writeObject(students);
            studentWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadStudents() {
        try {
            ObjectInputStream studentReader = new ObjectInputStream(new FileInputStream(FILENAME));
            students = (ArrayList<Student>) studentReader.readObject();
            studentReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
    }







    
}

