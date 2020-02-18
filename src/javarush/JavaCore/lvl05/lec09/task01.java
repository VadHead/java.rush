package javarush.JavaCore.lvl05.lec09;

import java.util.HashMap;
import java.util.Map;

/*taskKey="com.javarush.task.task15.task1514"\n\nСтатики-1
В статическом блоке инициализировать labels 5 различными парами ключ-значение.
Требования:
1.	В классе Solution должен быть только один метод (main).
2.	В классе Solution должно быть объявлено статическое поле labels типа Map.
3.	Поле labels должно быть заполнено 5 различными парами ключ-значение в статическом блоке.
4.	Метод main должен выводить содержимое labels на экран.*/
public class task01 {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(45D, "one");
        labels.put(20D, "two");
        labels.put(415D, "three");
        labels.put(445D, "four");
        labels.put(455D, "five");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
