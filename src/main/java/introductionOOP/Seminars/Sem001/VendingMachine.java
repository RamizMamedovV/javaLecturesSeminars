package introductionOOP.Seminars.Sem001;

import introductionOOP.Seminars.Sem001.BottleOfMilk;
import introductionOOP.Seminars.Sem001.Chocolate;
import introductionOOP.Seminars.Sem001.Product;

import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfMilk getBottleOfMilk(String name, double volume) {
        for (Product product : products) {
            if (product instanceof BottleOfMilk bottleOfMilk) {
                if (bottleOfMilk.getName().equals(name)
                && bottleOfMilk.getVolume() == volume) {
                    return bottleOfMilk;
                }
            }
        }
        return null;
    }

    public Chocolate getChocolate(String name, int cocoa) {
        for (Product product : products) {
            if (product instanceof Chocolate choco) {
                if (choco.getName().equals(name)
                && choco.getCocoa() == cocoa) {
                    return choco;
                }
            }
        }
        return null;
    }
}
