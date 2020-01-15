package javarush.JavaSyntax.lvl5.lec12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*taskKey="com.javarush.task.task05.task0532"
Задача по алгоритмам
Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
Требования:
1.	Программа должна считывать числа с клавиатуры.
2.	Программа должна выводить число на экран.
3.	В классе должен быть метод public static void main.
4.	Нельзя добавлять новые методы в класс Solution.
5.	Программа должна выводить на экран максимальное из введенных N чисел.*/
public class task08 {
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int maximum, inputN;
        int numberQ = Integer.parseInt(bf.readLine());
        if (numberQ <= 0) return;

        maximum = Integer.parseInt(bf.readLine());

        for (int i = 0; i < numberQ-1 ; i++) {
            inputN = Integer.parseInt(bf.readLine());
            maximum = inputN > maximum ? inputN : maximum;
        }

        System.out.println(maximum);
    }
}
