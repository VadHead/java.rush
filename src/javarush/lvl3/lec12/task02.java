package javarush.lvl3.lec12;
/*taskKey="com.javarush.task.task03.task0325"
Финансовые ожидания
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час
Требования:
1.	Программа должна выводить текст.
2.	Программа должна считывать данные с клавиатуры.
3.	Выведенный текст должен содержать введенное число n.
4.	Выведенный тест должен полностью соответствовать заданию.
*/
import java.io.*;
import java.util.*;

public class task02 {
    public static void main(String[] args) throws Exception{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String money = reader.readLine();
    System.out.println("Я буду зарабатывать " + "$"+money + " в час");
    }
}