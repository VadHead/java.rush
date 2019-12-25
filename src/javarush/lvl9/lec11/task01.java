package javarush.lvl9.lec11;
/*taskKey="com.javarush.task.task09.task0919"\n\nДеление на ноль
Создай метод public static void divideByZero, в котором подели любое число на ноль и выведи на экран результат деления.
Оберни вызов метода divideByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()
Требования:
1.	В классе должен быть метод public static void divideByZero().
2.	Метод divideByZero должен содержать операцию деления любого числа на ноль.
3.	Метод divideByZero должен вызывать System.out.println или System.out.print.
4.	Метод main должен содержать блок try..catch.
5.	Метод main должен отлавливать любые исключения метода divideByZero.
6.	Программа должна выводить стек-трейс пойманого исключения.*/
public class task01 {
    public static void main(String[] args) {
        try {
            divideByZero();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
    public static void divideByZero(){
        int number = 8/0;
        System.out.println(number);
    }
}