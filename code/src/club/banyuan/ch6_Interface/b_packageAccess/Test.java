package club.banyuan.ch6_Interface.b_packageAccess;

import club.banyuan.ch6_Interface.c_default_method.Person;
import club.banyuan.ch6_Interface.c_default_method.Student;

public class Test {
    public static void main(String[] args) {
        System.out.println(Student.MAX_AGE);
        Person.echoMaxAge();
    }
}
