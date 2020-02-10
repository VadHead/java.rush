package javarush.JavaCore.lvl04.lec08.task09;

public class Ruble extends Money{
    @Override
    public String getCurrencyName() {
        return "RUB";
    }

    public Ruble(double amount) {
        super(amount);
    }
}
