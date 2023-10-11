package introductionOOP.Seminars.Sem004.bank;

public class Transaction<T extends Account> {

    private final T from;
    private final T to;
    private final double amount;

    public Transaction(T from, T to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void execute() {
        if (from.getAmount() >= amount) {
            from.setAmount(from.getAmount() - amount);
            to.setAmount(to.getAmount() + amount);
            System.out.println("Произведён перевод: ");
            System.out.println("from " + from);
            System.out.println("to " + to);
        }
        else {
            System.out.println("Недостаточно средств на счёте");
        }
    }

}
