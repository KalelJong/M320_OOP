package ch.gugus.d2_school;

import java.util.List;

public class Class {
    private List<Student> studentList;

    public void addStudents(Student student){
        this.studentList.add(student);
    }

    public float getAverage(){
        float sumStudentAvgs = 0.0f;
        for (Student student: studentList) {
            sumStudentAvgs = student.getTestsAvg();
        }

        return sumStudentAvgs/studentList.size();
    }
}
