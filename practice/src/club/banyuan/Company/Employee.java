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

    public Employee(String name) {
        this.hours = 196;
        this.base = 1000;
        this.name = name;
    }

    public String getName() {
        return name;
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", base=" + base +
                ", hours=" + hours +
                '}';
    }
}
