package javarush.JavaSyntax.lvl3.lec04;
/*taskKey="com.javarush.task.task03.task0306"
Головоломка со скобками
Расставить правильно (по другому) скобки, чтобы на экран вывелось число 382
Требования:
1.	Программа не должна считывать данные с клавиатуры.
2.	Метод main должен выводить на экран число 382.
3.	Метод main должен содержать только один вызов System.out.println.
4.	Последовательность цифр и арифметических операций изменять нельзя.
*/
public class task02 {
    public static void main(String[] args) {
        System.out.println(2 * (3 + 4 *(5 + 6 * 7)));
    }
}
