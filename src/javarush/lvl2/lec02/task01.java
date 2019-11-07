package javarush.lvl2.lec02;
/*taskKey="com.javarush.task.task02.task0202"\n\nОткуда берутся Person?
В классе Person объяви следующие переменные: name типа String, age типа int, weight типа int, money типа int.
В методе main создай объект Person, занеси его ссылку в переменную person.
Подсказка: для создания объекта Person и занесения его ссылки в переменную person используй конструкцию:
ТипПеременной имяПеременной = new ТипСоздаваемогоОбъекта();
Требования:
1.	В классе Person объяви переменную name типа String.
2.	В классе Person объяви переменную age типа int.
3.	В классе Person объяви переменную weight типа int.
4.	В классе Person объяви переменную money типа int.
5.	В методе main создай объект Person и сразу присвой ссылку на него переменной person.
6.	Должно быть объявлено 5 переменных.
*/
public class task01 {
    public static void main(String[] args) {
        Person person = new Person(); //напишите тут ваш код
    }

    public static class Person {
        String name;
        int age, weight, money;
        //напишите тут ваш код
    }
}
