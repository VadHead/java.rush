package javarush.lvl8.lec06;
import java.util.*;
/*taskKey="com.javarush.task.task08.task0811"\n\nКвартет «Методы»
Реализовать 4 метода. Каждый из них должен возвращать список, который лучше всего подходит для выполнения данных операций (быстрее всего справится с большим количеством операций). Ничего измерять не нужно.
Требования:
1.	Программа не должна выводить текст на экран.
2.	Класс Solution должен содержать только 5 методов.
3.	Метод getListForGet должен возвращать список, который лучше всего подходит для операции взятия элемента.
4.	Метод getListForSet должен возвращать список, который лучше всего подходит для установки значения элемента.
5.	Метод getListForAddOrInsert должен возвращать список, который лучше всего подходит для операций добавления или вставки элемента.
6.	Метод getListForRemove должен возвращать список, который лучше всего подходит для операции удаления элемента.*/
public class task05 {
    public static List getListForGet() {
        ArrayList<String> listArr = new ArrayList<String>() ;
        return listArr;
    }

    public static List getListForSet() {
        ArrayList<String> listArr = new ArrayList<String>() ;
        return listArr;
    }
    public static List getListForAddOrInsert() {
        LinkedList listLink = new LinkedList();
        return listLink;
    }

    public static List getListForRemove() {
        LinkedList listLink = new LinkedList();
        return listLink;
    }

    public static void main(String[] args) {

    }
}
