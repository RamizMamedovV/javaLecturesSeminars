package seminarExceptionsHomework;

public class ArrayLengthException extends RuntimeException{

    int length;

    public int getLength() {
        return length;
    }

    public ArrayLengthException(String message, int length) {
        super(message);
        this.length = length;
    }
}
