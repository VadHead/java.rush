package javarush.lvl5.lec12;
import java.io.*;
/*taskKey="com.javarush.task.task05.task0529"
Консоль-копилка
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово «сумма». Вывести на экран полученную сумму.
Требования:
1.	Программа должна считывать данные с клавиатуры.
2.	Программа должна прекращать считывать данные с клавиатуры после того пользователь введет слово «сумма» в нижнем регистре и нажмет Enter.
3.	Программа должна корректно работать, если пользователь ввел одно число и слово «сумма».
4.	Программа должна корректно работать, если пользователь ввел два числа и слово «сумма».
5.	Программа должна корректно работать, если пользователь ввел более двух чисел и слово «сумма».
6.	Программа должна выводить текст на экран.*/
public class task05 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String inputValue;
        while (true) {
            inputValue = bf.readLine();
            if (!inputValue.equals("сумма")) {
                sum += Integer.parseInt(inputValue);
            } else break;
        }
        System.out.println(sum);
    }
}
