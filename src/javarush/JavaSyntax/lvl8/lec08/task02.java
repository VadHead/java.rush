package javarush.JavaSyntax.lvl8.lec08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*taskKey="com.javarush.task.task08.task0814"\n\nБольше 10? Вы нам не подходите
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
Требования:
1.	Программа не должна выводить текст на экран.
2.	Программа не должна считывать значения с клавиатуры.
3.	Класс Solution должен содержать только три метода.
4.	Метод createSet() должен создавать и возвращать множество HashSet состоящих из 20 различных чисел.
5.	Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.*/
public class task02 {
    public static Set<Integer> createSet() {
        Set<Integer> integerSet = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            integerSet.add(i + 1);
        }
        return integerSet;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            if (iterator.next() > 10) iterator.remove();
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
