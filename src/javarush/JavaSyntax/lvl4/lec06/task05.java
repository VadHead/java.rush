package javarush.JavaSyntax.lvl4.lec06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*taskKey="com.javarush.task.task04.task0422"\n\n18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
Требования:
1.	Программа должна дважды считать данные c клавиатуры.
2.	Программа должна использовать команду System.out.println() или System.out.print().
3.	Если возраст меньше 18 вывести только сообщение &quot;Подрасти еще&quot;.
4.	Если возраст больше либо равно 18 ничего не выводить.*/
public class task05 {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter name: ");
        String Name = buffer.readLine();
        System.out.print("Enter age: ");
        int age = Integer.parseInt(buffer.readLine());
        if (age < 18){
            System.out.println("Подрасти еще");
        }
    }
}
