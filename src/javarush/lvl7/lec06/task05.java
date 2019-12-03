package javarush.lvl7.lec06;
import java.io.*;
import java.util.*;
/*taskKey="com.javarush.task.task07.task0711"
Удалить и вставить
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
Требования:
1.	Объяви переменную типа список строк и сразу проинициализируй ee.
2.	Программа должна считывать 5 строк с клавиатуры.
3.	Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4.	Программа должна выводить список на экран, каждое значение с новой строки.*/
public class task05 {
    public static void main(String[] args) throws Exception{
        ArrayList<String> listArr = new ArrayList<String>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            listArr.add(bf.readLine());
        }
        for (int i = 0; i < 13; i++) {
            listArr.add(0, listArr.get(listArr.size() - 1));
            listArr.remove(listArr.size() - 1);
        }
        for (int i = 0; i < listArr.size(); i++) {
            System.out.println(listArr.get(i));
        }
    }
}
