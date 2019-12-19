package javarush.lvl9.lec11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/*taskKey="com.javarush.task.task09.task0922"\n\nКакое сегодня число?
Ввести с клавиатуры дату в формате «2013-08-18»
Вывести на экран введенную дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
Требования:
1.	Программа должна считывать данные с клавиатуры.
2.	В программе должна быть объявлена переменная типа SimpleDateFormat.
3.	В программе должна быть объявлена переменная типа Date.
4.	Программа должна выводить данные на экран.
5.	Вывод должен соответствовать заданию.*/
public class task04 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String inputDate = bf.readLine();
        SimpleDateFormat inDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date inDate = inDateFormat.parse(inputDate);
        SimpleDateFormat df = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(df.format(inDate).toUpperCase());
    }
}
