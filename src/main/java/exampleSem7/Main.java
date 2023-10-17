package exampleSem7;

public class Main {
    public static void main(String[] args) {
        Creator creatorCompany = new Creator();
        creatorCompany.createCompany(3);
        creatorCompany.printCompanies();
        System.out.println();

        creatorCompany.createWorker(3);
        creatorCompany.printWorkers();
    }
}
