package javarush.JavaCore.lvl04.lec06.task01;

public class BelarusianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {

        return 10;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
