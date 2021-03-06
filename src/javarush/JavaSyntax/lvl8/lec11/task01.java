package javarush.JavaSyntax.lvl8.lec11;

import java.util.HashSet;
import java.util.Set;
/*taskKey="com.javarush.task.task08.task0819"\n\nSet из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
Требования:
1.	Программа должна выводить текст на экран.
2.	Внутри класса Solution должен быть public static класс Cat с конструктором по умолчанию.
3.	Метод createCats() класса Solution должен возвращать множество (Set) содержащее 3 кота.
4.	Метод printCats() класса Solution должен вывести на экран всех котов из множества. Каждый кот с новой строки.
5.	Метод main() должен один раз вызывать метод createCats().
6.	Метод main() должен вызывать метод printCats().
7.	Метод main() должен удалять одного кота из множества котов.*/
public class task01 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        for (Object item : cats) {
            cats.remove(item);
            break;
        }
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> catsSet = new HashSet<Cat>();
        Cat vasya = new Cat();
        catsSet.add(vasya);
        Cat thomas = new Cat();
        catsSet.add(thomas);
        Cat pusha = new Cat();
        catsSet.add(pusha);
        return catsSet;
    }

    public static void printCats(Set<Cat> cats) {
        for (Object cat : cats) {
            System.out.println(cat.toString());
        }
    }

    public static class Cat {
        public Cat() {

        }
    }
}
