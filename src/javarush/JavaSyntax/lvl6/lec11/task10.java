package javarush.JavaSyntax.lvl6.lec11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
/*taskKey="com.javarush.task.task06.task0622"\n\nЧисла по возрастанию
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
Требования:
1.	Программа должна считывать 5 чисел с клавиатуры.
2.	Программа должна выводить 5 чисел, каждое с новой строки.
3.	Выведенные числа должны быть отсортированы по возрастанию.
4.	Вывод должен содержать те же числа, что и были введены (порядок не важен).
*/
public class task10 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList numbers = new ArrayList();
        for (int i = 0; i < 5; i++){
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
