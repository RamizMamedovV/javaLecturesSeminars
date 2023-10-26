package exceptions.Sem003.task3_AnimalNameExceptions;

public class Cat extends Animal{
    private Cat(String message) {
        super(message);
    }

    @Override
    public void swim(int distance) throws AnimalActionException {
        if (distance > 60){
            throw new AnimalActionException(
                    String.format("%s is not able to swim this distance %d",this.getName(), distance)
                    , this.getName(), distance);
        } else {
            System.out.printf("%s swam %d\n", this.getName(), distance);
        }
    }

    /**
     * Factory method to create cats
     * @param name name
     * @return new Cat
     * @throws AnimalNameException if (name.length() < 3)
     * the name is not acceptable
     */
    public static Cat init(String name) throws AnimalNameException {
        if (name == null || name.length() < 3)
            throw new AnimalNameException(String.format("%s is not acceptable", name), name);
        return new Cat(name);
    }

}
