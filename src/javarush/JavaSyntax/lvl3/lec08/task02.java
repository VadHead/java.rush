package javarush.JavaSyntax.lvl3.lec08;
/*taskKey="com.javarush.task.task03.task0319"
Предсказание на будущее
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
Требования:
1.	Программа должна выводить текст.
2.	Программа должна считывать данные с клавиатуры.
3.	Выведенный текст должен содержать введенное имя.
4.	Выведенный текст должен содержать введенное число1.
5.	Выведенный текст должен содержать введенное число2.
6.	Выведенный тест должен полностью соответствовать заданию.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task02 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String Name = reader.readLine();
        String salary = reader.readLine();
        String years = reader.readLine();

        System.out.println(Name + " получает " + salary + " через " + years + " лет.");
    }
}
