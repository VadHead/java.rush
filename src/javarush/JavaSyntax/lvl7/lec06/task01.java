package javarush.JavaSyntax.lvl7.lec06;

import java.util.ArrayList;

/*taskKey="com.javarush.task.task07.task0707"
Что за список такой?
1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
Примечание:
Добавляй строки в список только после того, как список инициализирован.
Требования:
1.	Программа не должна ничего считывать с клавиатуры.
2.	Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
3.	Программа должна добавить 5 любых строк в список.
4.	Программа должна вывести размер списка на экран.
5.	Программа должна вывести содержимое списка на экран, каждое значение с новой строки.*/
public class task01 {
    public static void main(String[] args) {
        ArrayList<String> sList = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
         sList.add("String: " + i);
        }
        System.out.println(sList.size());
        for (int i = 0; i < sList.size(); i++) {
            System.out.println(sList.get(i));
        }
    }
}
