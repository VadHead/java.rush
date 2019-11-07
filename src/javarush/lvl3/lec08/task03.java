package javarush.lvl3.lec08;
/*taskKey="com.javarush.task.task03.task0320"
Скромность украшает программиста
Ввести с клавиатуры имя и вывести надпись:
name зарабатывает $5,000. Ха-ха-ха!
Пример: Тимур зарабатывает $5,000. Ха-ха-ха!
Требования:
1.	Программа должна выводить текст.
2.	Программа должна считывать данные с клавиатуры.
3.	Выведенный текст должен содержать введенное имя.
4.	Выведенный тест должен полностью соответствовать заданию.
*/
import java.util.*;
import java.io.*;
public class task03 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");
    }
}
