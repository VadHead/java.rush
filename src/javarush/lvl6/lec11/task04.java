package javarush.lvl6.lec11;
/*taskKey="com.javarush.task.task06.task0616"\n\nМинимальное число статиков
Расставьте минимальное количество static-ов, чтобы код начал работать, и программа успешно завершилась.
Требования:
1.	Реализацию и модификаторы доступа методов менять нельзя.
2.	Добавь модификаторы static в нужные места.
3.	В программе должно быть только 4 модификатора static.
4.	Программа должна выводить текст на экран.*/
public class task04 {
    public static int step;

    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        new task04().method3();
    }
    public void method3() {
        method4();
    }

    public void method4() {
        step++;
        for (StackTraceElement element : Thread.currentThread().getStackTrace())
            System.out.println(element);
        if (step > 1)
            return;
        main(null);
    }
}
