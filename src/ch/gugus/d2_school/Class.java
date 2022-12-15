package ch.gugus.d2_school;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private List<Student> studentList = new ArrayList<>();

    public void addStudents(Student student){
        this.studentList.add(student);
    }

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
