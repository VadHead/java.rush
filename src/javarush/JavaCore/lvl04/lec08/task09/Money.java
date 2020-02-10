package javarush.JavaCore.lvl04.lec08.task09;

public abstract class Money {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public Money(double amount) {
        this.amount = amount;
    }

    public abstract String getCurrencyName();
}
