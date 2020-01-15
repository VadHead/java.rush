package javarush.JavaSyntax.lvl5.lec05;
/*taskKey="com.javarush.task.task05.task0505"
Кошачья бойня
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран c новой строки.
Требования:
1.	Программа не должна считывать данные с клавиатуры.
2.	Нужно создать три объекта типа Cat.
3.	Нужно провести три боя.
4.	Программа должна вывести результат каждого боя с новой строки.
*/
public class task05 {
    public static void main(String[] args) {
        Cat catFirst = new Cat("Kot",2,9,12);
        Cat catSecond = new Cat("Tom", 12, 10, 13);
        Cat catThird = new Cat("Paul", 7, 8, 7);
        System.out.println(catFirst.fight(catSecond));
        System.out.println(catFirst.fight(catThird));
        System.out.println(catSecond.fight(catThird));
    }
    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

            int score = ageAdvantage + weightAdvantage + strengthAdvantage;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
