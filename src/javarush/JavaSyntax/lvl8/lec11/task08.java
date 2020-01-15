package javarush.JavaSyntax.lvl8.lec11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
/*taskKey="com.javarush.task.task08.task0826"\n\nПять победителей
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел. Каждое значение с новой строки.
Требования:
1.	Программа должна выводить числа на экран.
2.	Программа должна считывать значения с клавиатуры.
3.	Класс Solution должен содержать два метода.
4.	Метод sort() должен сортировать массив чисел от большего к меньшему.
5.	Метод main() должен вызывать метод sort().
6.	Программа должна выводить пять наибольших чисел массива. Каждое значение с новой строки.*/
public class task08 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
        int temp;
        for (int i = 0; i < array.length/2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
}
