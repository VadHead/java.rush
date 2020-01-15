package javarush.JavaSyntax.lvl4.lec13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*taskKey="com.javarush.task.task04.task0436"\n\nРисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
Требования:
1.	Программа должна считывать два числа c клавиатуры.
2.	Программа должна выводить текст на экран.
3.	Программа должна выводить прямоугольник размером m на n из восьмёрок.
4.	В программе должен использоваться цикл for.*/
public class task02 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first number: ");
        int firstN = Integer.parseInt(bf.readLine());
        System.out.print("Enter second number: ");
        int secondN = Integer.parseInt(bf.readLine());
        for (int i = 0; i < firstN; i++) {
            for (int y = 0; y < secondN; y++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
