package javarush.JavaSyntax.lvl1.lect04;
/*taskKey="com.javarush.task.task01.task0116"\n\nВносим изменения в код
Внеси изменения в программу, чтобы переменная name имела значение Amigo.
Требования:
1.	Переменной name должно присваиваться значение сразу после создания.
2.	Должно быть объявлено 2 переменных.
3.	Значение переменной text изменять нельзя.
4.	Команду вывода текста на экран изменять нельзя.
5.	Программа должна выводить текст &quot;Hello, Amigo!&quot;.
*/
public class task03 {
    public static void main(String[] args) {
        String name = "Ellie";
        name="Amigo";
        String text = "Hello, " + name + "!";
        System.out.println(text);
    }
}
