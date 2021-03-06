package javarush.JavaSyntax.lvl10.lec11;

import java.util.ArrayList;

/*taskKey="com.javarush.task.task10.task1015"
Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
Требования:
1.	Метод createList должен объявлять и инициализировать массив с типом элементов ArrayList<String>.
2.	Метод createList должен возвращать созданный массив.
3.	Метод createList должен добавлять в массив элементы (списки строк). Списки должны быть не пустые.
4.	Программа должна выводить данные на экран.
5.	Метод main должен вызывать метод createList.
6.	Метод main должен вызывать метод printList.*/
public class task08 {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] listOfString = new ArrayList[10];
        for (int i = 0; i < 10; i++) {
            listOfString[i] = new ArrayList<String>();
            listOfString[i].add("String# > " + i);
        }
        return listOfString;
    }
    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
