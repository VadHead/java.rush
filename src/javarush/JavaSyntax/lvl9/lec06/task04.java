package javarush.JavaSyntax.lvl9.lec06;

import java.util.ArrayList;

/*taskKey="com.javarush.task.task09.task0910"\n\nИсключение при работе с коллекциями List
Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
ArrayList<String> list = new ArrayList<String>();
String s = list.get(18);
Требования:
1.	Программа должна выводить сообщение на экран.
2.	В программе должен быть блок try-catch.
3.	Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
4.	Выведенное сообщение должно содержать тип возникшего исключения.
5.	Имеющийся код в методе main не удалять.*/
public class task04 {
    public static void main(String[] args) {
        try {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}