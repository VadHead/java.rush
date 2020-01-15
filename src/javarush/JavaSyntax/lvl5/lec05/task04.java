package javarush.JavaSyntax.lvl5.lec05;
/*taskKey="com.javarush.task.task05.task0504"
Трикотаж
В методе main создать три объекта типа Cat и заполнить их данными.
Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
Требования:
1.	Программа не должна считывать данные с клавиатуры.
2.	Нужно создать три объекта типа Cat.
3.	Класс Cat нельзя изменять.
4.	Программа не должна выводить данные на экран.
*/
public class task04 {
    public static void main(String[] args) {
        Cat catFirst = new Cat("Kot",2,9,12);
        Cat catSecond = new Cat("Tom", 12, 10, 13);
        Cat catThird = new Cat("Paul", 7, 8, 7);
    }
    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
