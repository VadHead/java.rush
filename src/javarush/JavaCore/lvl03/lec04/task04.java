package javarush.JavaCore.lvl03.lec04;

import java.awt.*;

/*taskKey="com.javarush.task.task13.task1314"\n\nБольшая лисица — это такая лисица
1. Исправь класс BigFox так, чтобы программа компилировалась.
Требования:
1.	Интерфейс Animal должен быть реализован в классе Fox.
2.	В классе Fox должен быть реализован только один метод(getName).
3.	В интерфейсе Animal должен быть объявлен метод getColor.
4.	Класс BigFox должен быть потомком класса Fox.*/
public class task04 {
    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());

    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public static class BigFox extends Fox {

        public Color getColor() {
            return Color.GRAY;
        }
    }
}