package introductionOOP.Lectures.lec003.example002_Iterator_Ierable;

public abstract class Ingredients {
    protected String name;

    public Ingredients(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ingredients " + name;
    }

//    @Override
//    public boolean equals(Object obj) {
//        return this.getClass().equals(((Ingredients) obj).getClass());
//    }
}
