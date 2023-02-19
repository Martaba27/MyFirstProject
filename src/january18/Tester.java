package january18;

import january18.interfaces.MyStudent;
import january18.interfaces.Student;

public class Tester {

    public static void main(String[] args) {

        Student student = new Student(23,"John");

        System.out.println(student.getId());
        System.out.println(student.toString());


        MyStudent myStudent = new MyStudent(23, "Alyx");

        System.out.println(myStudent);
        System.out.println(myStudent.toString());

    }
}
