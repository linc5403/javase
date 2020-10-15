package club.banyuan.Company;

public class Company {
    private Employee[] employees;
    private int size;

    public Company() {
        employees = new Employee[10];
        size = 0;
    }

    public boolean hireEmployee(Employee e) {
        if (size < 10) {
            employees[size] = e;
            size++;
            return true;
        } else {
            System.out.println("工位满了，不能招人了");
            return false;
        }
    }

    public boolean fireEmployee(String name) {
        // 1. 找这个名字的员工，得到其下标，找不到呢？？

        // 2. for(int j = i; j < size-1; j++) employees[i] = employees[i+1]
    }
}
