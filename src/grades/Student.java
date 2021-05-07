package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, int grade) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    // Main
    public static void main(String[] args) {
        Student kyle = new Student("Kyle", 84);
        Student michelle = new Student("Michelle", 90);
        Student ed = new Student("Eduardo", 100);


    }
}
