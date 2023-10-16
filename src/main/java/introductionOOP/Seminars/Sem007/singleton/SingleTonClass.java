package introductionOOP.Seminars.Sem007.singleton;

public class SingleTonClass {

    static SingleTonClass singleTonClass;

    public static SingleTonClass gitInstance(int x, String str, boolean bool) {
        if (singleTonClass == null) {
            //TODO: Получим настройки, проинициализируем поля объекта

            return singleTonClass = new SingleTonClass(x, str, bool);
        }
        return singleTonClass;
    }

    private SingleTonClass(int x, String str, boolean bool) {
        this.x = x;
        this.str = str;
        this.bool = bool;
    }

    public int getX() {
        return x;
    }

    public String getStr() {
        return str;
    }

    public boolean isBool() {
        return bool;
    }

    @Override
    public String toString() {
        return "SingleTonClass{" +
                "x=" + x +
                ", str='" + str + '\'' +
                ", bool=" + bool +
                '}';
    }

    private final int x;
    private String str;
    private boolean bool;

}
