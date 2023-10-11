package introductionOOP.Seminars.Sem004.bank;

public class Person implements PersonData{

    private final String fio;
    private final String inn;

    public Person(String name, String inn) {
        this.fio = name;
        this.inn = inn;
    }

    public String getFio() {
        return fio;
    }

    @Override
    public String getInn() {
        return null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + fio + '\'' +
                ", inn='" + inn + '\'' +
                '}';
    }
}
