package grades;

import java.util.ArrayList;

public class Student {

    private static String name;
    private static ArrayList<Integer> grades;


    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
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
