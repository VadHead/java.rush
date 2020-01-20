package javarush.JavaCore.lvl02.lec09;
/*taskKey="com.javarush.task.task12.task1216"\n\nЛетать охота
Напиши свой public интерфейс CanFly(летать). Добавь в него два метода.
Требования:
1.	Класс Solution должен содержать интерфейс CanFly.
2.	Интерфейс CanFly должен быть публичным.
3.	Интерфейс CanFly должен содержать два метода.
4.	Интерфейс CanFly не должен иметь родителя.*/
public class task01 {
    public static void main(String[] args) {

    }
    public interface CanFly{
        void takeOff();
        void landing();
    }
}
