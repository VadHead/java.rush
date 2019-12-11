package javarush.lvl8.lec08;
import java.util.*;
/*taskKey="com.javarush.task.task08.task0813"\n\n20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
Требования:
1.	Не изменяй заголовок метода createSet().
2.	Программа не должна выводить текст на экран.
3.	Программа не должна считывать значения с клавиатуры.
4.	Метод createSet() должен создавать и возвращать множество (реализация HashSet).
5.	Множество из метода createSet() должно содержать 20 слов на букву &laquo;Л&raquo;.*/
public class task01 {
    public static Set<String> createSet() {
        Set<String> wordsSet = new HashSet<String>();
        wordsSet.add("Лол");
        wordsSet.add("Лак");
        wordsSet.add("Люк");
        wordsSet.add("Лук");
        wordsSet.add("Лик");
        wordsSet.add("Лифт");
        wordsSet.add("Лист");
        wordsSet.add("Ласты");
        wordsSet.add("Лекарь");
        wordsSet.add("Лофт");
        wordsSet.add("Лимон");
        wordsSet.add("Лайм");
        wordsSet.add("Лама");
        wordsSet.add("Лампа");
        wordsSet.add("Локомотив");
        wordsSet.add("Ласточка");
        wordsSet.add("Лилия");
        wordsSet.add("Лампадка");
        wordsSet.add("Ломтик");
        wordsSet.add("Локоть");
        return wordsSet;
    }
    public static void main(String[] args) {
        System.out.println(createSet().toString());
    }
}
