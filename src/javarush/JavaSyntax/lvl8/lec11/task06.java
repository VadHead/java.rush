package javarush.JavaSyntax.lvl8.lec11;

import java.util.ArrayList;
/*taskKey="com.javarush.task.task08.task0824"
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
Требования:
1.	Программа должна выводить текст на экран.
2.	Класс Human должен содержать четыре поля.
3.	Класс Human должен содержать один метод.
4.	Класс Solution должен содержать один метод.
5.	Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.*/
public class task06 {
    public static void main(String[] args) {
        Human child1 = new Human("First", true, 8);
        Human child2 = new Human("Second", false, 16);
        Human child3 = new Human("Third", true, 20);
        ArrayList<Human> childrens = new ArrayList<Human>();
        childrens.add(child1);
        childrens.add(child2);
        childrens.add(child3);
        Human father = new Human("Batya", true, 50, childrens);
        Human mother = new Human("Mama", false, 48, childrens);
        ArrayList<Human> motherCh = new ArrayList<Human>();
        motherCh.add(mother);
        ArrayList<Human> fatherCh = new ArrayList<Human>();
        fatherCh.add(father);
        Human grandF1 = new Human("GrandF1", true, 80, motherCh);
        Human grandF2 = new Human("GrandF2", true, 82, fatherCh);
        Human grandM1 = new Human("GrandM1", false, 78, motherCh);
        Human grandM2 = new Human("GrandM2", false, 79, fatherCh);

        System.out.println(grandF1.toString());
        System.out.println(grandM1.toString());
        System.out.println(grandF2.toString());
        System.out.println(grandM2.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
