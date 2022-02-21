package class2.exercise3;

public interface StudentData {
    void insertData(String name, double semester); // insert information
    Integer getStudentsNumber(); // return students number
    String getName(int name); // return the name of student
    double getSemester(int gs); // return the semester of a student
}
