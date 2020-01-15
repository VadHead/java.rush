package javarush.JavaSyntax.lvl4.lec16;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*taskKey="com.javarush.task.task04.task0443"\n\nКак назвали, так назвали
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name.
Я родился d.m.y»
Пример вывода:
Меня зовут Вася.
Я родился 15.2.1988
Требования:
1.	Программа должна считывать строки c клавиатуры.
2.	Программа должна выводить строки на экран.
3.	Программа должна выводить текст, шаблон которого указан в задании.
4.	Каждое предложение вывести с новой строки.


*/
public class task04 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter name: ");
        String name = bf.readLine();
        System.out.print("Enter year: ");
        int year = Integer.parseInt(bf.readLine());
        System.out.print("Enter month: ");
        int month = Integer.parseInt(bf.readLine());
        System.out.print("Enter day: ");
        int day = Integer.parseInt(bf.readLine());
        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + day + "." + month + "." + year);
    }
}
