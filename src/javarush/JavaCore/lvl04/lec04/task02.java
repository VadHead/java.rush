package javarush.JavaCore.lvl04.lec04;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*taskKey="com.javarush.task.task14.task1404"\n\nКоты
1. Считывать строки(параметры) с консоли, пока пользователь не введет пустую строку(Enter).
2. Каждый параметр соответствует имени кота.
Для каждого параметра:
3. Создать объект cat класса Cat, который равен коту из getCatByKey(String параметр).
4. Вывести на экран cat.toString().
Требования:
1.	Программа должна считывать данные с клавиатуры.
2.	Программа должна прекращать считывать данные после ввода пустой строки.
3.	Программа должна выводить на экран описание каждого кота (cat.toString).
4.	Программа должна создавать объект класса Cat для каждого введенного имени кота(строки считанной с клавиатуры) c помощью метода getCatByKey.*/
public class task02 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String catName = bf.readLine();
            if (catName.isEmpty()) break;
            Cat cat = CatFactory.getCatByKey(catName);
            System.out.println(cat.toString());
        }
        bf.close();
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat = null;
            if ("vaska".equals(key)) {
                cat = new MaleCat("Василий");
            } else if ("murka".equals(key)) {
                cat = new FemaleCat("Мурочка");
            } else if ("kiska".equals(key)) {
                cat = new FemaleCat("Кисюлька");
            } else {
                cat = new Cat(key);
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}
