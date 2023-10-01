package introductionOOP.Lectures.lec003.example002_Iterator_Ierable.example002_2_Iterable;

import introductionOOP.Lectures.lec003.example002_Iterator_Ierable.Ingredients;

import java.util.ArrayList;
import java.util.List;

public abstract class BeverageIterable implements Iterable<Ingredients> {

    protected List<Ingredients> componentsList;

    protected int index;

    public BeverageIterable() {
        this.componentsList = new ArrayList<>();
        this.index = 0;
    }

    public void addIngredients(Ingredients ingredient) {
        componentsList.add(ingredient);
    }
}
