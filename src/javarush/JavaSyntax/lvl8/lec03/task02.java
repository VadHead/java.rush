package javarush.JavaSyntax.lvl8.lec03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/*taskKey="com.javarush.task.task08.task0802"\n\nHashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт, дыня - овощ, ежевика - куст, жень-шень - корень, земляника - ягода,
 ирис - цветок, картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель - клубень
Требования:
1.	Объяви переменную коллекции HashMap с типом элементов String, String и сразу проинициализируй ee.
2.	Программа не должна считывать значения с клавиатуры.
3.	Программа должна добавлять в коллекцию 10 пар строк, согласно условию.
4.	Программа должна выводить содержимое коллекции на экран, каждую пару с новой строки.*/
public class task02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
  /*      while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String key =  pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }*/
        for (Map.Entry<String, String> pair: map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
