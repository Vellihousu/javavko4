package main;

import java.util.ArrayList;
// import java.util.Arrays;

public class Calculator {
    public double getAverageGrade(Student s) {
        ArrayList<Grade> grades = s.getGrades();
        if (grades.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (Grade grade : grades) {
            sum += grade.getGrade();
        }
        return (double) sum / grades.size();
    }

    // public double getMedianGrade(Student s) {
    //     ArrayList<Grade> grades = new ArrayList<>(s.getGrades());
    //     if (grades.isEmpty()) {
    //         return 0;
    //     }
    //     Grade[] array = grades.toArray(new Grade[0]);
    //     Arrays.sort(array);
    //     System.out.println(array);
    //     return 2.0;
    //         if (array.length % 2 == 0) {
    //             Grade i = array[array.length/2 - 1];
    //             Grade j = array[array.length/2];
    //             double k = (i + j) / 2;
    //         return k;
    //         } else {
    //             double j;
    //             return j;
    //     }
    // }
}
