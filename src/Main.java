import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static  void main(String[] args) throws IOException {
        File file = new File("src/stud.txt");
        int number = 10;
        System.out.println( "Amount of students: " + number);
        Student[] students = new Student[number];
        for (int i = 0; i < number ; i++) {
            students[i] = new Student();
        }
        ReadFromFile(students,file);
        for (int i = 0; i < number; i++) {
            System.out.println("\nNumber of student #" + (i + 1));
            ShowInfo(students[i]);
        }

        System.out.println("\nThe students who study better in every semester:");
        CheckMarks(students);
    }

    static void ReadFromFile(Student []students, File file){
        Scanner scanner;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
           return;
        }

        for (int i = 0; i < students.length; i++) {
            String name;
            name = scanner.nextLine();
            students[i].setName(name);
            int day = scanner.nextInt();
            int month = scanner.nextInt();
            int year = scanner.nextInt();
             students[i].setDayOfBirthday(day);
             students[i].setMonthOfBirthday(month);
             students[i].setYearOfBirthday(year);
            int course = scanner.nextInt();
            students[i].setCourse(course);
            for (int k = 0; k < students[i].getAmountOfMarks(); k++) {
                double mark;
                mark = scanner.nextDouble();
                students[i].setMarks(k, mark);
            }
            int group = scanner.nextInt();
            students[i].setGroup(group);
            scanner.nextLine();
        }
    }

    static void ShowInfo(Student student){
        System.out.println("\nName:" + student.getName());
        System.out.println("Date of birthday: "+ student.getDayOfBirthday()+"."+student.getMonthOfBirthday()+"."+student.getYearOfBirthday());
        System.out.println("Number of course: " + student.getCourse());
        for (int i = 0; i < student.getAmountOfMarks(); i++) {
            if (student.getMarks(i) == 0) return;
            System.out.println("Mark for the " +(i + 1)+ " semester: " + student.getMarks(i));
        }
        System.out.println("Number of group: "+student.getGroup());
    }

    static void CheckMarks(Student []student){
        boolean temp;
        for (int i = 0; i <student.length; i++) {
            temp = true;
            double MinMark = student[i].getMarks(0);
            for (int k = 0; k < student[i].getAmountOfMarks(); k++) {
                if (student[i].getMarks(k) > MinMark && student[i].getMarks(k) != 0)
                    MinMark = student[i].getMarks(k);
                if (student[i].getMarks(k) < MinMark && student[i].getMarks(k) != 0)
                    temp = false;
            }
            if(temp) ShowInfo(student[i]);
        }
    }
}
