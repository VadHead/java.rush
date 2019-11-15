package javarush.lvl4.lec02;
/*taskKey="com.javarush.task.task04.task0407"
Кошки во Вселенной
Написать код, чтобы правильно считалось количество созданных котов (count) и на экран выдавалось правильное их количество.
Требования:
1.	Программа должна выводить текст на экран.
2.	Нельзя изменять строку отвечающую за вывод в консоль.
3.	Класс Cat должен содержать только одну переменную count.
4.	Переменная count класса Cat должна быть статической, иметь модификатор доступа public, тип int и проинициализирована нулем.
5.	В методе main должно быть только две проинициализированные переменные типа Cat.
6.	Переменная count должна содержать актуальное количество созданных объектов-котов.
*/
public class task05 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat.count++;//напишите тут ваш код

        Cat cat2 = new Cat();
        Cat.count++;//напишите тут ваш код

        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }

    }
