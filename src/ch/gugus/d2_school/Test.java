package ch.gugus.d2_school;

/**
 * @author Kalel TBZ
 */
public class Test {
    private int achievedPoints;
    private int totalPoints;

    /**
     * Constructor of the test class
     * @param achievedPoints points achieved by the student
     * @param totalPoints highest possible test score
     */
    public Test(int achievedPoints, int totalPoints) {
        this.achievedPoints = achievedPoints;
        this.totalPoints = totalPoints;
    }

    /**
     * Calculates grade of the test based of achieved and max points
     * @return Returns the grade as float
     */
    public float calculateGrades(){
        return ((achievedPoints * 5) / totalPoints) + 1;
    }
}
