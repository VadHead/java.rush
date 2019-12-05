package javarush.lvl7.lec09;
import java.util.*;
import java.io.*;
/*taskKey="com.javarush.task.task07.task0718"\n\nПроверка на упорядоченность
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
Требования:
1.	Объяви переменную типа список строк и сразу проинициализируй ee.
2.	Считай 10 строк с клавиатуры и добавь их в список.
3.	Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
4.	Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран индекс первого элемента, нарушающего такую упорядоченность.*/
public class task06 {
    public static void main(String[] args) throws Exception{
        ArrayList<String> listArr = new ArrayList<String>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            listArr.add(bf.readLine());
        }
        for (int i = 1; i < listArr.size(); i++) {
            if (listArr.get(i-1).length() < listArr.get(i).length()) ;
            else {System.out.println(i);
            return;}
        }
    }
}
