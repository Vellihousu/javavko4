package main;

import java.util.Scanner;

/**
 * Olio-ohjelmointi viikko 4
 * Veikko Vanninen
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner selection = new Scanner(System.in);

        Student student = null;

        University university = new University();

        Calculator calculator = new Calculator();

        boolean exit = false;
        while(!exit) {
            System.out.println("1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma");
            if(selection.hasNext()) {
                int i = 0;
                String stringInput = selection.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Anna opiskelijan nimi?");
                        String studentName = selection.nextLine();
                        System.out.println("Anna opiskelijan opiskelijanumero:");
                        String studentNumberString = selection.nextLine();

                        student = new Student(studentName, studentNumberString);
                        university.addStudent(student);
                        break;
                    case 2:
                        university.listStudentsInformation();
                        break;
                    case 3:
                        university.listStudents();
                        System.out.println("Mille opiskelijalle suorite lisätään?");
                        int id1 = Integer.parseInt(selection.nextLine());
                        Student s1 = university.getStudentId(id1);
                        System.out.println("Mille kurssille suorite lisätään?");
                        String course = selection.nextLine();
                        System.out.println("Mikä arvosana kurssille lisätään?");
                        int grade = Integer.parseInt(selection.nextLine());
                        s1.addGrade(course, grade);           
                        break;
                    case 4:
                        university.listStudents();
                        System.out.println("Minkä opiskelijan suoritteet listataan?");
                        int id2 = Integer.parseInt(selection.nextLine());
                        Student s2 = university.getStudentId(id2);
                        s2.listGradeInformation();
                        break;
                    case 5:
                        university.listStudents();
                        System.out.println("Minkä opiskelijan suoritteiden keskiarvo lasketaan?");
                        int id3 = Integer.parseInt(selection.nextLine());
                        Student s3 = university.getStudentId(id3);
                        System.out.println("Keskiarvo on " + calculator.getAverageGrade(s3));
                        break;
                    // case 6:
                    //     university.listStudents();
                    //     System.out.println("Minkä opiskelijan suoritteiden mediaani lasketaan?");
                    //     int id4 = Integer.parseInt(selection.nextLine());
                    //     Student s4 = university.getStudentId(id4);
                    //     // System.out.println("Mediaani on " + calculator.getMedianGrade(s4));
                    //     calculator.getMedianGrade(s4);
                    //     break;
                    case 7:
                        university.saveStudents();
                        break;
                    case 8:
                        university.loadStudents();
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
        }
        selection.close();
    }
}
