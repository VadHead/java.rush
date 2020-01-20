package javarush.JavaCore.lvl02.lec02;
/*taskKey="com.javarush.task.task12.task1205"\n\nОпределимся с животным
Написать метод, который определяет, объект какого класса ему передали, и возвращает результат – одно значение из: «Корова», «Кит», «Собака», «Неизвестное животное».
Требования:
1.	Программа должна выводить текст на экран.
2.	В классе Solution должен быть статический класс Cow.
3.	В классе Solution должен быть статический класс Dog.
4.	В классе Solution должен быть статический класс Whale.
5.	В классе Solution должен быть статический класс Pig.
6.	Метод getObjectType() должен возвращать одно значение из: &quot;Корова&quot;, &quot;Кит&quot;, &quot;Собака&quot;, &quot;Неизвестное животное&quot; в зависимости от переданного объекта. Например &quot;Корова&quot; для объектов типа Solution.Cow.*/
public class task05 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        String type;
        if (o instanceof Cow) type = "Корова";
        else if (o instanceof Whale) type = "Кит";
        else if (o instanceof Dog) type = "Собака";
        else type = "Неизвестное животное";
        return type;
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
