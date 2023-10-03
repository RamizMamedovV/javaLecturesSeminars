package introductionOOP.Lectures.lec003.example_Comparator;

import myLibrary.GetNames;
import myLibrary.GetSurnames;

import java.util.Random;


public class Main_Employees {
    public static Employee getEmployee() {
        Random rnd = new Random();
        int i = rnd.nextInt(6);
        return switch (i) {
            case 1 -> new Worker(GetSurnames.femaleSurname()
                    , GetNames.femaleName()
                    , rnd.nextInt(18, 45), rnd.nextInt(80, 120) * 1000);
            case 2 -> new Worker(GetSurnames.manSurname()
                    , GetNames.manName()
                    , rnd.nextInt(18, 45), rnd.nextInt(80, 120) * 1000);
            case 3 -> new Freelancer(GetSurnames.manSurname()
                    , GetNames.manName()
                    , rnd.nextInt(18, 45), rnd.nextInt(15, 25) * 100);
            case 4 -> new Freelancer(GetSurnames.femaleSurname()
                    , GetNames.femaleName()
                    , rnd.nextInt(18, 45), rnd.nextInt(15, 25) * 100);
            default -> new Driver(GetSurnames.manSurname()
                    , GetNames.manName()
                    , rnd.nextInt(18, 45), rnd.nextInt(80, 120) * 1000
                    , rnd.nextInt(1, 40));
        };

    }

    public static Employee[] getEmployees(int count) {
        Employee[] employees = new Employee[count];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = getEmployee();
        }
        return employees;
    }

    public static void main(String[] args) {

        Employee[] employees = getEmployees(10);

        for (Employee ems : employees) {
            System.out.println(ems);
        }
    }
}
