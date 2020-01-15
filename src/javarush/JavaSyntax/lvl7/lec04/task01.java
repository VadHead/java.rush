package javarush.JavaSyntax.lvl7.lec04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*taskKey="com.javarush.task.task07.task0701"
Массивный максимум
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
Требования:
1.	Метод initializeArray должен создавать массив из 20 целых чисел.
2.	Метод initializeArray должен считать 20 чисел и вернуть их в виде массива.
3.	Метод max должен возвращать максимальный элемент из переданного массива.
4.	Метод main изменять нельзя.*/
public class task01 {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] numbersArray = new int[20];
        for (int i = 0; i < numbersArray.length; i++) {
            int number = Integer.parseInt(bf.readLine());
            numbersArray[i] = number;
        }
        return numbersArray;
    }
    public static int max(int[] array) {
        Arrays.sort(array);
        int max = array[19];
        return max;
    }
}
