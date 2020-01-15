package javarush.JavaSyntax.lvl7.lec06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*taskKey="com.javarush.task.task07.task0710"
В начало списка
1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
Требования:
1.	Объяви переменную типа список строк и сразу проинициализируй ee.
2.	Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3.	Программа должна добавлять строки в начало списка.
4.	Программа должна выводить список на экран, каждое значение с новой строки.*/
public class task04 {
    public static void main(String[] args) throws  Exception{
        ArrayList<String> stringArr = new ArrayList<String>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            stringArr.add(stringArr.size() - i, bf.readLine());
        }
        for (int i = 0; i < stringArr.size(); i++) {

            System.out.println(stringArr.get(i));
        }
    }
}
