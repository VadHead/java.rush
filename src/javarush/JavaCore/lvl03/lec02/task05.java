package javarush.JavaCore.lvl03.lec02;
/*taskKey="com.javarush.task.task13.task1305"\n\nЧетыре ошибки
Исправь 4 ошибки в программе, чтобы она компилировалась.
Требования:
1.	Переменные объявленные в интерфейсе могут иметь только самый широкий уровень доступа(public).
2.	Унаследоваться(extends) можно только от класса, для реализации интерфейсов используется ключевое слово implements.
3.	Класс Hobby должен быть объявлен с модификатором доступа static.
4.	Для доступа к переменной HOBBY нет необходимости создавать объект Dream.
5.	Объявления интерфейсов не изменять.*/
public class task05 {
    public static void main(String[] args) {

        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());

    }

    interface Desire {
    }

    interface Dream {
        public static Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}
