package javarush.lvl4.lec06;
import java.io.*;
/*taskKey="com.javarush.task.task04.task0425"\n\nЦель установлена!
Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
для первой четверти a>0 и b>0;
для второй четверти a<0 и b>0;
для третьей четверти a<0 и b<0;
для четвертой четверти a>0 и b<0.
Пример для чисел 4 6:
1
Пример для чисел -6 -6:
3
Требования:
1.	Программа должна считывать числа c клавиатуры.
2.	Программа должна использовать команду System.out.println() или System.out.print().
3.	Если точка находится в первой координатной четверти, вывести &quot;1&quot;.
4.	Если точка находится в второй координатной четверти, вывести &quot;2&quot;.
5.	Если точка находится в третей координатной четверти, вывести &quot;3&quot;.
6.	Если точка находится в четвёртой координатной четверти, вывести &quot;4&quot;.*/
public class task08 {
    public static void main(String[] args) throws Exception{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first number: ");
        int a = Integer.parseInt(buffer.readLine());
        System.out.print("Enter second number: ");
        int b = Integer.parseInt(buffer.readLine());
        if (a > 0 && b > 0) {
            System.out.println("1");
        } else if (a < 0 && b > 0) {
            System.out.println("2");
        } else if (a < 0 && b < 0) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    }
}
