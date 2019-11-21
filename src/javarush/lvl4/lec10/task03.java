package javarush.lvl4.lec10;
import java.io.*;
/*taskKey="com.javarush.task.task04.task0432"\n\nХорошего много не бывает
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.
Пример ввода:
абв
2
Пример вывода:
абв
абв
Требования:
1.	Программа должна считывать текст c клавиатуры.
2.	Программа должна выводить текст на экран.
3.	Каждое значение должно быть выведено с новой строки.
4.	Программа должна выводить на экран строку N раз.
5.	В программе должен использоваться цикл while.
*/
public class task03 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text: ");
        String text = bf.readLine();
        System.out.println("Enter counter: ");
        int count = Integer.parseInt(bf.readLine());
        int i = 1;
        while (i <= count) {
            System.out.println(text);
            i++;
        }
    }
}
