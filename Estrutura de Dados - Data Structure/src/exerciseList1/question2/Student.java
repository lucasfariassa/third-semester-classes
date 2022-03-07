package exerciseList1.question2;

public class Student implements StudentData {
    private final String[] namesVector, semestersVector;
    private int n, s;

    public Student() { // the student structure
        namesVector = new String[30];
        semestersVector = new String[30];
        n = 0;
        s = 0;
    }

    // Add the information about the student
    public void insertData(String name, String semester) {
        namesVector[n++] = name;
        semestersVector[s++] = semester;
    }

    // Return the semester of selected student
    public String getSemester(int student) {
        return semestersVector[student];
    }

    // Return the name of selected student
    public String getName(int student) {
        return namesVector[student];
    }
}
