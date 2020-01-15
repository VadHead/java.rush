package javarush.JavaSyntax.lvl7.lec12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*taskKey="com.javarush.task.task07.task0728"\n\nВ убывающем порядке
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
Требования:
1.	Программа должна считывать 20 целых чисел с клавиатуры.
2.	Программа должна выводить 20 чисел.
3.	В классе Solution должен быть метод public static void sort(int[] array).
4.	Метод main должен вызывать метод sort.
5.	Метод sort должен сортировать переданный массив по убыванию.*/
public class task10 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);
        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
        int tempF, tempL;
        for (int i = 0; i < array.length / 2; i++) {
            tempF = array[i];
            tempL = array[array.length - i - 1];
            array[i] = tempL;
            array[array.length - i - 1] = tempF;
        }
        }
    }

