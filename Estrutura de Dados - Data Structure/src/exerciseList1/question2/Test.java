package exerciseList1.question2;

import exerciseList1.question2.Student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.insertData("Lucas Farias da Silva", "3.1");
        student.insertData("João Ferreira Campos", "3.2");
        student.insertData("William Rodrigues Pinho", "3.1");

        System.out.println(student.getName(1));
        System.out.println("The student selected is coursing the semester: " + student.getSemester(1));
    }
}
