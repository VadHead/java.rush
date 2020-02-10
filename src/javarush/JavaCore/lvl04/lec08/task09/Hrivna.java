package javarush.JavaCore.lvl04.lec08.task09;

public class Hrivna extends Money{
    @Override
    public String getCurrencyName() {
        return "HRN";
    }

    public Hrivna(double amount) {
        super(amount);
    }
}
