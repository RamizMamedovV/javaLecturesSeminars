package sem3_homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = CreateEmployees.getEmployees(15);

        Arrays.sort(employees, new SalaryComparator());
        //Arrays.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
