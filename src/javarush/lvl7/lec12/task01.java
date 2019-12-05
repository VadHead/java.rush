package javarush.lvl7.lec12;
import java.io.*;
import java.util.*;
/*taskKey="com.javarush.task.task07.task0719"\n\nВывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке. Каждый элемент - с новой строки.
Использовать только цикл for.
Подсказка:
Не забудь импортировать класс: java.util.ArrayList;
Требования:
1.	Объяви переменную типа список целых чисел и сразу проинициализируй ee.
2.	Считай 10 целых чисел с клавиатуры и добавь их в список.
3.	Выведи числа в обратном порядке.
4.	Используй цикл for.*/
public class task01 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbersArr = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            numbersArr.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = numbersArr.size() - 1; i >= 0; i--) {
            System.out.println(numbersArr.get(i));
        }
    }
}
