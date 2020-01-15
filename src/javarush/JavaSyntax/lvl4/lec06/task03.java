package javarush.JavaSyntax.lvl4.lec06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*taskKey="com.javarush.task.task04.task0420"
Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания. Выведенные числа должны быть разделены пробелом.
Требования:
1.	Программа должна считывать числа c клавиатуры.
2.	Программа должна выводить числа на экран.
3.	Выведенные числа должны быть разделены пробелом.
4.	Программа должна выводить числа в порядке убывания.*/
public class task03 {
    public static void main(String[] args) throws Exception{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first number: ");
        int n1 = Integer.parseInt(buffer.readLine());
        System.out.print("Enter second number: ");
        int n2 = Integer.parseInt(buffer.readLine());
        System.out.print("Enter third number: ");
        int n3 = Integer.parseInt(buffer.readLine());
        int m1 = 0, m2 = 0, m3 = 0;

        if (n1 <= n2 && n1 <= n3) {
            m1 = n1;
            if (n2 <= n3) {
                m2 = n2;
                m3 = n3;
            } else {
                m2 = n3;
                m3 = n2;
            }
        }
        if (n2 <= n1 && n2 <= n3) {
            m1 = n2;
            if (n1 <= n3) {
                m2 = n1;
                m3 = n3;
            } else {
                m2 = n3;
                m3 = n1;
            }
        }
        if (n3 <= n2 && n3 <= n1) {
            m1 = n3;
            if (n1 <= n2) {
                m2 = n1;
                m3 = n2;
            } else {
                m2 = n2;
                m3 = n1;
            }
        }

       System.out.print(m3 + " " + m2 + " " + m1);
    }
}
