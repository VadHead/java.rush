package javarush.lvl7.lec12;
import java.util.*;
import java.io.*;
/*taskKey="com.javarush.task.task07.task0721"\n\nМинимаксы в массивах
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
Требования:
1.	Создай массив целых чисел (int[]) на 20 элементов.
2.	Считай с клавиатуры 20 целых чисел и добавь их в массив.
3.	Найди и выведи через пробел максимальное и минимальное числа.
4.	Используй цикл for.*/
public class task03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numberArr = new int[20];
        for (int i = 0; i < 20; i++) {
            numberArr[i] = Integer.parseInt(reader.readLine());
        }
        int maximum = numberArr[0];
        for (int i = 0; i < numberArr.length; i++) {
            if (maximum < numberArr[i]) maximum = numberArr[i];
        }
        int minimum = numberArr[0];
        for (int i = 0; i < numberArr.length; i++) {
            if (minimum > numberArr[i]) minimum = numberArr[i];
        }
        System.out.print(maximum + " " + minimum);
    }
}
