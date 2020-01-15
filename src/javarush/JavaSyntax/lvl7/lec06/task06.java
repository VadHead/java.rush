package javarush.JavaSyntax.lvl7.lec06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*taskKey="com.javarush.task.task07.task0712"
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
Требования:
1.	Объяви переменную типа список строк и сразу проинициализируй ee.
2.	Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3.	Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4.	Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.*/
public class task06 {
    public static void main(String[] args) throws Exception{
        ArrayList<String> listArr = new ArrayList<String>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            listArr.add(bf.readLine());
        }
        int max = 0;
        int longIndex = 0;
        for (int i = 0; i < listArr.size(); i++) {
            if (listArr.get(i).length() > max) {
                max = listArr.get(i).length();
                longIndex = i;
            }
        }

        int min = listArr.get(0).length();
        int shortIndex = 0;
        for (int i = 1; i < listArr.size(); i++) {
            if (listArr.get(i).length() < min) {
                min = listArr.get(i).length();
                shortIndex = i;
            }
        }
        if (longIndex < shortIndex) System.out.println(listArr.get(longIndex));
        else System.out.println(listArr.get(shortIndex));
    }
}
