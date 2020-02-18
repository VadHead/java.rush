package javarush.JavaCore.lvl05.lec12.task04;

public class Sun implements Planet {
    private static Sun instance;

    public static Sun getInstance() {
        if (instance == null) instance = new Sun();
        return instance;
    }

    private Sun() {

    }
}
