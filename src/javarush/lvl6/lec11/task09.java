package javarush.lvl6.lec11;
import java.io.*;
/*taskKey="com.javarush.task.task06.task0621"\n\nРодственные связи кошек
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кот-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.
Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка
Пример вывода:
The cat's name is дедушка Вася, no mother, no father
The cat's name is бабушка Мурка, no mother, no father
The cat's name is папа Котофей, no mother, father is дедушка Вася
The cat's name is мама Василиса, mother is бабушка Мурка, no father
The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
Требования:
1.	Программа должна считывать имена 6 котов в указанном порядке.
2.	Метод main должен создавать 6 объектов типа Cat.
3.	Программа должна выводить 6 строк с информацией о котах.
4.	Строка про дедушку (первая) должна соответствовать условию.
5.	Строка про бабушку (вторая) должна соответствовать условию.
6.	Строка про папу (третья) должна соответствовать условию.
7.	Строка про маму (четвертая) должна соответствовать условию.
8.	Строка про сына (пятая) должна соответствовать условию.
9.	Строка про дочь (шестая) должна соответствовать условию.*/
public class task09 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandPName = reader.readLine();
        Cat catGrandP = new Cat(grandPName);

        String grandBName = reader.readLine();
        Cat catGrandB = new Cat(grandBName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandP);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, catGrandB);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        System.out.println(catGrandP);
        System.out.println(catGrandB);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }
    public static class Cat {
        private String name;
        private Cat parent1;
        private Cat parent2;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent1) {
            this.name = name;
            this.parent1 = parent1;
        }

        Cat(String name, Cat parent1, Cat parent2) {
            this.name = name;
            this.parent1 = parent1;
            this.parent2 = parent2;
        }

        @Override
        public String toString() {
            if (parent1 == null && parent2 == null)
                return "The cat's name is " + name + ", no mother" + ", no father";
            else if (parent2 == null)
                return "The cat's name is " + name + ", no mother" + ", father is " + parent1.name;
            else if (parent1 == null)
                return "The cat's name is " + name + ", mother is " + parent2.name + ", no father";
            else
                return "The cat's name is " + name + ", mother is " + parent2.name + ", father is " + parent1.name;
        }
    }
}
