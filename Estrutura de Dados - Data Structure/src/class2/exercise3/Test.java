package class2.exercise3;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.insertData("Lucas Farias da Silva", 3.1);
        student.insertData("João Ferreira Campos", 3.2);
        student.insertData("William Rodrigues Pinho", 3.1);

        System.out.println(student.getName(1));
        System.out.println("The student selected is coursing the semester: " + student.getSemester(1));
        System.out.println("There are " + student.getStudentsNumber() + " students");
    }
}
