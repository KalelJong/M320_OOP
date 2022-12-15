package ch.gugus.d2_school;

public class Test {
    private int achievedPoints;
    private int totalPoints;

    public Test(int achievedPoints, int totalPoints) {
        this.achievedPoints = achievedPoints;
        this.totalPoints = totalPoints;
    }

    public float calculateGrades(){
        return ((achievedPoints * 5) / totalPoints) + 1;
    }
}
