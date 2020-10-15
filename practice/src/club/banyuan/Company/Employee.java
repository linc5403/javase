package club.banyuan.Company;

public class Employee {
    private int hours; // 每个月的工作时长
    private String name;
    private int base; // 基本工资-月薪

    public Employee(int hours, String name, int base) {
        this.hours = hours;
        this.name = name;
        this.base = base;
    }

    public int calcSalary() {
        int salary;
        if (hours <= 196) {
            salary = base;
        } else {
            salary = base + 200 * (hours-196);
        }
        return salary;
    }

}
