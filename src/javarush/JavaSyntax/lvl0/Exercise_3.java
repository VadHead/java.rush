package javarush.JavaSyntax.lvl0;
/*
Сейчас 3126 год. Мой друг родился 8 лет назад.
Написать программу, выводящую на экран год рождения моего друга.

Требования:
•	Программа должна выводить текст.
•	Выведенный год должен состоять из 4 цифр.
•	Выведенный год должен начинаться с "31".
•	Выведенный год должен соответствовать заданию.
*/
public class Exercise_3 {
    public static void main(String[] args) {
        int year = 3126;
        int old = 8;
        int dBirth = year - old;
        System.out.println(dBirth);
    }
}
