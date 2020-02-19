package javarush.JavaCore.lvl05.lec12.task10;

public class Plane implements CanFly{

    int passengersNumber;

    @Override
    public void fly() {

    }

    public Plane(int n) {
        this.passengersNumber = n;
    }
}
