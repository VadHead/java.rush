package javarush.JavaSyntax.lvl1.lec08;
/*taskKey="com.javarush.task.task01.task0127"\n\nЧисло в квадрате
Напиши программу, которая выводит на экран квадрат числа 5.
Требования:
1.	Программа должна выводить текст.
2.	Метод main должен вызывать метод sqr с параметром 5.
3.	Метод main должен выводить результат метода sqr.
4.	Метод sqr изменять нельзя.
5.	Выводимый текст должен соответствовать заданию.
*/
public class task03 {
    public static void main(String[] args) {
       System.out.println(sqr(5)); //напишите тут ваш код
    }

    public static int sqr(int a) {
        return a * a;
    }
}