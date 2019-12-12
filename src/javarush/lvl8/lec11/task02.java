package javarush.lvl8.lec11;
import java.util.*;
/*taskKey="com.javarush.task.task08.task0820"\n\nМножество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog без конструктора или с конструктором без параметров.
2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
4. Реализовать метод join, который должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
Требования:
1.	Программа должна выводить текст на экран.
2.	Внутри класса Solution должен быть public static классы Cat, Dog.
3.	Метод createCats() класса Solution должен возвращать множество (Set) содержащее 4 кота.
4.	Метод createDogs() класса Solution должен возвращать множество (Set) содержащее 3 собаки.
5.	Метод join() класса Solution должен возвращать объединенное множество всех животных - всех котов и собак.
6.	Метод removeCats() должен удалять из множества pets всех котов, которые есть в множестве cats.
7.	Метод printPets() должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки.*/
public class task02 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);
        System.out.println("-------------");
        removeCats(pets, cats);
        printPets(pets);
        System.out.println("-------------");
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        Cat vasya = new Cat();
        result.add(vasya);
        Cat thomas = new Cat();
        result.add(thomas);
        Cat pusha = new Cat();
        result.add(pusha);
        Cat leopold = new Cat();
        result.add(leopold);
        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> result = new HashSet<Dog>();
        Dog sharik = new Dog();
        result.add(sharik);
        Dog volk = new Dog();
        result.add(volk);
        Dog pirat = new Dog();
//        result.add(pirat);
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> animals = new HashSet<>();
        animals.addAll(cats);
        animals.addAll(dogs);
        return animals;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        for (Object pet : pets) {
            System.out.println(pet.toString());
        }
    }

    public static class Cat {
        public Cat() {

        }
    }

    public static class Dog {
        public Dog() {

        }
    }
}
