package javarush.JavaSyntax.lvl8.lec11;

import java.util.HashMap;
import java.util.Map;
/*taskKey="com.javarush.task.task08.task0821"\n\nОднофамильцы и тёзки
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
Требования:
1.	Программа должна выводить текст на экран.
2.	Класс Solution должен содержать только три метода.
3.	Метод createPeopleList() должен создавать и возвращать словарь Map с типом элементов String, String. Кроме того, добавлять в словарь 10 человек.
4.	В методе createPeopleList() должны добавляться люди с одинаковыми фамилиями.
5.	В методе createPeopleList() должны добавляться люди с одинаковыми именами.
6.	Метод printPeopleList() должен выводить на экран всех людей из словаря Map. Каждое значение вывести с новой строки. Фамилия и имя разделены пробелом.
7.	Метод main() должен вызывать метод createPeopleList().
8.	Метод main() должен вызывать метод printPeopleList().*/
public class task03 {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> peopleMap = new HashMap<String, String>();
        peopleMap.put("Gates","Bill");
        peopleMap.put("Jobs","Steve");
        peopleMap.put("Wozniak","Steve");
        peopleMap.put("Mask","Elon");
        peopleMap.put("Presley","Dick");
        peopleMap.put("Loshara","Vasya");
        peopleMap.put("Pupkin","Vasya");
        peopleMap.put("Pupkin","Something");
        peopleMap.put("Oldman","Garry");
        peopleMap.put("Presley","Garry");
        return peopleMap;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
