package seminarExceptionsHomework;

public class PhoneNumberFormatException extends Exception {
    private final long phoneNumber;

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public PhoneNumberFormatException(String message, long phoneNumber) {
        super(message);
        this.phoneNumber = phoneNumber;
    }
}
