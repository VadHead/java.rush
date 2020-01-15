package javarush.JavaSyntax.lvl5.lec05.task02;
/*taskKey="com.javarush.task.task05.task0502"
Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) возвращает true, то cat2.fight(cat1) должен возвращать false
Требования:
1.	Класс Cat должен содержать конструктор без параметров.
2.	Класс Cat должен содержать публичные поля name, age, weight и strength.
3.	Метод fight не должен считывать данные с клавиатуры.
4.	Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
5.	Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
6.	Метод fight не должен выводить данные на экран.
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int totalStrength1 = this.age + this.weight + this.strength;
        int totalStrength2 = anotherCat.age + anotherCat.weight + anotherCat.strength;
        if (totalStrength1 > totalStrength2) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
    Cat cat1 = new Cat();
    cat1.strength = 10;
    cat1.weight = 9;
    cat1.age = 9;

    Cat cat2 = new Cat();
    cat2.strength = 10;
    cat2.weight = 9;
    cat2.age = 9;
    System.out.println(cat1.fight(cat2));
    }
}
