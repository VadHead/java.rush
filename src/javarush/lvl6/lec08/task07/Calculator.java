package javarush.lvl6.lec08.task07;
/*taskKey="com.javarush.task.task06.task0612"\n\nКалькулятор
Сделать класс Calculator, у которого будут 5 статических методов:
int plus(int a, int b) – возвращает сумму чисел a и b
int minus(int a, int b) – возвращает разницу чисел a и b
int multiply(int a, int b) – возвращает результат умножения числа a на число b
double division(int a, int b) – возвращает результат деления числа a на число b
double percent(int a, int b) – возвращает b процентов от числа a
Требования:
1.	Метод plus должен возвращать сумму чисел a и b.
2.	Метод minus должен возвращать разницу чисел a и b.
3.	Метод multiply должен возвращать результат умножения числа a на число b.
4.	Метод division должен возвращать результат деления числа a на число b.
5.	Метод percent должен возвращать b процентов от числа a.*/
public class Calculator {
    public static int plus(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int minus(int a, int b) {
        int difference = a - b;
        return difference;
    }

    public static int multiply(int a, int b) {
        int multiplication = a * b;
        return multiplication;
    }
    public static double division(int a, int b) {
        double division = 1.0*a/1.0*b;
        return division;
    }

    public static double percent(int a, int b) {
        double percentage = (a*b*1.0)/100;;
        return percentage;
    }

    public static void main(String[] args) {

    }
}
