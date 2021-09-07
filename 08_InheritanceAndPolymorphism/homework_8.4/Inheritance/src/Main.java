import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Company company = new Company();
        List<Employee> workers =new ArrayList<>();

        for (int i = 0; i <180 ; i++) {
            company.hire(new Operator());
        }
        for (int i = 0; i <80; i++) {
            workers.add(new Manager());
            if (i % 8 ==0){  // - выполнять каждую восьмую итерацию
                workers.add(new TopManager(company));
            }
        }
        company.hireAll(workers);

        topAndLow(company);

        List<Employee> employees = company.getEmployees();
        System.out.println("size:"+ employees.size());
        int half =employees.size()/2;
        for (int i = 0; i < half; i++) {
            company.fire(employees.get(i));
        }
        System.out.println("size:"+ company.getEmployees().size());

        topAndLow(company);
    }


    private static void topAndLow(Company company) {
        System.out.println("---------------------------- ");
        List<Employee> topSalaryStaff = company.getTopSalaryStaff(15);
        for (Employee e : topSalaryStaff){
            System.out.println(e.getMonthSalary());
        }
        System.out.println("---------------------------");
        List<Employee> lowSalaryStaff = company.getLowestSalaryStaff(15);
        for (Employee e : lowSalaryStaff){
            System.out.println(e.getMonthSalary());
        }

    }
}
