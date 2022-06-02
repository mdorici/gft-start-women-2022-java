package entities;

public class CurrentAccount extends Account {

    public CurrentAccount() {
        super();
    }

    public CurrentAccount(Integer number, String holder, Double balance) {
        super(number, holder, balance);
    }

    public Double income() {
        return balance * 0.03;
    }

    public String toString() {
        return String.format(getNumber() + ", " + getHolder() + ", " + balance + " ," + income());
    }
}
