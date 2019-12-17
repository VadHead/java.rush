package javarush.lvl9.lec06;
/*taskKey="com.javarush.task.task09.task0908"\n\nИсключение при работе со строками
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
String s = null;
String m = s.toLowerCase();
Требования:
1.	Программа должна выводить сообщение на экран.
2.	В программе должен быть блок try-catch.
3.	Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
4.	Выведенное сообщение должно содержать тип возникшего исключения.
5.	Имеющийся код в методе main не удалять.*/
public class task02 {
    public static void main(String[] args) {
        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            String exc = e.toString();
            System.out.println(exc);
        }
    }
}
