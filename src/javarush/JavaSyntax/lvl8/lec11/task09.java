package javarush.JavaSyntax.lvl8.lec11;
import java.util.Date;
/*taskKey="com.javarush.task.task08.task0827"
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
Требования:
1.	Программа должна выводить текст на экран.
2.	Класс Solution должен содержать два метода.
3.	Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4.	Метод main() должен вызывать метод isDateOdd().*/
public class task09 {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date currentDate = new Date(date);
        Date currentYearStart = new Date(date);
        currentYearStart.setMonth(0);
        currentYearStart.setDate(1);
        long result = currentDate.getTime() - currentYearStart.getTime();
        long resultedDays = result / (24 * 60 * 60 * 1000) ;
        return (int) resultedDays % 2 == 0;
    }
}
