package javarush.lvl7.lec09;
import java.io.*;
import java.util.*;
/*taskKey="com.javarush.task.task07.task0717"\n\nУдваиваем слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу
"альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма".
3. Выведи результат на экран, каждое значение с новой строки.
Требования:
1.	Объяви переменную типа список строк и сразу проинициализируй ee.
2.	Считай 10 строк с клавиатуры и добавь их в список.
3.	Метод doubleValues должен удваивать элементы списка по принципу &quot;альфа&quot;, &quot;бета&quot;, &quot;гамма&quot; -&gt; &quot;альфа&quot;, &quot;альфа&quot;, &quot;бета&quot;, &quot;бета&quot;, &quot;гамма&quot;, &quot;гамма&quot;.
4.	Выведи получившийся список на экран, каждый элемент с новой строки.*/
public class task05 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(bf.readLine());
        }
        ArrayList<String> result = doubleValues(list);

        for (String s : result) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i += 2) {
            list.add(i + 1, list.get(i));
        }
        return list;
    }
}
