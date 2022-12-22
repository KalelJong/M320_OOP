package ch.gugus.d2_school;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zakria Samma TBZ
 */
public class Student {
    private String name;
    private List<Test> tests = new ArrayList<>();

    /**
     * Constructor
     * @param name Name of the student
     */
    public Student(String name){
        this.name = name;
    }

    /**
     * Adds test to list of the student's tests
     * @param test object from type test
     */
    public void addTest(Test test){
        tests.add(test);
    }

    /**
     * Calculates the average grade of the student based on the tests
     * @return Returns average grade
     */
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
