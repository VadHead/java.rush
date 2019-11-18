package javarush.lvl4.lec06;
import java.io.*;
/*taskKey="com.javarush.task.task04.task0424"\n\nТри числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
Требования:
1.	Программа должна считывать числа c клавиатуры.
2.	Программа должна использовать команды System.out.println() или System.out.print().
3.	Программа должна выводить на экран порядковый номер числа, отличного от остальных.
4.	Если все числа разные, ничего не выводить.*/
public class task07 {
    public static void main(String[] args) throws Exception{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first number: ");
        int n1 = Integer.parseInt(buffer.readLine());
        System.out.print("Enter second number: ");
        int n2 = Integer.parseInt(buffer.readLine());
        System.out.print("Enter third number: ");
        int n3 = Integer.parseInt(buffer.readLine());
        if (n1 != n2 && n1 != n3 && n2 == n3) {
            System.out.println("1");
        } else if (n2 != n3 && n2 != n1 && n1 == n3) {
            System.out.println("2");
        } else if (n3 != n1 && n3 != n2 && n1 == n2) {
            System.out.println("3");
        }
    }
}
