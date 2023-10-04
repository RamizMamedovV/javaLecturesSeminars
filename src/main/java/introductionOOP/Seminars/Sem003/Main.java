package introductionOOP.Seminars.Sem003;

import java.util.Arrays;
/*Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования.
Доработать приложение, которое мы разрабатывали на уроке.
Мы должны поработать с сортировкой объектов,
освоить работу с интерфейсами Comparator, Comparable.

Доработать класс Freelancer, при желании можно разработать и свой
собственный тип сотрудника. Формула расчета среднемесячной заработной платы
может быть такова: «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»
Переработать метод generateEmployees, метод должен создавать случайного
сотрудника (Worker, Freelancer или любого другого). Метод должен быть один!
Придумать свой собственный компаратор (Возможно отсортировать сотрудников
по возрасту? Тогда добавьте соответствующее состояние на уровне ваших классов).
Продемонстрировать сортировку объектов различного типа
с использованием собственного компаратора.*/
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
