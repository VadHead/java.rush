package javarush.lvl7.lec06;
import java.io.*;
import java.util.*;
/*taskKey="com.javarush.task.task07.task0709"
Выражаемся покороче
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
Требования:
1.	Объяви переменную типа список строк и сразу проинициализируй ee.
2.	Программа должна считывать 5 строк с клавиатуры и записывать их в список.
3.	Программа должна выводить самую короткую строку на экран.
4.	Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.*/
public class task03 {
    public static void main(String[] args) throws Exception{
        ArrayList<String> anyString = new ArrayList<String>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            anyString.add(bf.readLine());
        }
        int min = anyString.get(0).length();
        for (int i = 1; i < anyString.size(); i++) {
            if (anyString.get(i).length() < min) min = anyString.get(i).length();
        }
        for (int i = 0; i < anyString.size(); i++) {
            if (anyString.get(i).length() == min) System.out.println(anyString.get(i));
        }
    }
}
