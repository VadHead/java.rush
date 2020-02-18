package javarush.JavaCore.lvl05.lec12.task03;
import java.math.BigDecimal;
/*taskKey="com.javarush.task.task15.task1521"\n\nООП. Перегрузка
1. В классе Tree перегрузи метод info(Object s) два раза так, чтобы получилось три метода info(Object s), info(Number s), info(String s).
1.1. Разберись в методе info(Object s). Сделай по аналогии функционал новых методов.
1.2. Например, для метода info(Number s) результат может быть таким "Дерево № 123 , метод Number, параметр Short".
Требования:
1.	В классе Tree должен быть реализован метод info(Object s).
2.	В классе Tree должен быть реализован метод info(Number s).
3.	В классе Tree должен быть реализован метод info(String s).
4.	Метод info(Number s) должен выводить на экран строку аналогичную строке из метода info(Object s), заменив лишь фразу(&quot;метод Object&quot; на &quot;метод Number&quot;).
5.	Метод info(String s) должен выводить на экран строку аналогичную строке из метода info(Object s), заменив лишь фразу(&quot;метод Object&quot; на &quot;метод String&quot;).*/
public class Solution {
    public static void main(String[] args) {
        //2.
        //Object
        new Tree().info((Object)new Integer("4"));
        new Tree().info((Object)new Short("4"));
        new Tree().info((Object)new BigDecimal("4"));

        // 3.
        //Number
        new Tree().info(new Integer("4"));
        new Tree().info(new Short("4"));
        new Tree().info(new BigDecimal("4"));

        // 4.
        // String
        new Tree().info(new String("4"));
        new Tree().info(new Integer("4").toString());
        new Tree().info(new Short("4").toString());
        new Tree().info(new BigDecimal("4").toString());
    }
}
