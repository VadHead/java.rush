package javarush.lvl9.lec11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*taskKey="com.javarush.task.task09.task0927"\n\nДесять котов
Есть класс кот – Cat, с полем «имя» (String).
Создать словарь Map<String, Cat> и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех котов и вывести его на экран.
Требования:
1.	Программа не должна считывать данные с клавиатуры.
2.	Метод createMap должен создавать новый объект HashMap&lt;String, Cat&gt;.
3.	Метод createMap должен добавлять в словарь 10 котов в виде &laquo;Имя&raquo;-&laquo;Кот&raquo;.
4.	Метод createMap должен возвращать созданный словарь.
5.	Метод convertMapToSet должен создать и вернуть множество котов, полученных из переданного словаря.
6.	Программа должна вывести всех котов из множества на экран.*/
public class task09 {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> catMap = new HashMap<String, Cat>();
        for (int i = 0; i < 10; i++) {
            String name = "name" + i;
            catMap.put(name, new Cat(name));
        }
        return catMap;
    }
    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> catSet = new HashSet<Cat>(map.values());
        return catSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }
    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}
