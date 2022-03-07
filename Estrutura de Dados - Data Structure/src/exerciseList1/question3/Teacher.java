package exerciseList1.question3;

public class Teacher implements TeacherData {
    private final String[] namesVector, subjectCodeVector;
    private int n, sc;

    public Teacher() { // the teacher structure
        namesVector = new String[50];
        subjectCodeVector = new String[50];
        n = 0;
        sc = 0;
    }

    public void insertData(String name, String subjectCode) {
        namesVector[n++] = name;
        subjectCodeVector[sc++] = subjectCode;
    }

    public String getName(int name) {
        return namesVector[name];
    }

    public String getSubjectCode(int subjectCode) {
        return subjectCodeVector[subjectCode];
    }
}
