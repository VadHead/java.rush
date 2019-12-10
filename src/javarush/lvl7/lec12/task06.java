package javarush.lvl7.lec12;

import java.security.Guard;

/*taskKey="com.javarush.task.task07.task0724"\n\nСемейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
Требования:
1.	Программа не должна считывать данные с клавиатуры.
2.	Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
3.	Добавить в класс конструктор public Human(String name, boolean sex, int age).
4.	Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
5.	Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6.	Выведи созданные объекты на экран.
*/
public class task06 {
    public static void main(String[] args) {
        var grFather1 = new Human("Вася", true, 80);
        var grFather2 = new Human("Володя", true, 85);
        Human grMother1 = new Human("Света", false, 77);
        Human grMother2 = new Human("Валя", false, 88);
        Human mother = new Human("Марина", false, 49, grFather1, grMother1);
        Human father = new Human("Сергей", true, 51, grFather2, grMother2);
        Human son = new Human("Вадим", true, 29, father, mother);
        Human daughter = new Human("Юля", false, 31, father, mother);
        Human imagineSon = new Human("R2D2", true, 999, father, mother);
        System.out.println(grFather1);
        System.out.println(grFather2);
        System.out.println(grMother1);
        System.out.println(grMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);
        System.out.println(imagineSon);
    }

    public static class Human {
        String name;
        Boolean sex;
        int age;
        Human father;
        Human mother;

        Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
