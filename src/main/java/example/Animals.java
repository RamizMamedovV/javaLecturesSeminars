package example;

public abstract class Animals {
    String name;
    String breed;
    int weight;
    int age;


    public Animals(String name, String breed, int weight, int age) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.age = age;
    }


    public Animals(String name, String breed, int age) {
        this(name, breed,0, age);
    }

    public Animals(String name, String breed) {
        this(name, breed, 0);
    }

    public Animals(String breed) {
        this("<name>", breed);
    }

    public Animals() {
        this("<breed>");
    }

    public int getAge() {
        return age;
    }

    public abstract void eat();

    public abstract void wc();

    public abstract String toString();
}
