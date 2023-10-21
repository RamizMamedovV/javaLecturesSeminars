package exceptions.Sem001;

public class CustomArraySizeException  extends RuntimeException{

    private int length1;
    private int length2;


    public int getLength1() {
        return length1;
    }

    public int getLength2() {
        return length2;
    }

    public CustomArraySizeException(String message, int lenght1, int length2){
        super(message);
        this.length1 = lenght1;
        this.length2 = length2;
    }

}
