package javarush.JavaSyntax.lvl9.lec11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*taskKey="com.javarush.task.task09.task0923"\n\nГласные и согласные
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы из введённой строки.
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
Требования:
1.	Программа должна считывать данные с клавиатуры.
2.	Программа должна выводить две строки.
3.	Первая строка должна содержать только гласные буквы из введенной строки, разделенные пробелом.
4.	Вторая строка должна содержать только согласные и знаки препинания из введенной строки, разделенные пробелом.
5.	Каждая строка должна заканчиваться пробелом.*/
public class task05 {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String phrase = bf.readLine().replace(" ", "");
        ArrayList<String> consonant = new ArrayList<String>();
        ArrayList<String> vowels = new ArrayList<String>();
        char[] charArr = phrase.toCharArray();
        for (char c : charArr) {
            if (c != ' ') {
                if (isVowel(c)) {
                    vowels.add(c + " ");
                } else consonant.add(c + " ");
            }
        }
        for (String s : vowels) {
            System.out.print(s);
        }
        System.out.println();

        for (String s : consonant) {
            System.out.print(s);
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}
