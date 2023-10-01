package introductionOOP.Lectures.lec003.example002_Iterator_Ierable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public abstract class Beverage implements Iterator<Ingredients> {

    List<Ingredients> componentsList;

    int index;

    public Beverage() {
        this.componentsList = new ArrayList<>();
        this.index = 0;
    }

    public void addIngredients(Ingredients ingredient) {
        if (!componentsList.contains(ingredient))
            componentsList.add(ingredient);
    }

    /**
     * for Iterator
     */
    @Override
    public boolean hasNext() {
        return index < componentsList.size();
    }

    @Override
    public Ingredients next() {
        return componentsList.get(index++);
    }
}
