package javarush.lvl8.lec03;
import java.util.*;
/*taskKey="com.javarush.task.task08.task0801"\n\nSet из растений
Создать коллекцию Set с типом элементов String.
Добавить в неё 10 строк:
арбуз
банан
вишня
груша
дыня
ежевика
женьшень
земляника
ирис
картофель
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
Требования:
1.	Объяви переменную коллекции Set с типом элементов String и сразу проинициализируй ee.
2.	Программа не должна считывать строки с клавиатуры.
3.	Программа должна добавлять в коллекцию 10 строк, согласно условию.
4.	Программа должна выводить 10 строк из коллекции на экран, каждую с новой строки.*/
public class task01 {
    public static void main(String[] args) {
        Set<String> collection = new HashSet<String>();
        collection.add("арбуз");
        collection.add("банан");
        collection.add("вишня");
        collection.add("груша");
        collection.add("дыня");
        collection.add("ежевика");
        collection.add("женьшень");
        collection.add("земляника");
        collection.add("ирис");
        collection.add("картофель");
        for (String item: collection) {
            System.out.println(item);
        }
    }
}
