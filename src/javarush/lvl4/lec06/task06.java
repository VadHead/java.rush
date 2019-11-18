package javarush.lvl4.lec06;
import java.io.*;
/*taskKey="com.javarush.task.task04.task0423"\n\nФейс-контроль
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно».
Требования:
1.	Программа должна считывать строки c клавиатуры.
2.	Программа должна использовать команду System.out.println() или System.out.print().
3.	Если возраст больше 20 вывести только сообщение &quot;И 18-ти достаточно&quot;.
4.	Если возраст меньше либо равно 20 ничего не выводить.
*/
public class task06 {
    public static void main(String[] args) throws Exception{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter name: ");
        String Name = buffer.readLine();
        System.out.print("Enter age: ");
        int age = Integer.parseInt(buffer.readLine());
        if (age > 20){
            System.out.println("И 18-ти достаточно");
        }
    }
}
