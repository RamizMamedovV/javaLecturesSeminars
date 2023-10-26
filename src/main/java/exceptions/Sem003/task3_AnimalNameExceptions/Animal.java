package exceptions.Sem003.task3_AnimalNameExceptions;

public abstract class Animal {

    protected final String name;

    public String getName() {
        return name;
    }

    protected Animal(String name) {
        this.name = name;
    }

    abstract void swim(int distance) throws AnimalActionException;
}
