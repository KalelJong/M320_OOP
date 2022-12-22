package ch.gugus.d2_school;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kalel TBZ
 */
public class Class {

    private List<Student> studentList = new ArrayList<>();

    /**
     * Adds Student object to student list
     * @param student object of type Student
     */
    public void addStudents(Student student){
        this.studentList.add(student);
    }

    /**
     * Calculates the class average based on it's student's average grades
     * @return Returns class average grade as float
     */
    public float getAverage(){
        float sumStudentAvgs = 0.0f;
        for (Student student: studentList) {
            sumStudentAvgs += student.getTestsAvg();
        }

        return sumStudentAvgs/studentList.size();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

}
