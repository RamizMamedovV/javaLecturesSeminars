package introductionOOP.Lectures.lec003.example002_Iterator_Ierable.example002_2_Iterable;

import introductionOOP.Lectures.lec003.example002_Iterator_Ierable.Ingredients;

import java.util.Iterator;

public class Coffee_Iterable extends BeverageIterable{
    @Override
    public Iterator<Ingredients> iterator() {
        return new Iterator<Ingredients>() {
            private int index1 = 0;
            @Override
            public boolean hasNext() {
                return index1 < componentsList.size();
            }

            @Override
            public Ingredients next() {
                return componentsList.get(index1++);
            }
        };
    }
}
