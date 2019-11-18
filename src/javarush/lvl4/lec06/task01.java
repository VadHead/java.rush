package javarush.lvl4.lec06;
import java.io.*;

/*taskKey="com.javarush.task.task04.task0418"
Минимум двух чисел
Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них. Если два числа равны между собой, необходимо вывести любое.
Требования:
1.	Программа должна считывать числа c клавиатуры.
2.	Программа должна выводить число на экран.
3.	Программа должна выводить на экран минимальное из двух целых чисел.
4.	Если два числа равны между собой, необходимо вывести любое.
*/
public class task01 {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter first number: ");
        int number1 = Integer.parseInt(buffer.readLine());
        System.out.print("Enter second number: ");
        int number2 = Integer.parseInt(buffer.readLine());
        if (number1 < number2 || number1 == number2){
            System.out.println(number1 + " is smaller number from entered");
        } else {
            System.out.println(number2 + " is smaller number from entered");
        }
    }
}
