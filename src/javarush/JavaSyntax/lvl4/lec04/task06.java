package javarush.JavaSyntax.lvl4.lec04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*taskKey="com.javarush.task.task04.task0413"\n\nДень недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
«понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше 7 или меньше 1 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
Требования:
1.	Программа должна считывать число c клавиатуры.
2.	Программа должна выводить текст на экран.
3.	Если введено число от 1 до 7, необходимо вывести день недели.
4.	Если введено число не входящее в интервал от 1 до 7, то вывести уведомление что такого дня недели не существует.
*/
public class task06 {
    public static void main(String[] args) throws Exception {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int weekDay = Integer.parseInt(reader.readLine());
      String day;
      if (weekDay == 1) day = "понедельник";
      else if (weekDay == 2) day = "вторник";
      else if (weekDay == 3) day = "среда";
      else if (weekDay == 4) day = "четверг";
      else if (weekDay == 5) day = "пятница";
      else if (weekDay == 6) day = "суббота";
      else if (weekDay == 7) day = "воскресенье";
      else day = "такого дня недели не существует";
      System.out.println(day);
    }
}
