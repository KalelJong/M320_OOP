package ch.gugus.d2_school;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Zakria Samma
 */
public class D2 {
    /**
     * Method that is called by the Main class to run the task
     */
    public void run(){
        Student kalel = new Student("Kalel");
        Student zakria = new Student("Zakria");
        Student aron = new Student("Aron");

        int[] maxPoints = { 18, 15, 16 };
        Integer[] intList = { 15, 13, 10, 4, 15, 12, 12, 12, 7, 10, 6, 12, 7 };

        List<Integer> achievedPoints = Arrays.asList(intList);

        for (int i = 0; i < 3; i++)
        {
            Collections.shuffle(achievedPoints);
            kalel.addTest(new Test(achievedPoints.get(0), maxPoints[i]));
            zakria.addTest(new Test(achievedPoints.get(1), maxPoints[i]));
            aron.addTest(new Test(achievedPoints.get(2), maxPoints[i]));
        }

        Class schoolClass = new Class();
        schoolClass.addStudents(kalel);
        schoolClass.addStudents(zakria);
        schoolClass.addStudents(aron);

        for (Student student : schoolClass.getStudentList()){
            System.out.println("Student: " + student.getStudentName() + " | Average : " + student.getTestsAvg());
        }
        System.out.println("Class average: " + schoolClass.getAverage());

    }
}
