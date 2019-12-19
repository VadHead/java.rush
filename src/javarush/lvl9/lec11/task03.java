package javarush.lvl9.lec11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*taskKey="com.javarush.task.task09.task0921"\n\nМетод в try..catch
Написать программу, которая будет вводить числа с клавиатуры.
Код по чтению чисел с клавиатуры должен быть в методе readData.
Код внутри readData обернуть в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение
и вывести на экран все ранее введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
Требования:
1.	Программа должна считывать данные с клавиатуры.
2.	Метод main не изменять.
3.	Метод main не должен кидать исключений.
4.	Метод readData должен содержать блок try..catch.
5.	Если пользователь ввел текст, а не число, программа должна вывести все ранее введенные числа.*/
public class task03 {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        try {
            while (true) {
                intArr.add(Integer.parseInt(bf.readLine()));
            }
        } catch (Exception e) {
            for (Integer number : intArr) {
                System.out.println(number.toString());
            }
        }
    }
}
