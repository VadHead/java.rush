package javarush.JavaSyntax.lvl6.lec11.task02;

import java.util.ArrayList;
/*taskKey="com.javarush.task.task06.task0614"\n\nСтатические коты
1. В классе Cat добавь публичную статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
Требования:
1.	Добавь в класс Cat публичную статическую переменную cats (ArrayList&lt;Cat&gt;).
2.	Переменная cats должна быть проинициализирована.
3.	Метод main должен создавать 10 объектов Cat (используй конструктор Cat()).
4.	Метод main должен добавить всех созданных котов в переменную cats.
5.	Метод printCats должен выводить всех котов из переменной cats на экран. Каждого с новой строки.*/
public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public Cat() {
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Cat.cats.add(new Cat());
        }
        printCats();
    }

    public static void printCats() {
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(Cat.cats.get(i));
        }
    }
}
