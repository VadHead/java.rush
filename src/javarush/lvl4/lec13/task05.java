package javarush.lvl4.lec13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*taskKey="com.javarush.task.task04.task0439"\n\nПисьмо счастья
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: <имя> любит меня.
Пример вывода на экран для имени Света:
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Требования:
1.	Программа должна считывать имя c клавиатуры.
2.	Программа должна выводить текст на экран.
3.	Программа должна выводить 10 раз текст указанный в задании.
4.	В программе должен использоваться цикл for.
*/
public class task05 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter name: ");
        String name = bf.readLine();
        for (int i = 0; i < 10; i++){
            System.out.println(name + " любит меня.");
        }
    }
}
