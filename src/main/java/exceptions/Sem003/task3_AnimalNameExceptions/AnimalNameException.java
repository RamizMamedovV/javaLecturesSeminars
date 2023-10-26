package exceptions.Sem003.task3_AnimalNameExceptions;

public class AnimalNameException extends AnimalExceptions{

    private final String name;

    public String getName() {
        return name;
    }

    public AnimalNameException(String message, String name) {
        super(message);
        this.name = name;
    }
}
