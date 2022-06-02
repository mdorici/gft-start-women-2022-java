package entities;

public class SavingsAccount extends Account {

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance) {
        super(number, holder, balance);
    }

    public Double income() {
        return balance * 0.05;
    }
    public String toString() {
        return String.format(getNumber() + ", " + getHolder() + ", " + balance + " ," + income());
    }
}
