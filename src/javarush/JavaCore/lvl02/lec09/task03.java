package javarush.JavaCore.lvl02.lec09;
/*taskKey="com.javarush.task.task12.task1218"\n\nЕсть, летать и двигаться
Есть public интерфейсы CanFly(летать), CanMove(передвигаться), CanEat(есть).
Добавь эти интерфейсы классам Dog(собака), Car(автомобиль), Duck(утка), Airplane(самолет).
Требования:
1.	Класс Solution должен содержать интерфейс CanFly с одним методом fly().
2.	Класс Solution должен содержать интерфейс CanMove с одним методом move().
3.	Класс Solution должен содержать интерфейс CanEat с одним методом eat().
4.	Собака должна уметь передвигаться и есть.
5.	Автомобиль должен уметь передвигаться.
6.	Самолет должен уметь передвигаться и летать.
7.	Утка должна уметь передвигаться, летать и есть.*/
public class task03 {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove, CanEat {
        public void move() {

        }

        public void eat() {

        }
    }

    public class Duck implements CanFly, CanMove, CanEat {
        public void eat() {

        }

        public void fly() {

        }

        public void move() {

        }
    }

    public class Car implements CanMove {
        public void move() {

        }
    }

    public class Airplane implements CanFly, CanMove {
        public void fly() {

        }

        public void move() {

        }
    }
}