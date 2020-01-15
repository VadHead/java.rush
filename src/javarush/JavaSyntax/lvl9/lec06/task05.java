package javarush.JavaSyntax.lvl9.lec06;
import java.util.HashMap;
/*taskKey="com.javarush.task.task09.task0911"\n\nИсключение при работе с коллекциями Map
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
HashMap<String, String> map = new HashMap<String, String>(null);
map.put(null, null);
map.remove(null);
Требования:
1.	Программа должна выводить сообщение на экран.
2.	В программе должен быть блок try-catch.
3.	Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
4.	Выведенное сообщение должно содержать тип возникшего исключения.
5.	Имеющийся код в методе main не удалять.*/
public class task05 {
    public static void main(String[] args) {
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        }catch (NullPointerException e){
            System.out.println(e);
        }
    }
}
