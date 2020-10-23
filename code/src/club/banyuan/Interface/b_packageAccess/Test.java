package club.banyuan.Interface.b_packageAccess;

import club.banyuan.Interface.a_common.Person;
import club.banyuan.Interface.a_common.Student;

public class Test {
    public static void main(String[] args) {
        System.out.println(Student.MAX_AGE);
        Person.echoMaxAge();
    }
}
