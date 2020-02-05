package javarush.JavaCore.lvl04.lec06.task01;

public class MoldovanHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 9;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

}
