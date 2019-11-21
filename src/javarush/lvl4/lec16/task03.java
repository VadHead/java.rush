package javarush.lvl4.lec16;
import java.io.*;
/*taskKey="com.javarush.task.task04.task0442"\n\nСуммирование
Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.
Подсказака: один из вариантов решения этой задачи, использовать конструкцию:
while (true) {
int number = считываем число;
if (проверяем, что number -1)
break;
}
Требования:
1.	Программа должна считывать числа c клавиатуры.
2.	Если пользователь ввел -1, программа должна вывести сумму всех введенных чисел на экран и завершиться.
3.	Программа должна посчитать сумму введенных чисел и вывести её на экран.
4.	В программе должен использоваться цикл for, while или do-while.*/
public class task03 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        do {
            System.out.print("Enter number: ");
            int number = Integer.parseInt(bf.readLine());
            if (number == -1) {
                System.out.println(sum + number);
                break;
            } else sum += number;
        } while (true);
    }
}
