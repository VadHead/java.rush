package javarush.JavaSyntax.lvl4.lec04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*taskKey="com.javarush.task.task04.task0417"
Существует ли пара?
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Примеры:
а) при вводе чисел
1
2
2
получим вывод
2 2
б) при вводе чисел
2
2
2
получим вывод
2 2 2
Требования:
1.	Программа должна считывать числа c клавиатуры.
2.	Программа должна содержать System.out.println() или System.out.print()
3.	Если два числа равны между собой, необходимо вывести числа на экран.
4.	Если все три числа равны между собой, необходимо вывести все три.
5.	Если нет равных чисел, ничего не выводить.
*/
public class task10 {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ведите число а: ");
        int a = Integer.parseInt(buffer.readLine());
        System.out.print("Ведите число b: ");
        int b = Integer.parseInt(buffer.readLine());
        System.out.print("Ведите число c: ");
        int c = Integer.parseInt(buffer.readLine());
        if (a == b && b == c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a == b) {
            System.out.println(a + " " + b);
        } else if (b == c) {
            System.out.println(b + " " + c);
        } else if (a == c) {
            System.out.println(a + " " + c);
        }
    }
    }

