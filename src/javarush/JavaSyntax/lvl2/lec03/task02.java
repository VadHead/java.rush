package javarush.JavaSyntax.lvl2.lec03;
/*taskKey="com.javarush.task.task02.task0209"\n\nМакс, Белла и Джек
Создать 3 объекта типа Dog (собака). Сохрани каждый экземпляр в отдельную переменную. Присвоить им имена "Max", "Bella", "Jack".
Требования:
1.	Программа не должна выводить текст на экран.
2.	В методе main должно быть только три переменные типа Dog.
3.	Переменным сразу должны быть присвоены значения.
4.	Каждому объекту типа Dog должно быть присвоено имя.
5.	В классе Dog должна быть одна переменная name.
6.	В классе Dog не должно быть методов.
*/
public class task02 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        dog1.name = "Max";
        dog2.name = "Bella";
        dog3.name = "Jack";
        //напишите тут ваш код
    }

    public static class Dog {
        public String name;
    }
}
