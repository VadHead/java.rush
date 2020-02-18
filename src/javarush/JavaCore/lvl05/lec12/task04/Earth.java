package javarush.JavaCore.lvl05.lec12.task04;

public class Earth implements Planet {
    private static Earth instance;

    public static Earth getInstance() {
        if (instance == null) instance = new Earth();
        return instance;
    }

    private Earth() {

    }
}
