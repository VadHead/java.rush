package javarush.lvl5.lec12;

import java.util.Calendar;

/*taskKey="com.javarush.task.task05.task0527"
Том и Джерри
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
Требования:
1.	Создай класс Dog.
2.	Создай класс Cat.
3.	В классе Dog должно быть три переменные.
4.	В классе Cat должно быть три переменные.
5.	Должен быть создан хотя бы один объект типа Mouse.
6.	Должен быть создан хотя бы один объект типа Dog.
7.	Должен быть создан хотя бы один объект типа Cat.*/
public class task03 {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat thomasCat = new Cat("Tom",7,6);
        Dog butchDog = new Dog("Butch",8,100);
    }

    public static class Cat {
        String name;
        int age;
        int strength;

        public Cat(String name, int age, int strength) {
            this.name = name;
            this.age = age;
            this.strength = strength;
        }
    }

    public static class Dog {
        String name;
        int height;
        int aggression;

        public Dog(String name, int height, int aggression) {
            this.name = name;
            this.height = height;
            this.aggression = aggression;
        }
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
}
