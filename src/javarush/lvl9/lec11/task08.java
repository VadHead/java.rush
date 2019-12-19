package javarush.lvl9.lec11;

import java.util.ArrayList;

/*taskKey="com.javarush.task.task09.task0926"\n\nСписок из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
Требования:
1.	Программа не должна считывать данные с клавиатуры.
2.	Метод createList должен объявлять и инициализировать переменную типа ArrayList&lt;int[]&gt;.
3.	Метод createList должен возвращать созданный список.
4.	Метод createList должен добавлять в список 5 элементов.
5.	Каждый элемент в списке должен быть массивом чисел. Длина первого должна быть 5 элементов, второго - 2, следующих - 4, 7, 0 соответственно.
6.	Программа должна выводить на экран элементы всех массивов из списка. Каждый элемент с новой строки.*/
public class task08 {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> arrayList = new ArrayList<int[]>();
        arrayList.add(new int[]{1,1,1,1,1});
        arrayList.add(new int[]{9,9});
        arrayList.add(new int[]{8,8,8,8});
        arrayList.add(new int[]{7,7,7,7,7,7,7});
        arrayList.add(new int[]{});
        return arrayList;
    }
    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
