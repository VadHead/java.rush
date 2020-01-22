package javarush.JavaCore.lvl02.lec12;
/*taskKey="com.javarush.task.task12.task1225"\n\nПосетители
Напиши метод, который определяет, какой объект передали в него.
Программа должна выводить на экран одну из надписей:
«Кот», «Тигр», «Лев», «Бык», «Корова», «Животное».
Замечание: постарайся определять тип животного как можно более точно.
Требования:
1.	Класс Solution должен содержать классы Cat, Tiger, Lion, Bull, Cow, Animal.
2.	Класс Solution должен содержать метод String getObjectType(Object o).
3.	Метод getObjectType() должен возвращать строку &quot;Кот&quot;, если передан объект типа Cat.
4.	Метод getObjectType() должен возвращать строку &quot;Тигр&quot;, если передан объект типа Tiger.
5.	Метод getObjectType() должен возвращать строку &quot;Лев&quot;, если передан объект типа Lion.
6.	Метод getObjectType() должен возвращать строку &quot;Бык&quot;, если передан объект типа Bull.
7.	Метод getObjectType() должен возвращать строку &quot;Корова&quot;, если передан объект типа Cow.
8.	Метод getObjectType() должен возвращать строку &quot;Животное&quot;, если передан объект типа Animal.
9.	Программа должна выводить на экран результат метода getObjectType().*/
public class task05 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        String objType = "";
        if (o instanceof Tiger) objType = "Тигр";
        else if (o instanceof Lion) objType = "Лев";
        else if (o instanceof Cat) objType = "Кот";
        else if (o instanceof Bull) objType = "Бык";
        else if (o instanceof Cow) objType = "Корова";
        else if (o instanceof Animal) objType = "Животное";
        return objType;
    }

    public static class Cat extends Animal
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
