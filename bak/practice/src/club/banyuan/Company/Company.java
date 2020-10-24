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

//    private Employee findEmployeeByName(String name) {
    //不能这么做，原因是foreach会遍历employees这个数组里面的每个元素，而我们有效长度仅仅是size
//        for(Employee e: this.employees) {
//            if (e.getName().equals(name)) {
//                return e;
//            }
//        }
//        return null;
//    }

    private int findIndexByName(String name) {
        for(int i = 0; i < this.size; i++) {
            if (employees[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void print() {
        for(int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
        System.out.println("********************************************************");
    }

    public boolean fireEmployee(String name) {
        // 1. 找这个名字的员工，得到其下标，找不到呢？？
        int pos = findIndexByName(name);
        if (pos == -1) {
            // 没找到这个名字的员工
            return false;
        } else {
            // 找到了
            for (int i = pos; i < size-1; i++) {
                employees[i] = employees[i+1];
            }
            size--;
            return true;
        }
    }

    public void printSalary(String name) {
        int pos = findIndexByName(name);
        if (pos == -1) {
            System.out.println("没有" + name + " 这个员工");
        } else {
            System.out.println(name + "的工资是" + employees[pos].calcSalary());
        }
        System.out.println("********************************************************");
    }

    public void printTotalSalary() {
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += employees[i].calcSalary();
        }
        System.out.println("这个月应该要发 " + total + " 这么多");
        System.out.println("********************************************************");
    }
}
