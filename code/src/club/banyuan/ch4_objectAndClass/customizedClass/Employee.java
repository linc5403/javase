package club.banyuan.ch4_objectAndClass.customizedClass;

import java.time.LocalDate;

public class Employee {
    // instance fields (实例字段, 成员变量, 属性)
    private String name;
    private double salary;
    private LocalDate hireDay;

    // constructor (构造器)
    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    // a method (方法)
    public String getName() {
        return name;
    }

    public void raiseSalary(int percent) {
//        salary += salary * percent / 100;
//        请思考为什么不能写如下语句:
        salary += percent / 100 * salary;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "name='" + name + '\'' +
            ", salary=" + salary +
            ", hireDay=" + hireDay +
            '}';
    }

    public boolean equals(Employee other) {
        // 注意下面访问了other对象的私有实例字段, 这是合法的, 因为类的方法可以访问该类实例的所有字段(包括其他对象的private字段)
        return other != null && name.equals(other.name);
    }
}
