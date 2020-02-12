package javarush.JavaCore.lvl05.lec02;
/*taskKey="com.javarush.task.task15.task1501"\n\nООП - Расставить интерфейсы
1. Добавь все возможные интерфейсы из Movable, Sellable, Discountable в класс Clothes.
2. Реализуй их методы.
Требования:
1.	Класс Clothes должен поддерживать интерфейс Movable.
2.	Класс Clothes должен поддерживать интерфейс Sellable.
3.	Класс Clothes должен поддерживать интерфейс Discountable.
4.	В классе Clothes должен быть реализован метод isMovable.
5.	В классе Clothes должен быть реализован метод getAllowedAction без параметров.
6.	В классе Clothes должен быть реализован метод getAllowedAction с одним параметром типа String.*/
public class task01 {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable, Sellable, Discountable{
        @Override
        public boolean isMovable() {
            return true;
        }

        @Override
        public Object getAllowedAction() {
            return null;
        }

        @Override
        public Object getAllowedAction(String name) {
            return "Test";
        }
    }
}
