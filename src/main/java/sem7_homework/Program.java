package sem7_homework;

public class Program {

    /**
     *  TODO: Доработать приложение, которое разрабатывалось на семинаре,
     *  поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании),
     *  например, добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     * @param args args
     */
    public static void main(String[] args) {

        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency, 120000);
        Company yandex = new Company("Yandex", jobAgency, 95000);
        Company geekBrains = new Company("GeekBrains", jobAgency, 98000);

        Vacancy vacancy = new Vacancy("google", 120_000, VacancyType.Programmer);

        Student student1 = new Student("Студент #1", VacancyType.freelancer);
        Master master1 = new Master("Мастер #1", VacancyType.Programmer);
        Master master2 = new Master("Мастер #2", VacancyType.cleaner);
        Programmer programmer = new Programmer("Программист #1", VacancyType.Programmer);

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(programmer);

        for (int i = 0; i < 2; i++){
            google.needEmployee(vacancy);
            yandex.needEmployee(vacancy);
            geekBrains.needEmployee(vacancy);
            System.out.println("-------------------------");
        }

    }

}
