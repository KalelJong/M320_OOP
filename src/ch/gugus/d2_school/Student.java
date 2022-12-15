package ch.gugus.d2_school;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Test> tests = new ArrayList<>();

    public Student(String name){
        this.name = name;
    }

    public void addTest(Test test){
        tests.add(test);
    }

    public float getTestsAvg(){
        float sumOfGrades = 0.0f;
        for (Test test: tests) {
            sumOfGrades += test.calculateGrades();
        }

        return sumOfGrades/tests.size();
    }

    public String getStudentName() {
        return name;
    }

}
