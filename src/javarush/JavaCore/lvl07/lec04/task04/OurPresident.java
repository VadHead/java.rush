package javarush.JavaCore.lvl07.lec04.task04;

public class OurPresident {
    private static OurPresident president;

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }

    static {
        synchronized (OurPresident.class){
           president = new OurPresident();
        }
    }

}
