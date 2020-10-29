package club.banyuan.util;

import club.banyuan.ch4_objectAndClass.customizedClass.Employee;

public class VmTest {
    public static void main(String[] args) throws InterruptedException {
        Employee[] employees = new Employee[100];
        employees[0] = new Employee("ZhangSan", 1000, 2000, 1, 1);
        Thread.sleep(1000*1000);
    }
}
