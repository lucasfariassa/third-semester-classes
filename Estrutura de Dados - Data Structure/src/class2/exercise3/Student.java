package class2.exercise3;

public class Student implements StudentData {
    private final String[] namesVector;
    private final double[] semestersVector;
    private int n, s;

    public Student() { // the student structure
        namesVector = new String[30];
        semestersVector = new double[30];
        n = 0;
        s = 0;
    }

    // Add the information about the student
    public void insertData(String name, double semester) {
        namesVector[n++] = name;
        semestersVector[s++] = semester;
    }

    // Return the semester of selected student
    public double getSemester(int student) {
        return semestersVector[student];
    }

    // Return the name of selected student
    public String getName(int student) {
        return namesVector[student];
    }

    // Return the numbers of students
    public Integer getStudentsNumber() { // return the number of students
        return n;
    }
}
