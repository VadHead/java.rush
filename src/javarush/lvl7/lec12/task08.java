package javarush.lvl7.lec12;
import java.util.*;
import java.io.*;
/*taskKey="com.javarush.task.task07.task0726"\n\nНе компилируется задача про котиков
Задача:  Программа вводит с клавиатуры данные про котов и выводит их на экран. Пример:
Cat's name: Barsik, age: 6, weight: 5, tail: 22
Cat's name: Murka, age: 8, weight: 7, tail: 20
Требования:
1.	Программа должна считывать данные с клавиатуры.
2.	Если пользователь ввел пустую строку вместо имени, то программа должна вывести данные на экран и завершиться.
3.	Если пользователь ввел: Barsik, 6, 5 и 22 (каждое значение с новой строки), то программа должна вывести &quot;Cat&#39;s name: Barsik, age: 6, weight: 5, tail: 22&quot;.
4.	Если пользователь ввел: Murka, 8, 7 и 20 (каждое значение с новой строки), то программа должна вывести &quot;Cat&#39;s name: Murka, age: 8, weight: 7, tail: 20&quot;.
5.	Если пользователь ввел: Barsik, 6, 5, 22, Murka, 8, 7 и 20 (каждое значение с новой строки), то программа должна вывести две строки: &quot;Cat&#39;s name: Barsik, age: 6, weight: 5, tail: 22&quot; и &quot;Cat&#39;s name: Murka, age: 8, weight: 7, tail: 20&quot;.*/
public class task08 {
    public final static ArrayList<Cat> CATS = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String name = reader.readLine();
            if (name == null || name.isEmpty()) {
                break;
            }
            int age = Integer.parseInt(reader.readLine());//
            int weight = Integer.parseInt(reader.readLine());//
            int tailLength = Integer.parseInt(reader.readLine());//
            Cat cat = new Cat(name,age,weight,tailLength);
            CATS.add(cat);
        }

        printList();
    }

    public static void printList() {
        for (int i = 0; i < CATS.size(); i++) {
            System.out.println(CATS.get(i));
        }
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int tailLength;

        Cat(String name, int age, int weight, int tailLength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }

        @Override
        public String toString() {
            return "Cat's name: " + name + ", age: " + age + ", weight: " + weight + ", tail: " + tailLength;
        }
    }
}
