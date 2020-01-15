package javarush.JavaSyntax.lvl2.lec08;
/*taskKey="com.javarush.task.task02.task0217"
Минимум четырех чисел
Написать функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
Подсказка:
Нужно написать тело двух существующих функций min.
Требования:
1.	Программа должна выводить текст на экран.
2.	Методы min не должны выводить текст на экран.
3.	Метод main должен вызывать метод min(a, b) и метод min(a, b, c, d).
4.	Метод main должен выводить на экран результат работы методов min. Каждый раз с новой строки.
5.	Метод min(a, b) должен возвращать минимальное значение из чисел a, b.
6.	Метод min(a, b, c, d) должен использовать метод min(a, b)
7.	Метод min(a, b, c, d) должен возвращать минимальное значение из чисел a, b, c, d.
*/
public class task03 {
    public static int min(int a, int b, int c, int d) {
        int min2 = min(a, b);
        if (min2 < c) min2 = min2;
        else min2 = c;
        if (min2 < d) min2 = min2;
        else min2 = d;
        return min2;
    }

    public static int min(int a, int b) {
        int min1;
        if (a < b) min1 = a;
        else min1 = b;
        return min1;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));

    }
}