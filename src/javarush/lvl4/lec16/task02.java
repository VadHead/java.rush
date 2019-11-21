package javarush.lvl4.lec16;
import java.io.*;
/*taskKey="com.javarush.task.task04.task0441"
Как-то средненько
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.
Требования:
1.	Программа должна считывать числа c клавиатуры.
2.	Программа должна выводить число на экран.
3.	Программа должна выводить среднее из трех чисел.
4.	Если все числа равны, вывести любое из них.
5.	Если два числа из трех равны, вывести любое из двух.*/
public class task02 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first number: ");
        int firstN = Integer.parseInt(bf.readLine());
        System.out.print("Enter second number: ");
        int secondN = Integer.parseInt(bf.readLine());
        System.out.print("Enter third number: ");
        int thirdN = Integer.parseInt(bf.readLine());

        int average;
        if (secondN == thirdN && secondN == firstN) {
            average = thirdN;
        } else if (secondN == thirdN || secondN == firstN) {
            average = secondN;
        } else if (firstN == thirdN) {
            average = thirdN;
        } else if (firstN < secondN && firstN > thirdN) {
            average = firstN;
        } else if (firstN > secondN && firstN < thirdN) {
            average = firstN;
        } else if (secondN < thirdN && secondN > firstN) {
            average = secondN;
        } else if (secondN > thirdN && secondN < firstN) {
            average = secondN;
        } else {
            average = thirdN;
        }
        System.out.println(average);
    }
}
