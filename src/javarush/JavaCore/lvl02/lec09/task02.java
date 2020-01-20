package javarush.JavaCore.lvl02.lec09;
/*taskKey="com.javarush.task.task12.task1217"\n\nЛететь, бежать и плыть
Напиши public интерфейсы CanFly(летать), CanRun(бежать/ездить), CanSwim(плавать).
Добавить в каждый интерфейс по одному методу.
Требования:
1.	Класс Solution должен содержать интерфейс CanFly.
2.	Класс Solution должен содержать интерфейс CanRun.
3.	Класс Solution должен содержать интерфейс CanSwim.
4.	Интерфейс CanFly должен содержать один метод.
5.	Интерфейс CanRun должен содержать один метод.
6.	Интерфейс CanSwim должен содержать один метод.*/
public class task02 {
    public static void main(String[] args) {

    }
    public interface CanFly{
        void fly();
    }

    public interface CanRun{
        void run();
    }

    public interface CanSwim{
        void swim();
    }
}
