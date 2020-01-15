package javarush.JavaSyntax.lvl4.lec07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*taskKey="com.javarush.task.task04.task0429"\n\nПоложительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Примеры:
а) при вводе чисел
2
5
6
получим вывод
количество отрицательных чисел: 0
количество положительных чисел: 3
б) при вводе чисел
-2
-5
6
получим вывод
количество отрицательных чисел: 2
количество положительных чисел: 1
Требования:
1.	Программа должна считывать числа c клавиатуры.
2.	Программа должна выводить текст на экран.
3.	Программа должна выводить количество отрицательных чисел в исходном наборе.
4.	Программа должна выводить количество положительных чисел в исходном наборе.
5.	Если отрицательных чисел нет, программа должна вывести &quot;количество отрицательных чисел: 0&quot;.
6.	Если положительных чисел нет, программа должна вывести &quot;количество положительных чисел: 0&quot;.
7.	Учесть, что число &quot;0&quot; не относится ни к положительным, ни к отрицательным числам.*/
public class task04 {
    public static int countPos = 0, countNeg =0;

    public static void main(String[] args) throws Exception{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first number: ");
        int n1 = Integer.parseInt(buffer.readLine());
        System.out.print("Enter second number: ");
        int n2 = Integer.parseInt(buffer.readLine());
        System.out.print("Enter third number: ");
        int n3 = Integer.parseInt(buffer.readLine());

        count(n1);
        count(n2);
        count(n3);

        System.out.println("количество отрицательных чисел: " + countNeg);
        System.out.println("количество положительных чисел: " + countPos);
    }
    public static void count (int n){

        if (n > 0) {
            task04.countPos++;
        } else if (n < 0) {
            task04.countNeg++;
        }
    }
}
