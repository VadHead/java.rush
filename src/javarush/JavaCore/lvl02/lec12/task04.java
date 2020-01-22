package javarush.JavaCore.lvl02.lec12;
/*taskKey="com.javarush.task.task12.task1224"\n\nНеведома зверушка
Напиши метод, который определяет, какой объект передали в него.
Программа должна выводить на экран одну из надписей:
«Кот», «Тигр», «Лев», «Бык», «Животное».
Требования:
1.	Класс Solution должен содержать классы Cat, Tiger, Lion, Bull, Pig.
2.	Класс Solution должен содержать метод String getObjectType(Object o).
3.	Метод getObjectType() должен возвращать строку &quot;Кот&quot; если передан объект типа Cat.
4.	Метод getObjectType() должен возвращать строку &quot;Тигр&quot; если передан объект типа Tiger.
5.	Метод getObjectType() должен возвращать строку &quot;Лев&quot; если передан объект типа Lion.
6.	Метод getObjectType() должен возвращать строку &quot;Бык&quot; если передан объект типа Bull.
7.	Метод getObjectType() должен возвращать строку &quot;Животное&quot; если передан любой другой объект.
8.	Программа должна выводить на экран результат метода getObjectType().*/
public class task04 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        String objType;
        if (o instanceof Cat) objType = "Кот";
        else if (o instanceof Tiger) objType = "Тигр";
        else if (o instanceof Lion) objType = "Лев";
        else if (o instanceof Bull) objType = "Бык";
        else objType = "Животное";
        return objType;
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
