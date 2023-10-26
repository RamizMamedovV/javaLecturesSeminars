package exceptions.Sem003.task3_AnimalNameExceptions;

public class Dog extends Animal{
    private Dog(String name) {
        super(name);
    }

    @Override
    public void swim(int distance) throws AnimalActionException {
        if (distance > 100){
            throw new AnimalActionException
                    (String.format("%s is not able to swim this distance %d",this.getName(), distance)
                    , this.getName(), distance);
        } else {
            System.out.printf("%s swam %d\n", this.getName(), distance);
        }
    }

    /**
     * Factory method to create dogs
     * @param name name
     * @return new Dog
     * @throws AnimalNameException if (name.length() < 3)
     * the name is not acceptable
     */
    public static Dog init(String name) throws AnimalNameException {
        if (name == null || name.length() < 3)
            throw new AnimalNameException("name is not acceptable", name);
        return new Dog(name);
    }
}
