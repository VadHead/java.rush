package javarush.lvl7.lec09;
import java.util.*;
import java.io.*;
/*taskKey="com.javarush.task.task07.task0714"\n\nСлова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
Требования:
1.	Объяви переменную типа ArrayList&lt;String&gt; (список строк) и сразу проинициализируй ee.
2.	Считай 5 строк с клавиатуры и добавь их в список.
3.	Удали третий элемент списка.
4.	Выведи элементы на экран, каждый с новой строки.
5.	Порядок вывода должен быть обратный.*/
public class task02 {
    public static void main(String[] args) throws Exception{
        ArrayList<String> stringArr = new ArrayList<String>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            stringArr.add(bf.readLine());
        }
        stringArr.remove(2);
        for (int i = stringArr.size() - 1; i >= 0; i--) {
            System.out.println(stringArr.get(i));
        }
    }
}
