package javarush.lvl3.lec12;
/*taskKey="com.javarush.task.task01.task0132"
Сумма цифр трехзначного числа
Реализуй метод sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число. Нужно
посчитать сумму цифр этого числа, и вернуть эту сумму.
Пример:
Метод sumDigitsInNumber вызывается с параметром 546.
Пример вывода:
15
Требования:
1.	Программа не должна считывать данные с клавиатуры.
2.	Метод sumDigitsInNumber(int) должен быть публичным и статическим.
3.	Метод sumDigitsInNumber должен возвращать значение типа int.
4.	Метод sumDigitsInNumber не должен ничего выводить на экран.
5.	Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
public class task03 {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int a;
        int b;
        int c;
        a = number / 100; // получил 5
        b = number % 10;  // получил 6
        c = number % 100;
        c /= 10;          // получил 4
        return a + b + c;
    }
}
