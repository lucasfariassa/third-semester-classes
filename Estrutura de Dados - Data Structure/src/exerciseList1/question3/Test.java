package exerciseList1.question3;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.insertData("Hamilton Sobrinho","BES006");
        teacher.insertData("Mário Jorge","BES017");

        System.out.println("Professor: " + teacher.getName(1) + "\nCódigo: " + teacher.getSubjectCode(1));
        System.out.println("_________________________________________");
        System.out.println("Professor: " + teacher.getName(0) + "\nCódigo: " + teacher.getSubjectCode(0));
    }
}
