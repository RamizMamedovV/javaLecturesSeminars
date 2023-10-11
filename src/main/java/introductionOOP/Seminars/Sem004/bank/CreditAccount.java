package introductionOOP.Seminars.Sem004.bank;

public class CreditAccount<T extends PersonData> extends Account<T>{
    public CreditAccount(T data, double amount) {
        super(data, amount);
    }
}
