package javarush.JavaCore.lvl02.lec04;
/*taskKey="com.javarush.task.task12.task1209"\n\nТри метода и минимум
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
Требования:
1.	Программа не должна выводить текст на экран.
2.	Класс Solution должен содержать четыре метода.
3.	Класс Solution должен содержать статический метод int min(int, int).
4.	Метод int min(int, int) должен возвращать минимальное из двух чисел типа int.
5.	Класс Solution должен содержать статический метод long min(long, long).
6.	Метод long min(long, long) должен возвращать минимальное из двух чисел типа long.
7.	Класс Solution должен содержать статический метод double min(double, double).
8.	Метод double min(double, double) должен возвращать минимальное из двух чисел типа double.*/
public class task04 {
    public static void main(String[] args) {

    }

    public static int min(int n, int m) {
        return n > m ? m : n;
    }

    public static long min(long n, long m) {
        return n > m ? m : n;
    }

    public static double min(double n, double m) {
        return n > m ? m : n;
    }

}
