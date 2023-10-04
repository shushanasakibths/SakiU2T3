
public class Student {

    private String firstName;
    private String lastName;
    private int gradYear;
    private double accumulatedTestScores;
    private int testScoreCount;

    public Student(String firstName, String lastName, int gradYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        accumulatedTestScores = 0.0;
        testScoreCount = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }

    public void addTestScore(double newTestScore) {
        accumulatedTestScores += newTestScore;
        testScoreCount++;
    }

    public boolean isPassing() {
        if (averageTestScore() >= 65) {
            return true;
        } else {
            return false;
        }
    }

    public double averageTestScore() {
        double average = accumulatedTestScores / testScoreCount;
        return average;
    }

    public void printStudentInfo() {
        System.out.println("Student Full Name: " + firstName + " " + lastName);
        System.out.println("Graduation Year: " + gradYear);
        System.out.println("Number of tests: " + testScoreCount);
        System.out.println("Average Test Score: " + averageTestScore());
        System.out.println("Is passing: " + isPassing());
    }

    public String getStudentInfo() {
        String info = "Student Full Name: " + firstName + " " + lastName;
        info += "\nGraduation Year: " + gradYear;
        info += "\nNumber of tests: " + testScoreCount;
        info += "\nAverage Test Score: " + averageTestScore();
        info += "\nIs passing: " + isPassing();
        return info;
    }

}
