package seminarExceptionsHomework;

public class NameFormatException extends Exception {

    private final String name;

    public String getName() {
        return name;
    }

    public NameFormatException(String message, String name) {
        super(message);
        this.name = name;
    }
}
