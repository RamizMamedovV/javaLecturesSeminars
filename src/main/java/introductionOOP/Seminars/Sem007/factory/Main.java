package introductionOOP.Seminars.Sem007.factory;

import introductionOOP.Seminars.Sem003.CreateEmployees;
import introductionOOP.Seminars.Sem003.Employee;
import introductionOOP.Seminars.Sem003.SalaryComparator;
import introductionOOP.Seminars.Sem003.SortType;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = CreateEmployees.getEmployees(15);

        // Arrays.sort(employees, new IdComparator(SortType.Descending));
        // Arrays.sort(employees, new AgeComparator(SortType.Descending));
        Arrays.sort(employees, new SalaryComparator(SortType.Ascending));
        //Arrays.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
