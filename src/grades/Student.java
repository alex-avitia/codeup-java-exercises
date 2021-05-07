package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();


    public Student(String name, int[] grade) {
        this.name = name;
        for (int i = 0; i < grade.length; i++) {
            addGrade(grade[i]);
        }
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double total = 0;

        for (int i = 0; i < grades.size(); i++ ) {
            total += grades.get(i);
        }
        return total / grades.size();
    }

    // Main
    public static void main(String[] args) {

        Student kyle = new Student("Kyle", new int[]{84, 90, 86});
        Student michelle = new Student("Michelle", new int[] {90, 90, 100});
        Student ed = new Student("Eduardo", new int[] {100, 50, 70});

        System.out.print(kyle.getName() + " -- grade = " + kyle.grades);
        System.out.println(" Average -- " + kyle.getGradeAverage());
        System.out.print(michelle.getName() + " -- grade = " + michelle.grades);
        System.out.println(" Average -- " + michelle.getGradeAverage());
        System.out.print(ed.getName() + " -- grade = " + ed.grades);
        System.out.println(" Average -- " + ed.getGradeAverage());




//        Test your Student class by adding a main method and creating Student objects. Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the average of the student's grades.
    }
}
