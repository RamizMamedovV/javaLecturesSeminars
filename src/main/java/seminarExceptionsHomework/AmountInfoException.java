package seminarExceptionsHomework;

public class AmountInfoException extends RuntimeException{

    int length;

    public int getLength() {
        return length;
    }

    public AmountInfoException(String message, int length) {
        super(message);
        this.length = length;
    }
}
