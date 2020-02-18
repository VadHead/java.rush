package javarush.JavaCore.lvl05.lec12.task04;

public class Moon implements Planet {
    private static Moon instance;

    public static Moon getInstance() {
        if (instance == null) instance = new Moon();
        return instance;
    }

    private Moon(){

    }
}
