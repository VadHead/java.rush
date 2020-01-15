package javarush.JavaSyntax.lvl7.lec04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*taskKey="com.javarush.task.task07.task0706"\n\nУлицы и дома
1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома, а значение - число жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными — на другой. Выяснить, на какой стороне улицы проживает больше жителей.
4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."
Примечание: дом с порядковым номером 0 считать четным.
Требования:
1.	Программа должна создавать массив на 15 целых чисел.
2.	Программа должна считывать числа для массива с клавиатуры.
3.	Программа должна вывести сообщение &quot;В домах с нечетными номерами проживает больше жителей.&quot;, если сумма нечетных элементов массива больше суммы четных.
4.	Программа должна вывести сообщение &quot;В домах с четными номерами проживает больше жителей.&quot;, если сумма четных элементов массива больше суммы нечетных.*/
public class task06 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] numbersArr = new int[15];
        for (int i = 0; i < numbersArr.length; i++) {
            numbersArr[i] = Integer.parseInt(bf.readLine());
        }
        int countEven = 0, countOdd = 0;

        for (int i = 0; i < numbersArr.length; i++) {
            if (i == 0 || i % 2 == 0) countEven += numbersArr[i];
            else countOdd += numbersArr[i];
        }
        if (countEven > countOdd) System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
