package javarush.JavaCore.lvl02.lec09;
/*taskKey="com.javarush.task.task12.task1219"\n\nСоздаем человека
Есть public интерфейсы CanFly(летать), CanRun(бежать/ездить), CanSwim(плавать).
Добавь эти интерфейсы классам Human(человек), Duck(утка), Penguin(пингвин), Airplane(самолет).
Требования:
1.	Класс Solution должен содержать интерфейс CanFly с одним методом fly().
2.	Класс Solution должен содержать интерфейс CanRun с одним методом run().
3.	Класс Solution должен содержать интерфейс CanSwim с одним методом swim().
4.	Человек должен уметь бегать и плавать.
5.	Утка должна уметь летать, плавать и бегать.
6.	Пингвин должен уметь плавать и бегать.
7.	Самолет должен уметь летать и ездить.*/
public class task04 {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public class Human implements CanRun, CanSwim {
        public void run() {

        }

        public void swim() {

        }
    }

    public class Duck implements CanSwim, CanFly, CanRun {
        public void swim() {

        }

        public void run() {

        }

        public void fly() {

        }
    }

    public class Penguin implements CanSwim, CanRun {
        public void run() {

        }

        public void swim() {

        }
    }

    public class Airplane implements CanFly, CanRun {
        public void fly() {

        }

        public void run() {

        }
    }
}
