package grades;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter students grade: ");
        int studentGrade = sc.nextInt();
        grades.add(studentGrade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int length = grades.size();
        int sum = 0;
        for (int i = 0; i < length; i++)
            sum = sum + grades.get(i);
        double average = sum / length;
        return average;
    }

}
