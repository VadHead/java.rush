package javarush.JavaSyntax.lvl1.lec07;
/*taskKey="com.javarush.task.task01.task0123"\n\nЛишние строки нам не нужны
Закомментируй те переменные, которые нигде не используются. Программа должна компилироваться.
Требования:
1.	Тип переменных менять нельзя.
2.	Значения переменных менять нельзя.
3.	В программу нельзя добавлять новые строки или удалять имеющиеся.
4.	Нужно закомментировать неиспользуемые переменные.
5.	Вывод программы не должен измениться.
*/
public class task0123 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        double c = b + 38;
        //int d = a + 12;
        //double e = 12.3;
        String s = "s" + a;
        String s1 = a + "b";
        //String s2 = "a";
        String s3 = s1 + "a";
        String s4 = s3 + "b";
        System.out.println(c + s4 + s);
    }
}
