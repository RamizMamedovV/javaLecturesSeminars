package seminarsJava001.seminar6.seminar6;

/*
Подумать над структурой класса Ноутбук для магазина техники -
выделить поля и методы. Реализовать в java.
Создать множество ноутбуков (Set).
Написать метод, который будет запрашивать у пользователя критерий
(или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев -
сохранить параметры фильтрации можно также в Map.
 */
public class Laptop {
    private Brand brand;
    private Color color;

    public Laptop(Brand brand, Color color) {
        this.brand = brand;
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.format("Laptop brand: %s, color: %s", brand, color);
    }
}
