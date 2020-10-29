package club.banyuan.ch4_objectAndClass.customizedClass.otherPackage;

import club.banyuan.ch4_objectAndClass.customizedClass.Employee;

public class EmployeeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Zhang San", 7500, 2012, 12, 15);
        staff[1] = new Employee("Li Si", 12000, 2017, 10, 1);
        staff[2] = new Employee("Wang Wu", 9500, 2020, 2, 10);

        for (Employee e: staff) {
            e.raiseSalary(5);
        }

        for (Employee e: staff) {
            System.out.println(e);
        }

        Employee copy = staff[0].clone();
        System.out.println(copy);

    }
}
