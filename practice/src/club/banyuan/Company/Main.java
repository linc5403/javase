package club.banyuan.Company;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Employee zhangSan = new Employee(10, "zhangSan", 1000);
        Employee wangWu = new Employee(1000, "wangWu", 1000);
        Employee liSi = new Employee("liSi");
        company.hireEmployee(zhangSan);
        company.hireEmployee(liSi);
        company.hireEmployee(wangWu);
        company.print();
        company.printSalary("zhangSan");
        company.printSalary("lisi");
        company.printTotalSalary();
//        company.fireEmployee("zhangSan");
//        company.print();
//        company.fireEmployee("liSi");
//        company.print();

//        String b = "ab" + "cd";
//        String a = "abcd";
//        String c = new String("abcd");
//        System.out.println(c);
//        System.out.println(a == c);
//        System.out.println(a.equals(c));
    }
}
