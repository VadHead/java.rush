package javarush.lvl7.lec12;
import java.io.*;
import java.util.*;
/*taskKey="com.javarush.task.task07.task0720"\n\nПерестановочка подоспела
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
Примечание: запрещено создавать больше одного списка.
Требования:
1.	Объяви переменную типа список строк и сразу проинициализируй ee.
2.	Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
3.	Переставить M первых строк в конец списка.
4.	Выведи список на экран, каждое значение с новой строки.*/
public class task02 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int M = Integer.parseInt(bf.readLine());
        ArrayList<String> stringArr = new ArrayList<String>();
        for (int i = 0; i < N; i++) {
            stringArr.add(bf.readLine());
        }
        for (int i = 0; i < M;i++) {
            String temp = stringArr.get(0);
            stringArr.remove(0);
            stringArr.add(temp);
        }
        stringArr.forEach(item -> System.out.println(item));
    }
}
