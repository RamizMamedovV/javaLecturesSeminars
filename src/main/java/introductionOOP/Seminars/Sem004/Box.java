package introductionOOP.Seminars.Sem004;

import java.util.ArrayList;

public class Box<T extends Fruit> implements Comparable<Box<T>> {


    //region methods

    /**
     * add a new fruit
     * @param fruit a new fruit
     */
    public void addFruits(T fruit) {
        boxArrayList.add(fruit);
        this.fruit = fruit;
    }

    /**
     * add new fruits
     * @param fruit new fruit
     * @param amount number of fruits
     */
    public void addFruits(T fruit, int amount) {
        this.fruit = fruit;
        for (int i = 0; i < amount; i++) {
            addFruits(this.fruit);
        }
    }

    public ArrayList<T> getFruits() {
        return boxArrayList;
    }

    public double getWeight() {
        if (!boxArrayList.isEmpty())
            return boxArrayList.size() * fruit.getWeight();
        else {
            return 0;
        }
    }


    public boolean compare(Box box) {
        return compareTo(box) == 0;
    }

    @Override
    public int compareTo(Box o) {
        return Double.compare(this.getWeight(), o.getWeight());
    }

    /*
    если пересыпать в пустой массив, то выдаёт ошибку - ДОРАБОТАТЬ!!
     */
    public void sprinkleFruitsTo(Box<T> box) {
        box.getFruits().addAll(this.boxArrayList);
        this.boxArrayList = new ArrayList<>();
    }

    //endregion

    //region Constructor
    /**
     * create box
     */
    public Box() {
        boxArrayList = new ArrayList<>();
    }
    //endregion

    //region Поля
    T fruit;

    protected ArrayList<T> boxArrayList;

    //endregion
}
