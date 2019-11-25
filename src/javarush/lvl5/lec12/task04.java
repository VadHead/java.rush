package javarush.lvl5.lec12;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/*taskKey="com.javarush.task.task05.task0528"
Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
Требования:
1.	Дата должна содержать день, месяц и год, разделенные пробелом.
2.	День должен соответствовать текущему.
3.	Месяц должен соответствовать текущему.
4.	Год должен соответствовать текущему.
5.	Вся дата должна быть выведена в одной строке.*/
public class task04 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.printf("%1$td %<tm %<tY",date);
        SimpleDateFormat simpleDate = new SimpleDateFormat("dd MM YYYY");
        System.out.println(simpleDate.format(date));
    }
}
