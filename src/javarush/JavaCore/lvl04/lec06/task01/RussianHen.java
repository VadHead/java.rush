package javarush.JavaCore.lvl04.lec06.task01;

public class RussianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {

        return 0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
