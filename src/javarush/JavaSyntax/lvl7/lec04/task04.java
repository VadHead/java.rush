package javarush.JavaSyntax.lvl7.lec04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*taskKey="com.javarush.task.task07.task0704"\n\nПереверни массив
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
Требования:
1.	Программа должна создавать массив на 10 целых чисел.
2.	Программа должна считывать числа для массива с клавиатуры.
3.	Программа должна выводить 10 строчек, каждую с новой строки.
4.	Массив должен быть выведен на экран в обратном порядке.*/
public class task04 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(bf.readLine());
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
