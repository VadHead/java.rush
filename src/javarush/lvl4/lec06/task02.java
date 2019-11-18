package javarush.lvl4.lec06;
import java.io.*;
/*taskKey="com.javarush.task.task04.task0419"
Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них. Если числа равны между собой, необходимо вывести любое.
Требования:
1.	Программа должна считывать числа c клавиатуры.
2.	Программа должна выводить число на экран.
3.	Программа должна выводить на экран максимальное из четырёх чисел.
4.	Если максимальных чисел несколько, необходимо вывести любое из них.
*/
public class task02 {
    public static void main(String[] args) throws Exception{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first number: ");
        int number1 = Integer.parseInt(buffer.readLine());
        System.out.print("Enter second number: ");
        int number2 = Integer.parseInt(buffer.readLine());
        System.out.print("Enter third number: ");
        int number3 = Integer.parseInt(buffer.readLine());
        System.out.print("Enter forth number: ");
        int number4 = Integer.parseInt(buffer.readLine());

        if (maximum(number1, number2) >= maximum(number3, number4)) {
            System.out.println(maximum(number1, number2) + " is the greater number");
        } else {
            System.out.println(maximum(number3, number4) + " is the greater number");
        }
    }
    public static int maximum(int a, int b){
        if (a <= b) return b;
        else return a;
    }

}
