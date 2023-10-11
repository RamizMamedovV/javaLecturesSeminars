package introductionOOP.Seminars.Sem004.bank;

public class Main {
    public static void main(String[] args) {

        Entity entity1 = new Entity("aaa", "2222222");
        Person person1 = new Person("xxx", "11111");

        DebetAccount<Person> dePerson = new DebetAccount<>(person1, 20_000);
        DebetAccount<Entity> crEntity = new DebetAccount<>(entity1, 200_000);

        Transaction<Account> trans = new Transaction<>(crEntity, dePerson, 10_000);

        trans.execute();
        System.out.println(dePerson);
        System.out.println(crEntity);

    }
}
