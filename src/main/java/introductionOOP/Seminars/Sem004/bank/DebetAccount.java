package introductionOOP.Seminars.Sem004.bank;

public class DebetAccount<T extends PersonData> extends Account<T>{
    public DebetAccount(T data, double amount) {
        super(data, amount);
    }
}
