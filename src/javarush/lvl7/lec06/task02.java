package javarush.lvl7.lec06;
import java.util.*;
import java.io.*;
/*taskKey="com.javarush.task.task07.task0708"
Самая длинная строка
1. Проинициализируй список строк strings.
2. Считай с клавиатуры 5 строк и добавь в этот список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
Требования:
1.	Инициализируй существующее поле strings класса Solution новым ArrayList<>
2.	Программа должна считывать 5 строк с клавиатуры и записывать их в список strings.
3.	Программа должна выводить самую длинную строку на экран.
4.	Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.*/
public class task02 {
    private static ArrayList<String> strings;
    public static void main(String[] args) throws Exception{
        strings = new ArrayList<String>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(bf.readLine());
        }
        int max = 0;
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > max) max = strings.get(i).length();
            }
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == max)
                System.out.println(strings.get(i));
        }

    }
}
