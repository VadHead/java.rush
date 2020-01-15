package javarush.JavaSyntax.lvl1.lect04;
/* taskKey="com.javarush.task.task01.task0114"\n\nJavaRush. Learn once - use anywhere
Напиши программу, которая выводит на экран надпись: «JavaRush. Learn once - use anywhere» 10 раз.
Требования:
1.	Программа должна выводить текст.
2.	Текст должен начинаться с &quot;JavaRush&quot;.
3.	Текст должен заканчиваться на &quot;use anywhere&quot;.
4.	Текст должен состоять из 10 строк.
5.	Выводимый текст должен соответствовать заданию.
*/
public class task01 {
    public static void main(String[] args) {
        System.out.println("JavaRush. Learn once - use anywhere");
        System.out.println("JavaRush. " + "Learn once - use anywhere");

        String s = "JavaRush. Learn once - use anywhere";
        System.out.println(s);

        String a = "JavaRush. Learn once -";
        String b = "use anywhere";
        System.out.println(a + " " +b);

        System.out.println("JavaRush"+"."+" Learn once - use anywhere");

        String a1="JavaRush";
        String b1="e";
        System.out.println(a1 + ". Learn once - use anywher"+b1);

        System.out.println("JavaRush."+" "+ "Learn once - use anywhere");
        System.out.println("JavaRush."+" "+ "Learn once "+"-"+" use anywhere");
        System.out.println("JavaRush."+" "+ "Learn once - "+"u"+"s"+"e"+" anywhere");
        System.out.println("JavaRush."+" "+ "Learn once"+""+""+""+" - use anywhere");
    }
}
