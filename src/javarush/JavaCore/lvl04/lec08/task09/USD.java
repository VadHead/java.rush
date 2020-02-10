package javarush.JavaCore.lvl04.lec08.task09;

public class USD extends Money{
    @Override
    public String getCurrencyName() {
        return "USD";
    }

    public USD(double amount) {
        super(amount);
    }
}
