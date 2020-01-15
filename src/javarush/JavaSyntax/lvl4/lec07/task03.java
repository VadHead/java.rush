package javarush.JavaSyntax.lvl4.lec07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*taskKey="com.javarush.task.task04.task0428"\n\nПоложительное число
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.
Примеры:
а) при вводе чисел
-4
6
6
получим вывод
2
б) при вводе чисел
-6
-6
-3
получим вывод
0
в) при вводе чисел
0
1
2
получим вывод
2
Требования:
1.	Программа должна считывать числа c клавиатуры.
2.	Программа должна выводить число на экран.
3.	Программа должна выводить количество положительных чисел в исходном наборе.
4.	Если положительных чисел нет, программа должна вывести &quot;0&quot;.
5.	Учти, что &quot;0&quot; не относится ни к положительным, ни к отрицательным числам.
*/
public class task03 {
    public static void main(String[] args) throws Exception{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first number: ");
        int n1 = Integer.parseInt(buffer.readLine());
        System.out.print("Enter second number: ");
        int n2 = Integer.parseInt(buffer.readLine());
        System.out.print("Enter third number: ");
        int n3 = Integer.parseInt(buffer.readLine());
        int count = 0;
        if (n1 > 0){
            count++;
        } if(n2 > 0){
            count++;
        } if (n3 > 0){
            count++;
        }
        System.out.println(count);
    }
}