package introductionOOP.Lectures.lec003.example_Comparator;

public class Main_Employees {
    public static void main(String[] args) {

        Employees employees = new Worker("AAA", "ASD", 32, 123);
        Employees employees11 = new Worker("CCC", "ASD", 32, 123);
        Employees employees2 = new Freelancer("FFF", "ASD", 32, 222);
        Employees employees22 = new Freelancer("FAA", "ASD", 32, 222);

        System.out.println(employees);
        System.out.println(employees11);
        System.out.println(employees2);
        System.out.println(employees22);
    }
}
