package javarush.JavaCore.lvl04.lec06.task01;

public class UkrainianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {

        return 20;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
