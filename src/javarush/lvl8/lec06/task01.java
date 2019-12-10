package javarush.lvl8.lec06;
import java.util.*;
/*taskKey="com.javarush.task.task08.task0807"\n\nLinkedList и ArrayList
Нужно создать два списка – LinkedList и ArrayList.
Требования:
1.	Программа не должна выводить текст на экран.
2.	Программа не должна считывать значения с клавиатуры.
3.	Программа должна содержать только три метода.
4.	Метод createArrayList() должен создавать и возвращать список ArrayList.
5.	Метод createLinkedList() должен создавать и возвращать список LinkedList.*/
public class task01 {
    public static Object createArrayList() {
        ArrayList<String> listArr = new ArrayList<String>();
        return listArr;
    }

    public static Object createLinkedList() {
        LinkedList listLink = new LinkedList();
        return listLink;
    }

    public static void main(String[] args) {

    }
}
